
public class Runnable_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 e1=new Employee1(101,"Anuj",20000);
		Employee1 e2=new Employee1(102,"Aman",30000);
		Employee1 e3=new Employee1(103,"Rupal",40000);
		Employee1 e4=new Employee1(104,"Phase",50000);
		Employee1 e5=new Employee1(105,"Mansi",60000);
		
		Thread t1= new Thread(e1);
		Thread t2= new Thread(e2);
		Thread t3= new Thread(e3);
		Thread t4= new Thread(e4);
		Thread t5= new Thread(e5);
		
		t1.start();
		t2.start();
		t3.start();
		t5.start();
		t4.start();
	}

}
