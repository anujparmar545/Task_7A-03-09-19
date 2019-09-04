
public class ThreadImplemention {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(101,"Anuj",20000);
		Employee e2=new Employee(102,"Aman",30000);
		Employee e3=new Employee(103,"Rupal",40000);
		Employee e4=new Employee(104,"Phase",50000);
		Employee e5=new Employee(105,"Mansi",60000);

		e1.start();
		e2.start();
		e3.start();
		e4.start();
		e5.start();
	}

}
