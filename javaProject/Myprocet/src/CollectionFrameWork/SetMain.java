package CollectionFrameWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import CollectionFrameWork.SoccerPlayer;


public class SetMain {

	public static void main(String[] args) {
		
		// 나의 팀을 구성하고 싶다 -> 선수들을 저장할 수 있는 공간을 생성하고 선수들을 저장
		ArrayList<SoccerPlayer> myTeam = new ArrayList<SoccerPlayer>();
	//	Set<SoocerPlayer> myTeam = new HashSet<>();
		
		myTeam.add(new SoccerPlayer("손흥민", 7, "토트넘", 30));
		myTeam.add(new SoccerPlayer("이강인", 19, "마요르카", 23));
		myTeam.add(new SoccerPlayer("박지성", 7, "맨유", 40));
		
		System.out.println("나의 팀 선수 정보");
//		for(SoccerPlayer player : myTeam) {
//			player.showInfo();
//		}
		
		myTeam.stream().forEach((SoccerPlayer p) -> p.showInfo());
		
		myTeam.stream().forEach(System.out::println);
		
	}

}
