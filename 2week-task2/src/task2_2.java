import java.util.Scanner;

public class task2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("연산>>");
		double n1=scan.nextDouble();
		String op=scan.next();
		double n2=scan.nextDouble();
		
		double result=0;
		
		switch(op)
		{
			case "+":
				result=n1+n2;
				break;
			case "-":
				result=n1-n2;
				break;
			case "*":
				result=n1*n2;
				break;
			case "/":
				if(n2==0)
				{
					System.out.println("0으로 나눌 수 없습니다.");
					scan.close();
				}
				result=n1/n2;
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				scan.close();
				break;
		}
		System.out.println(n1+op+n2+"의 계산 결과는 "+result);
		scan.close();
	}

}
