package co.micol.prj.member;

import java.util.Scanner;

public class ForTest {
	private int first;
	private int second;
	
	public ForTest() {
		
	}
	
	private void getSum() {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��ϼ���: ");
		first = scn.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���: ");
		second = scn.nextInt();
		
		int sum = 0;
		for(int i = first; i <= second ; i++) {
			sum += i;
		}
		System.out.printf("%d���� %d������ �� : %d" , first, second, sum);
	}
	
	public void run() {
		getSum();
	}
}
