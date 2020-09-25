package Sample;

public class SampleDemo {

	public void m1() { //method declaration //instance method
		//method body
	System.out.println("business logic");
	}
	
	void m2() { //instance metod
	m1();
	m3();	
		
	}
	
	static void m3() {
		SampleDemo va= new SampleDemo();
		va.m1();
	}
	public static void main(String[] args) {
		SampleDemo va= new SampleDemo();
		va.m1();
		m3();
		va.m3();
		SampleDemo.m3();
	}

}
