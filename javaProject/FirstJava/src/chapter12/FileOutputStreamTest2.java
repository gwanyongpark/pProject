package chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {
	
	public static void main(String[] args) {
		
		try {
			OutputStream fout = new FileOutputStream("D:\\Test\\test1.txt");
			
			String str = "Hi";
			byte[] arr = str.getBytes(); // String 클래스에서 뮨자열의 byte 배열을 반환
			
			fout.write(arr);
			
			fout.close(); // !!!!i/o 에서는 스트림 사용 후 반드시 닫아준다!!!!
			System.out.println("파일에 데이터 쓰기 성공");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
