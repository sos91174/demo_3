package demo_3;

public class anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p = new Phone();
//		p = null;
		System.out.println(p);
		
		p.sendEmail();
		p.playGame();
			
		//匿名對象
//		new Phone().sendEmail();
//		new Phone().playGame();
		
		new Phone().price = 22888;
		new Phone().showPrice();//0.0
		
		//**********************************
		PhoneMall mall = new PhoneMall();
//		mall.show(p);
		//匿名對象的使用
		mall.show(new Phone());		
	}
}

class PhoneMall{
	
	
	public void show(Phone phone){
		phone.sendEmail();
		phone.playGame();
	}
	
}


class Phone{
	double price;
	
	public void sendEmail(){
		System.out.println("寄送Email");
	}
	
	public void playGame(){
		System.out.println("玩遊戲");
	}
	
	public void showPrice(){
		System.out.println("價格為：" + price);
	}
	
}

