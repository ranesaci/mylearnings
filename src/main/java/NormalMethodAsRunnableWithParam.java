import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class NormalMethodAsRunnableWithParam {
	Map<String, Consumer<Double>> map = new HashMap<>();
	
	public NormalMethodAsRunnableWithParam() {
		map.put("Pune", this::getDetailsOfPune);
		map.put("Mumbai", this::getDetailsOfMumbai);
	}
	
	public void process(String str, double amount) {
		Consumer<Double> consumerInstance = map.getOrDefault(str, this::getDefault);
		consumerInstance.accept(amount);
	}
	public void getDetailsOfPune(double amount) {
		System.out.println("details of pune with cost Rs. : "+ amount);
	}
	
	public void getDetailsOfMumbai(double amount) {
		System.out.println("details of Mumbai with cost Rs. : "+ amount);
	}
	public void getDefault(double amount) {
		System.out.println("details of Default  with cost Rs. : "+ amount);
	}
	
	public static void main(String args[]) {
		new NormalMethodAsRunnableWithParam().process("Pune", 200);
		new NormalMethodAsRunnableWithParam().process("XYZ", 200);
	}
}
