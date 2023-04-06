package CollectionFrameWork;

public class SoccerPlayer {
	// 축구선수의 정보를 저장하는 클래스 : 축구선수 데이터저장 -> 인스턴스 생성
	
		
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
		
			// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		
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
		public String toString() {
			return "SoccerPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
		}

		public void showInfo() {
			System.out.printf("[%s] %s(%d, %d)\n", this.team, this.name, this.number, this.age);
		}
		
	}

