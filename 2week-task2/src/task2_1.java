import java.util.Scanner;

public class task2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("연산>>");
		double n1=scan.nextDouble();
		String op=scan.next();
		double n2=scan.nextDouble();
		
		double result=0;
		
		if(op.equals("+"))
			result=n1+n2;
		else if(op.equals("-"))
			result=n1-n2;
		else if(op.equals("*"))
			result=n1*n2;
		else if(op.equals("/"))
		{
			if(n2==0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
				scan.close();
				return;
			}
			else
				result=n1/n2;
		}
		
		System.out.println(n1+op+n2+"의 계산결과는"+result);
		scan.close();
	}

}
