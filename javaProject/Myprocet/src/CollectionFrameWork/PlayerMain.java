package CollectionFrameWork;

import java.util.HashSet;

public class PlayerMain {

	public static void main(String[] args) {
		
		HashSet<Player> players = new HashSet<>();
		
		players.add(new Player("토트넘", "손흥민", 30, 7));
		players.add(new Player("마요르카", "이강인", 23, 19));
		players.add(new Player("나폴리", "김민재", 28, 3));
		players.add(new Player("토트넘", "손흥민", 30, 7));
		
		
		
		for(Player player : players) {
			System.out.println(player);
		}
	}

}
