package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest2 {
	
	public static void main(String[] args) {
		
		ObjectInputStream inputStream = null;
		
		try {
			FileInputStream in = new FileInputStream("instanceData.ser");
			
			try {
				inputStream = new ObjectInputStream(in);
				
				try {
					Person p = (Person) inputStream.readObject();
					String newStr = (String) inputStream.readObject();
				//	Person p = (Person) inputStream.readObject(); <~ 순서 지켜서 작성해야 함.
					
					p.tell();
					System.out.println(newStr);
					
					
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
