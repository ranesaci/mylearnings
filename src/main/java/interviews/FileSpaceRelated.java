package interviews;

import java.io.File;

import org.junit.Test;

/**
* @author sachin
* @date 10-Sep-2021
*/

public class FileSpaceRelated {
	
	@Test 
	public void testFileSpace() {
	
		File[] drives = File.listRoots();
		System.out.println("size:"+drives.length);
		for (File file : drives) {
			System.out.println(file.getName());
			System.out.println(file.getFreeSpace()/(1024*1024*1024) + " GB");
		}
	}

}


