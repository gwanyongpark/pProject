package CollectionFrameWork;

public class InterfaceImpl<P1, P2, P3, P4> implements Interface<P1, P2, P3, P4> {

	@Override
	public P1 method1(P1 p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public P2 method2(P2 p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public P3 method3(P3 p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public P4 method4(P4 p) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		InterfaceImpl<String, Integer> my = null;
		
		my = new InterfaceImpl();
		System.out.println(my.method1("손흥민", "토트넘", 29));
		System.out.println(my.method2("이강인", "마요르카", 23));
		System.out.println(my.method1("백승호", "전북", 24));
		System.out.println(my.method1("조규성", "전북", 28));
	}
	

}
