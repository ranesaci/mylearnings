package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

/**
* @author sachin
* @date 17-Oct-2021
*/

public class LoyLogic {

	public static void main(String[] args) {
		
//		List<String> list = extractData(data, 2);
//		list.forEach(System.out::println);
		
		List<String> list = extractDataUsingDoubleEndedQueue(data, 2);
		list.forEach(System.out::println);
		System.out.println();
		//System.out.println("12345".indexOf('8'));
		
		
	}
	
	/*
	 * public static List<String> extract(String treeString, int level) { String[]
	 * nodes = treeString.split("\n");
	 * 
	 * // Trim off whitespaces on all elements for (int i = 0; i < nodes.length;
	 * i++) { nodes[i] = nodes[i].trim(); } System.out.println(nodes); List<String>
	 * nodePaths = new ArrayList<>(); Stack<String> stack = new Stack<>();
	 * 
	 * Map<Integer, ArrayList<String>> map = new
	 * HashMap<Integer,ArrayList<String>>(); Integer count =0; for (int i = 0; i <
	 * nodes.length; i++) { if (nodes[i].startsWith("{") && !nodes[i].endsWith("}"))
	 * { stack.push(nodes[i].substring(1)); ArrayList<String> list = new
	 * ArrayList<String>(); list.add(nodes[i].substring(1)); count = count +1;
	 * map.put(count, list); } else if (nodes[i].startsWith("(") &&
	 * nodes[i].endsWith(")")) { stack.push(nodes[i].substring(1, (nodes[i].length()
	 * - 1))); String nodePath = ""; Iterator<String> iterator = stack.iterator();
	 * while (iterator.hasNext()) { String value = iterator.next(); nodePath +=
	 * nodePath.equals("") ? value : "/" + value; } stack.pop(); ArrayList<String>
	 * list = map.get(count); list.add(nodePath); map.put(count,list);
	 * nodePaths.add(nodePath); } else if (nodes[i].equals(")")) { stack.pop(); } }
	 * 
	 * //nodePaths.forEach(System.out::println); //System.out.println(map); return
	 * map.get(level); }
	 * 
	 * 
	 */
	
	private static List<String> extractDataUsingDoubleEndedQueue(String data, int level) {
		
		Deque<Character> deque = new LinkedList<Character>();
		Map<Integer, List<String>> resultMap = new HashMap<Integer, List<String>>();
		recirsiveFind(deque, resultMap, data);
		return resultMap.get(level).stream().filter(str -> !str.isBlank()).
				map(str -> str.trim()).collect(Collectors.toList());
	}

	private static void recirsiveFind(Deque<Character> deque, Map<Integer, List<String>> resultMap, String str) {
		if (str.isBlank() || str.isEmpty()) {
			return ;
		}
		
		if (deque.size() == 0) {
			int openingIndex = str.indexOf('{');
			deque.addFirst('{');
			str = str.substring(openingIndex+1);
			
		}
		int opening = str.indexOf('{');
		int closing = str.indexOf('}');
		
		if (opening == -1 && closing == -1) {
			return;
		}
		if (resultMap.get(deque.size()) == null) {
			resultMap.put(deque.size(), new ArrayList<String>());
		}
		if (opening < closing && opening != -1) {
			
			resultMap.get(deque.size()).add(str.substring(0, opening));
			deque.addLast('{');
			
			recirsiveFind(deque, resultMap, str.substring(opening+1));
		} else if (closing != -1) {
			resultMap.get(deque.size()).add(str.substring(0, closing));
			deque.removeLast();
			recirsiveFind(deque, resultMap, str.substring(closing+1));
		}
		
		
	}

	private static List<String> extractData(String hierarchicalData, int level) {
		Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
		String strCopy = hierarchicalData;
		strCopy = strCopy.replace("{", "");
		strCopy = strCopy.replace("}", "");
		//System.out.println(strCopy);
		String[] arr = strCopy.split("\\n");
		//System.out.println(Arrays.toString(arr));
		
		for (String string : arr) {
			if (!string.equals("") || !string.matches("\\S+")) {
				int count = 0;
				char[] chars =  string.toCharArray();
				for (char char1 : chars) {
					count++;
					if (char1 != ' ') {
						break;
					}
				}
				count--;
				if (map.get(count/4) == null) {
					map.put(count/4, new ArrayList<String>());
				}
				map.get(count/4).add(string.trim());
				
			}
			
		}
		
		return map.get(level).stream().filter(str -> !str.isBlank()).collect(Collectors.toList());
	}





	public static final String data = "{\n"
			+ "    Money Heist Info\n"
			+ "    {\n"
			+ "        The most important character is the Professor\n"
			+ "    }\n"
			+ "    {\n"
			+ "        Another character is that of Berlin\n"
			+ "        {\n"
			+ "            Berlin is in charge of the money heist\n"
			+ "        }\n"
			+ "    }\n"
			+ "    {\n"
			+ "        Another character is that of Moscow\n"
			+ "        {\n"
			+ "            Moscow is Denver's dad\n"
			+ "        }\n"
			+ "    }\n"
			+ "    {\n"
			+ "        Another character is that of Rio\n"
			+ "        {\n"
			+ "            Rio is a programmer\n"
			+ "            {\n"
			+ "                Rio is also a decent hacker\n"
			+ "                {\n"
			+ "                    Rio is quite happy to be a part of the heist\n"
			+ "                }\n"
			+ "            }\n"
			+ "        }\n"
			+ "    }\n"
			+ "    {\n"
			+ "        Another character is that of Denver\n"
			+ "    }\n"
			+ "}\n"
			+ ""; 

}


