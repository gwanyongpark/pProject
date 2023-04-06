package chapter11;

import java.util.HashMap;
import java.util.Set;

public class SmartPhoneHashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, SmartPhone> hashMap = new HashMap<>();
		
		SmartPhone p = new SmartPhone("Spring", "010-1111-2222");
		hashMap.put("ver", p);
		
		SmartPhone p2 = new SmartPhone("SON", "010-1111-2222");
		hashMap.put("programName", p2);
		
		
		// 중복 X ~> 두개의 키를 유지 X
		// 마지막에 저장된 p로 ! 
		
		
		System.out.println(hashMap.get("ver"));
		System.out.println(hashMap.get("programName")); // key 값이 존재하지 않으면 null이 나옴
		
		
		System.out.println("===================================================");
		Set<String> keySet = hashMap.keySet();
		for(String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName));
		}

	}
	

}
