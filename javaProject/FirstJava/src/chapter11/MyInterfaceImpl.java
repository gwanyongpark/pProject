package chapter11;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		// TODO Auto-generated method stub
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		// TODO Auto-generated method stub
		return t;
	}
	
	public static void main(String[] args) {
		
		MyInterfaceImpl<String, Integer> my = null;  // my <- 지역변수
	//	my = new MyInterfaceImpl<String, Integer>();
		my = new MyInterfaceImpl(); // <String, Integer> 생략 가능
		
		System.out.println(my.method1("Ten"));
		System.out.println(my.method2(10));
	}

}

