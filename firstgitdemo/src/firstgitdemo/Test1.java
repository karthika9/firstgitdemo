package firstgitdemo;

public class Test1 {

	public static void main(String[] args) {
		int num1=1;
		int num2 = 1;
		int sum = 0;
		System.out.print(num1 +" "+ num2);
		for(int i=2;i<=10;i++) {
			sum= num1 + num2;
			num1=num2;
			num2=sum;
			System.out.print(" " +sum);
			System.out.print("sum");
	}

}
}
