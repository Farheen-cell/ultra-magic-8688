package com.CIMS.UseCase;

import java.util.Scanner;

import com.CIMS.DAO.UserDAO;
import com.CIMS.DAO.UserImp;
import com.CIMS.Exceptions.UserException;
import com.CIMS.Model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to CIMS");
		boolean flag=true;
		while(flag==true) {
			Scanner sc=new Scanner(System.in);
		System.out.println("Select any one opption given below");
		System.out.println("1:-Register You Self");
		System.out.println("2:-LogIn Your Account");
		int op=sc.nextInt();
		UserDAO udao=new UserImp();
		if(op==1) {
			System.out.println("Select any one opption given below");
			System.out.println("1:-As User");
			System.out.println("2:-As Admin");
			int op1=sc.nextInt();
			if(op1==1) {
				System.out.println("Enter your name");
				String name=sc.next();
				System.out.println("Enter your UserName");
				String userName=sc.next();
				System.out.println("Enter your Password");
				String password=sc.next();
				System.out.println("Enter your Address");
				String Address=sc.next();
				System.out.println("Enter your Pincode");
				int pincode=sc.nextInt();
				System.out.println("Enter your Phone Number");
				int PhoneNummber=sc.nextInt();
				System.out.println("Enter your Email");
				String email=sc.next();
				User user=new User();
				user.setName(name);
				user.setUserName(userName);
				user.setPassword(password);
				user.setAddress(Address);
				user.setAddress(Address);
				user.setPincode(pincode);
				user.setEmail(email);
				try {
					String result=udao.registerUser(user);
					System.out.println(result);
					
					
				} catch (UserException e) {
					// TODO: handle exception
				}
				
				
			}else
				if(op1==2) {
					System.out.println("Enter Employee code given in mail");
					int AdminCode=sc.nextInt();
					if(AdminCode==101093) {
						
						
					}else {
						System.out.println("Admin code does not match");
						flag=false;
					}
				}else {
					System.out.println("Plese select right opption");
					flag=false;
				}
		}else
			if(op==2) {
				System.out.println("Select your role");
				System.out.println("1:-User");
				System.out.println("2:-Admin");
				int role=sc.nextInt();
				if(role==1) {
					System.out.println("Enter Your UsearName");
					String UN=sc.next();
					System.out.println("Enter Your Password");
					String PW=sc.next();
					
					//login method call for user
				}else
					if(role==2) {
						System.out.println("Enter Your UsearName");
						String UN=sc.next();
						System.out.println("Enter Your Password");
						String PW=sc.next();
						//login method call for Admin
					}
			}
		}

	}

}
