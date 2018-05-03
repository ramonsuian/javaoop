package java04;

public class LogicDemo {
	public static void main(String[] args) {
		System.out.println(true);
		System.out.println(!true);
     //&逻辑与 and  前面执行，后面还是会执行。
		int a = 10;
		int b = 20;
		if (++a == 12 & ++b == 22) {
			System.out.println("执行了.");
		}
		System.out.println(a + " " + b);
       // &&短路语  前面短路，后面不执行了。
		a = 10;
		b = 20;
		if (++a == 12 && ++b == 22) {
			System.out.println("执行了.");
			
		}
		System.out.println(a + " " + b);
	
	
	
	a = 10;
	b = 20;
	if (++a == 10 || ++b == 22) {
		System.out.println("执行了.");
		
	}
	System.out.println(a + " " + b);
}
 
  

	
     
	
	
	
	
	
	
	
	
	
	
	
}
