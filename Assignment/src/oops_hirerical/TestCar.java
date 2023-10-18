package oops_hirerical;

public class TestCar {
	public static void main(String[] args) {
		System.out.println("=============================");
		System.out.println("Low Budget Car Details :");
		System.out.println();		
		Low l=new Low(1000,"Alto","Petrol",40);
		l.description();
		System.out.println("-----------------------------");
		System.out.println("Medium Budget Car Details :");
		System.out.println();		
		Level lv=new Level(1500,"Balenoo","Petrol",13);
		lv.description();
		System.out.println("-----------------------------");
		System.out.println("High Budget Car Details :");
		System.out.println();		
		High h=new High(2000,"Audi","Petrol",15);
		h.description();
		System.out.println("=============================");
	}
}
