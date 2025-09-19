import java.util.HashMap;
import java.util.Map;

public class NormalMethodAsRunnable {
	Map<String, Runnable> map = new HashMap<>();
	
	public NormalMethodAsRunnable() {
		map.put("Pune", this::getDetailsOfPune);
		map.put("Mumbai", this::getDetailsOfMumbai);
	}
	
	public void process(String str) {
		Runnable runInstance = map.getOrDefault(str, this::getDefault);
		runInstance.run();
	}
	public void getDetailsOfPune() {
		System.out.println("details of pune");
	}
	
	public void getDetailsOfMumbai() {
		System.out.println("details of Mumbai");
	}
	public void getDefault() {
		System.out.println("details of Default");
	}
	
	public static void main(String args[]) {
		new NormalMethodAsRunnable().process("Pune");
		new NormalMethodAsRunnable().process("XYZ");
	}
}
