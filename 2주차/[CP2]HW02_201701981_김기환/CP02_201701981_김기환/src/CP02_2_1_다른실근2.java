
public class CP02_2_1_다른실근2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double determinant;
		double x1;
		double x2;
		
		a = 1; 
		b = 8;
		c = 12;
		
		determinant = b*b-4*a*c;
		System.out.println("<서로 다른 실근이 존재하는 경우>");
		System.out.println("a = " + a + " b = "+ b +" c = " + c );
		x1 = (-b + Math.sqrt(determinant))/(2.0*a);
		x2 = (-b - Math.sqrt(determinant))/(2.0*a);
		System.out.println("The solution is " + x1 + " or " + x2);
		
	}

}
