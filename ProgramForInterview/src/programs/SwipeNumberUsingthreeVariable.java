package programs;

public class SwipeNumberUsingthreeVariable {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=0;
		
		System.out.println(" Before swipe " +a+"<===>"+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swipe"+a+"<===>"+b);

	}

}
