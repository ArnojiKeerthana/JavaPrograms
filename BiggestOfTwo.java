import java.util.Scanner;
public class BiggestOfTwo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a>b)
			System.out.println(a+ "is biggest");
		else if (b>a)
			System.out.println(b+ "is biggest");
		else
			System.out.println("Both are equal");
		}
}  