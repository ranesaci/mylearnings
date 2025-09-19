import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDataWithLowSpaceComplexity {

	public static void main(String[] args) {
		List<User> usersData = Arrays.asList( new User("Sachin", Status.ACTIVE),new User("Sachin2", Status.INACTIVE),
			    new User("Sachin3", Status.ACTIVE), new User("Sachin4", Status.INACTIVE));
		usersData = new ArrayList<>(usersData);
		List<User> activeUsers = usersData.stream().filter(u -> u.getStatus() == Status.ACTIVE).collect(Collectors.toList());
		System.out.println("ACTIVEUSERs with stream with time an space comoplexity as n");
		activeUsers.forEach(System.out::println);
		System.out.println();
		System.out.println("Active users with time complexity O(n) and space complexity as O(1)");
		int writeIndex=0;
		for (int readIndex = 0; readIndex < usersData.size(); readIndex++) {
			if (usersData.get(readIndex).getStatus() == Status.ACTIVE) {
				usersData.set(writeIndex, usersData.get(readIndex));
				writeIndex++;
			}
		}//end for
		while (writeIndex < usersData.size()) {
			usersData.remove(usersData.size()-1);
		}
		usersData.stream().forEach(System.out::println);
	}
	static enum Status { ACTIVE, INACTIVE }
	static class User {
	    private String name;
	    private Status status;

	    public User(String name, Status status) {
	        this.name = name;
	        this.status = status;
	    }

	    public Status getStatus() { return status; }

	    @Override
	    public String toString() {
	        return name + "(" + status + ")";
	    }
	}

}
