package test.domain;

public class TestDTO {
	private int pno;
	private String pname;
	private String duedate;
	private boolean finished;
	
	public TestDTO () {
		
	}

	public TestDTO(int pno, String pname, String duedate, boolean finished) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.duedate = duedate;
		this.finished = finished;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public String toString() {
		return "TestDTO [pno=" + pno + ", pname=" + pname + ", duedate=" + duedate + ", finished=" + finished + "]";
	}
	
	
	

}
