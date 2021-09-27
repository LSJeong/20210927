package co.micol.prj;

public class CompareMax { //전달받은 두수에서 큰값을 리턴한다.
	private int n;
	private int m;
	
	public CompareMax(int n, int m) { //생성자
		this.n = n;
		this.m = m;
	}
	
	
	public int getMax() {
		int max = 0; // 두수가 같을때는 0을 리턴한다.
		if(n > m) {
			max = n;
		}else if(n < m) {
			max = m;
		}		
		return max;
	}
}
