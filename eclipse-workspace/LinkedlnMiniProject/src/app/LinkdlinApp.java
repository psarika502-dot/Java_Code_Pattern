package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.Profile;
import model.User;

public class LinkdlinApp {
	static ArrayList<User>users=new ArrayList();
	static Scanner read= new Scanner(System.in);
	public static void main(String []args) {
		
		
		while(true) {
		//menu driven app
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Exist");
		System.out.println("Choose Any Option : ");
		int choice = read.nextInt();
		
		//bypass
		read.nextLine();
		
		switch(choice) {
		case 1: //register
			registerUser();
			break;
		case 2: //Login
			User u=loginUser();
			if(u != null) {
				System.out.println("Login Successful!");
				//profile menu show
				profileMenu(u);
				
			}
			else {
				System.out.println("Invalid Credentials");
			}
			break;
		case 3: //Exist
			System.out.println("");
			System.exit(0);
			break;
		default: 
			System.out.println("Invalid Option...Try Again!");
		}
		
//		read.close();
		
	}
	}
	
	//method -register ,login
	public static void registerUser() {
        System.out.println("=== Welcome TO Linkdln App ==");
		
		//Read user account details
		System.out.println("Enter full name :");
		String fullName= read.nextLine();
		System.out.println("Enter Email ID :");
		String userEmail=read.nextLine();
		System.out.println("Enter Phone Number :");
		String userPhone=read.nextLine();
		System.out.println("Enter User Name:");
		String userName=read.nextLine();
		System.out.println("Enter User Password :");
		String userPass=read.nextLine();
		
		
		
		//add user
		User user=new User(userName,userPass,fullName, userEmail,userPhone);
		users.add(user);
		
		System.out.println("User Registered Successfully!");
		user.displayBasicInfo();
	}
	public static User loginUser() {
		System.out.print("Enter User Name : ");
		String userName=read.nextLine();
		
		System.out.print("Enter Password : ");
		String userPass=read.nextLine();
		
		//login to check user credential
		//generics
		for(User user : users) {
			if(user.getUserName().equals(userName)&&user.getUserPassword().equals(userPass)){
				return user;
			}
		}
		return null;
	}
	//method to create a profile
	public static void profileMenu(User user) {
		System.out.println("1. Create profile");
		System.out.println("2. View Profile");
		System.out.println("3. Add Skills");
		System.out.println("4. Add Connection");
		System.out.println("5. View Connection");
		
		System.out.println("Enter Your Choice : ");
		int choice = read.nextInt();
		read.nextLine();
		
		switch(choice) {
		case 1: //create
			System.out.println("Enter Headline");
			String headLine=read.nextLine();
			
			System.out.println("Enter Experience");
			String exp = read.nextLine();
			
			Profile profile = new Profile(headLine,exp);
			
			//add profile to user account
			user.setProfile(profile);
			
			System.out.println("Profile Created Successfuly!");
			break;
			
		case 2: //view
			user.getProfile().displayProfile();
			break;
			
		case 3://add skills
			if(user.getProfile() ==null) {
				System.out.println("Create Profile First");
			}
			else {
				System.out.print("Enter Skill : ");
				String skill =read.nextLine();
				user.getProfile().addSkill(skill);
			}
			break;
			
		case 4: //add connection
			System.out.println("Enter User Name to connect : ");
			String username =read.nextLine();
			if(user.getUserName().equals(username)) {
				System.out.println("Same user.");
			}
			else {
				//enter username has an account or not
				for(User u:users) {
					if(u.getUserName().equals(username)) {
						//user has account
						user.addConnection(u);
						
					}
				}
				System.out.println("User Not Found!");
			}
			break;
		case 5: //add view connection
			user.viewConnection();
			break;
			
			
			default:
		
	
			
		}
	}

}
