
public class JunitTesting {
	
	public String addStrings(String a,String b){
		String res=a+" "+b;
		return res;
		
	}
	public int addNumbers(int a ,int b) {
		int res=a+b;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JunitTesting obj =new JunitTesting();
		String string_addition_result=obj.addStrings("mudassir","ali");
		int numbers_addition_result=obj.addNumbers(10, 20);
		System.out.println(string_addition_result);
		System.out.println(numbers_addition_result);
		
		

	}

}
