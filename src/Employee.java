
public class Employee extends Thread {

	private int eno;
	private String ename;
	private int basicsalary;
	

	
	public Employee(int eno, String ename, int basicsalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.basicsalary = basicsalary;
	}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(int basicsalary) {
		this.basicsalary = basicsalary;
	}

	@Override
	public void run() {
		double HRA=this.basicsalary*0.1;
		double DA=this.basicsalary*0.25;
		double CA=this.basicsalary*0.10;
		
		
		System.out.println(""+Thread.currentThread().getName()+" HRA="+HRA);
		System.out.println(""+Thread.currentThread().getName()+" DA="+DA);
		System.out.println(""+Thread.currentThread().getName()+" CA="+CA);
		
	}
	
	
}
