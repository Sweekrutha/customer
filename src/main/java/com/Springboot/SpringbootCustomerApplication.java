package com.Springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.Customer.Customer;

@RestController
@SpringBootApplication
public class SpringbootCustomerApplication {
	@GetMapping("/Customer Data")
	public String Welcome()
	{
		return "Customer Data";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCustomerApplication.class, args);
		ArrayList<Customer> al=new ArrayList <Customer>();
		al.add(new Customer(200," ramu ", 50));
		al.add(new Customer(201," janu ", 51));
		al.add(new Customer(202," somu ", 52));
		al.add(new Customer(203," mamu ", 53));
		al.add(new Customer(204," ammu ", 54));
		al.add(new Customer(205," lalli ",55));
		al.add(new Customer(206," timu ", 56));
		al.add(new Customer(207," savvi ",57));
		al.add(new Customer(208," sam ",58));
		al.add(new Customer(209," raju ",59));
		int len=al.size();
		Scanner Sc=new Scanner(System.in);
		String whilechoice="go";
		while(whilechoice=="go")
		{
			String avail="False";
			System.out.println("enter your choice");
			System.out.println("1.Customer Data 2.Update Student marks 3.Exit");
			System.out.println(" ");
			int a =Sc.nextInt();
			switch (a)
			{
			case 1:
				System.out.println(" ");
				System.out.println("Customer Data..");
				System.out.println("Customer id Name Age");
				for(Customer ct:al) {
					System.out.println(ct.getId()+""+ct.getName()+""+ct.getAge());
					}
				break;
			case 2:
				System.out.println(" ");
				System.out.println("Enter Customer id to update age..");
				int b=Sc.nextInt();
				int index=0;
				for(int i=0;i<len;i++)
				{
					if(al.get(i).getId()==b)
					{
						index=i;
				       	avail="True";	
					}
				}
				try {
					if("False".equals(avail))
					{throw new Exception("Invalid id");}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
					break;
				}
		
				System.out.println("Enter the new age");
				int c=Sc.nextInt();
				al.get(index).setAge(c);
			
				break;
			case 3:
			System.out.println(" ");
			whilechoice="stop";
			System.out.println("Exit");
			break;
				}
				}	
		}		
		}
	
