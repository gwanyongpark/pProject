package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class FootballPlayer {
	
	String name;
	int number;
	String team;
	int age;

		// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
	
	public static void main(String[] args) {
		
		List<FootballPlayer> players = new ArrayList();
		
		FootballPlayer footballPlayer1 =  new FootballPlayer();
		FootballPlayer footballPlayer2 =  new FootballPlayer();
		FootballPlayer footballPlayer3 =  new FootballPlayer();
		FootballPlayer footballPlayer4 =  new FootballPlayer();
		
		// 손흥민 이강인 백승호 조규성
		footballPlayer1.name = "손흥민";
		footballPlayer1.number = 7;
		footballPlayer1.team = "토트넘";
		footballPlayer1.age = 29;
		
		footballPlayer2.name = "이강인";
		footballPlayer2.number = 19;
		footballPlayer2.team = "마요르카";
		footballPlayer2.age = 23;
		
		footballPlayer3.name = "백승호";
		footballPlayer3.number = 5;
		footballPlayer3.team = "전북현대";
		footballPlayer3.age = 24;
		
		footballPlayer4.name = "조규성";
		footballPlayer4.number = 11;
		footballPlayer4.team = "전북현대";
		footballPlayer4.age = 28;
		
		players.add(footballPlayer1);
		players.add(footballPlayer2);
		players.add(footballPlayer3);
		players.add(footballPlayer4);

		System.out.println(players.get(0).name + players.get(0).number + players.get(0).team + players.get(0).age);
		System.out.println(players.get(1).name + players.get(1).number + players.get(1).team + players.get(1).age);
		System.out.println(players.get(2).name + players.get(2).number + players.get(2).team + players.get(2).age);
		System.out.println(players.get(3).name + players.get(3).number + players.get(3).team + players.get(3).age);
		

		
		// 2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 
		// 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 

		
		
		
		
	
	
	
	
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
}
