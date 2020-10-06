package demo_3;

public class SingletonTest1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		
		System.out.println(bank1 == bank2);
	}
}


	class Bank{
	
	
	private Bank(){
		
	}
	

	private static Bank instance = new Bank();
	
	
	public static Bank getInstance(){
		return instance;
	}
}