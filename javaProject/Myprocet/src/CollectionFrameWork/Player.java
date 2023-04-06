package CollectionFrameWork;

public class Player {
	
	String team;
	String name;
	int age;
	int number;
	
	public Player(String team, String name, int age, int number) {
		this.team = team;
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	public Player() {
		
	}
	
	
	
		public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

		@Override
	public String toString() {
		return "Player [team=" + team + ", name=" + name + ", age=" + age + ", number=" + number + "]";
	}
	

	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

}
