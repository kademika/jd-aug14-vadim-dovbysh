package day4;

public class user {
	public static void main(String[] args){
	CurrentUser currentUser = new CurrentUser();

	currentUser.age = 18;
	currentUser.firstName = "Vania";
	currentUser.lastName = "Petrov";
	String name = currentUser.firstName +" "+ currentUser.lastName;
	
	System.out.println(currentUser.say() + " " + name);
		
		
	}
	
}
	
	 class CurrentUser {
	    int age;//����
	    String firstName;//����
	    String lastName;//����
	    String say() {//�����
	            return "I am  " + firstName + " " + lastName;
	    }
	}


