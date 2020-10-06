package demo_3;



public class Person {
	
	
	String name;
	int age;
	int sex; //假設0為女 1為男
	
	public void study(){
		System.out.println("JAVA");
	}
	
	public void showAge(){
		System.out.println("age:" + age);
	}
	
	
	//原本的age 加上你要給他的值
	public int addAge(int i){
		age += i;
		return age;
	}
	

}
