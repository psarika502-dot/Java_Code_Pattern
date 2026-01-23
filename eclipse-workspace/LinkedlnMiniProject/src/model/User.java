package model;
import java.util.ArrayList;

public class User extends Person{
	private String userName;
	private String userPassword;
	private Profile profile; //has-a relationship
	private ArrayList<User> connection;
	
	//constructor intialized
	public User(String userName,String userPassword,String name,String email,String phone) {
		super(name,email,phone);
		this.userName= userName;
		this.userPassword= userPassword;
		connection =new ArrayList<>();
	}
	
	//getter method
	public String getUserName() {
		return this.userName;
	}
	public String getUserPassword() {
		return this.userPassword;
	}
	
	//setter method
	public void setUserPassword(String userPassword) {
		this.userPassword=userPassword;
	}
	
	//method to cerate a profile
	public void setProfile(Profile profile) {
		this.profile=profile;
	}
	public Profile getProfile() {
		return this.profile;
	}
	 //method to add connection
	public void addConnection(User user) {
		//check user is already exist or not
		if(connection.contains(user)) {
			System.out.println("Already Connected");
		}
		else {
			connection.add(user);
			System.out.println("COnnection added with "+ user.getUserName());
		}
	}
	//
	public void viewConnection() {
		if(connection.isEmpty()) {
			System.out.println("Not Yet");
			
		}
		else {
			System.out.println("Your connection");
			for(User u: connection) {
				System.out.println(u.getUserName()+ ", ");
			}
		}
	}
	
	//method display all details
	public void displayBasicInfo() {
		System.out.println("Name :"+this.getName());
		System.out.println("Email :"+this.getEmail());
		System.out.println("Phone :"+this.getPhone());
		System.out.println("User Name :"+this.getUserName());
		System.out.println("===PROFILE===");
		if(this.profile !=null) {
			this.profile.displayProfile();

		}
		else {
			System.out.println("Profile Not Found");
		}
			}
	

}
