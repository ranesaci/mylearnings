package interviews;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class LinkedListInterctionByBPCompany {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
		/*
		 * InputStreamReader reader = new InputStreamReader(System.in,
		 * StandardCharsets.UTF_8); BufferedReader in = new BufferedReader(reader);
		 */
    List<String> lines = Arrays.asList(new String[] {
    		"a->b",
    		"r->s",
    		"b->c",
    		"x->c",
    		"q->r",
    		"y->x",
    		"w->z",
    		"a,q,w",
    		"a,c,r",
    		"y,z,a,r",
    		"a,w"
    });
    List<List<String>> lists = new LinkedList<>();
    Map<String, String> inputMap = new HashMap<>();
    
     for(String line : lines) {
      if (line.contains("->")) {
			inputMap.put(line.split("->")[0], line.split("->")[1]);
	  } else {
        String[] graphs = line.split(",");
         List<String> subList = new LinkedList<>();
        for (String e : graphs) {
			subList.add(e);
		}
        lists.add(subList);
      }
       
    }
    
    
    //read the node inputs and create list
    for(List<String> strList : lists) {
      //iterate use cases
      List<String> nodesConnectedList = new ArrayList<>();
      for(String element : strList) {
    	  //find element connected nodes
          StringBuilder sb = new StringBuilder();
          sb.append(element);
          
          String next = inputMap.get(element);
          while ( next != null) {
        	  
        	  if (inputMap.containsKey(element) ) {
            	  sb.append(next);
            	  next = inputMap.get(next);
              }
          }
          nodesConnectedList.add(sb.toString());
          
        }
      
      //check for given strings if any intersections
      boolean dulicates = false;
      for(int i = 0; i < nodesConnectedList.size(); i++) {
    	  String str = nodesConnectedList.get(i);
    	  char[] strArr = str.toCharArray();
    	  for(char searchChar: strArr ) {
    		  for (int j=0; j< nodesConnectedList.size(); j++) {
        		  if (i==j) {
        			  continue;
        		  }
        		  for(char matchingCharFor: nodesConnectedList.get(j).toCharArray())  {
        			  if (searchChar == matchingCharFor) {
        				  dulicates = true;
        			  }
        		  }
        	  }
    		  
    	  }
    	  
    	  
      }
      
      if (dulicates) {
    	  System.out.println("True");
      }else {
    	  System.out.println("False");
      }
      
    }
    
    
  }
}
