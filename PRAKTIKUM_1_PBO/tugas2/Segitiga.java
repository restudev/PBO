public class Segitiga{
public static void main(String args[])
{
	int a, b;
	a=5;
	b=12;
	double luas= 0.5*a*b;
	double c = Math.sqrt((a*a)+(b*b));
	double kel= a + b + c;
	System.out.println("sisi alas (a)		: " +a);
	System.out.println("sisi tinggi (b)		: " +b);
	System.out.println("sisi miring (c)		: " +c);
	System.out.println("Luas Segitiga		: " +luas);
	System.out.println("Keliling Segitiga	: " +kel);
}
}
