package co.micol.prj.member;

import java.util.Scanner;

public class ForTest {
	private int first;
	private int second;
	
	public ForTest() {
		
	}
	
	private void getSum() {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요: ");
		first = scn.nextInt();
		System.out.println("두번째 수를 입력하세요: ");
		second = scn.nextInt();
		
		int sum = 0;
		for(int i = first; i <= second ; i++) {
			sum += i;
		}
		System.out.printf("%d에서 %d까지의 합 : %d" , first, second, sum);
	}
	
	public void run() {
		getSum();
	}
}
