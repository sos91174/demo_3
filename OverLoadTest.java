package demo_3;



public class OverLoadTest {
	public static void main(String[] args) {
		
		OverLoadTest test = new OverLoadTest();
		test.getSum(1,2);
		
	//  重載（overload）	
	}
	
	//以下都是重載
	public void getSum(int i,int j){
		System.out.println("1");
	}
	
	public void getSum(double d1,double d2){
		System.out.println("2");
	}
	
	public void getSum(String s ,int i){
		System.out.println("3");
	}
	
	public void getSum(int i,String s){
		System.out.println("4");
	}
	
	//以下都不是重載 只是改void變int 重載是要改變參數(int i,int j)
//	public int getSum(int i,int j){
//		return 0;
//	}
	//只是改 參數內的 變數名字  參數本身沒變動
//	public void getSum(int m,int n){
//		
//	}
	//只是改public變private
//	private void getSum(int i,int j){
//		
//	}
	
	
}
