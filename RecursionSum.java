package demo_3;

public class RecursionSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//一般總和都是用for
		int forsum = 0;
		for(int i = 1;i <= 100;i++) {
			forsum += i;
		}
		System.out.println(forsum);
		
		//遞歸加法
		RecursionSum sum = new RecursionSum();
		
		System.out.println(sum.getSum(100));
		
		//也可以用變數接值sum.getSum()
		int total = sum.getSum(100);
		System.out.println(total);
		
		//==========================
		
	
	}
		
	//遞歸加總 算法
	public int getSum(int i) {
		
		if(i == 1) {
			return 1;
		}else {
			return i + getSum(i-1);//getSum(i-1)這邊又呼叫getSum()
		}
	}	
		
		
	
	
	

}
