package demo_3;

public class SingletonTest2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Order order1 = Order.getInstance();
		Order order2 = Order.getInstance();
		
		System.out.println(order1 == order2);
		
	}
}

	class Order{
	
	
	private Order(){
		
	}
	
	
	private static Order instance = null;
	
	
	public static Order getInstance(){
		
		if(instance == null){
			
			instance = new Order();
			
		}
		return instance;
	}
	
}