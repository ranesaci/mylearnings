package interviews;

/**
* @author sachin
* @date 03-Sep-2021
*/

public class HashCodeAndEquals {
	
	int rollNumber;
	String name;
	
	@Override
	public int hashCode() {
		
		int prime = 31;
		int result = 1;
		
		result = prime * result + this.rollNumber;
		result = prime * result + this.name.hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (null == obj || getClass() != obj.getClass()) {
			return false;
		}

		HashCodeAndEquals hashCodeAndEquals = (HashCodeAndEquals) obj;

		if (this.rollNumber != hashCodeAndEquals.rollNumber) {
			return false;
		}

		// for String attributes
		if (null == this.name) {
			if (null != hashCodeAndEquals.name) {
				return false;
			}
		} else if (this.name.equals(hashCodeAndEquals.name)) {
			return false;
		}

		return true;
	}

}


