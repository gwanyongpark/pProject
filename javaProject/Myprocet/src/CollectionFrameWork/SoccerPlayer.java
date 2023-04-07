package CollectionFrameWork;

//축구선수의 정보를 저장하는 클래스 : 축구선수 데이터저장 -> 인스턴스 생성 -> 배열 -> List
public class SoccerPlayer implements Comparable<SoccerPlayer>{
	
	private String name;
	private int number;
	private String team;
	private int age;
	
	public SoccerPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public SoccerPlayer() {
		// 기본생성자 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		if(obj != null && obj instanceof SoccerPlayer)	{
			SoccerPlayer player = (SoccerPlayer)obj;
			result = this.team.equals(player.getTeam()) 
					&& this.name.equals(player.getName()) 
					&& this.age==player.getAge();
		}
		
		return result;
	}
	
	
	
	

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}
	
	public void showInfo() {
		System.out.printf("[%s] %s(%d, %d)\n", this.team, this.name, this.number, this.age);
	}

	@Override
	public int compareTo(SoccerPlayer o) {
		
		int compare = this.team.compareTo(o.getTeam());
		
		if(compare == 0) {
			compare = this.name.compareTo(o.getName());
			
			if(compare == 0) {
				compare = this.number - o.getNumber();
				//compare = Integer.compare(this.number, o.getNumber());
			}
		}
		return compare;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

