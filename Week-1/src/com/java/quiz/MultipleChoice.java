package com.java.quiz;

import java.util.Scanner;

public class MultipleChoice {
public static void main(String[] args){
	String[] answers = {"b","d","a","b","c","a","c","b","d","a"};//array variable to store answer key
	String[] responses = {"","","","","","","","","",""};// array variable variable to store responses of user
	Scanner sc = new Scanner(System.in);//creating scanner object
	//MCQs
	System.out.println("1)A light sensitive device that converts drawing, images or printed text into digital form is called");
	System.out.println("a)Keyboard");
	System.out.println("b)Scanner");
	System.out.println("c)Plotter");
	System.out.println("d)OMR");
	responses[0]= sc.next();//storing user responses in the array variable we created
	
	System.out.println("2)Which protocol provides email facility among different hosts");
	System.out.println("a)TCP/IP");
	System.out.println("b)Telnet");
	System.out.println("c)FTP");
	System.out.println("d)SMTP");
	responses[1]= sc.next();
	
	System.out.println("3)The basic architecture of computer was developed by");
	System.out.println("a)John Von Neumann");
	System.out.println("b)Charles Babbage");
	System.out.println("c)Denis Ritchie");
	System.out.println("d)Garden Moore");
	responses[2]= sc.next();
	
	System.out.println("4)In how many generations a computer can be classified");
	System.out.println("a)4");
	System.out.println("b)5");
	System.out.println("c)8");
	System.out.println("d)2");
	responses[3]= sc.next();
	
	System.out.println("5)Which of the following memory is non-volatile");
	System.out.println("a)SRAM");
	System.out.println("b)DRAM");
	System.out.println("c)ROM");
	System.out.println("d)All of the above");
	responses[4]= sc.next();
	
	System.out.println("6)The first computer mouse was built by");
	System.out.println("a)Douglas Engelbart");
	System.out.println("b)William English");
	System.out.println("c)Oaniel Coogher");
	System.out.println("d)Robert Zawacki");
	responses[5]= sc.next();
	
	System.out.println("7)Which of the following refers to the memory in your computer");
	System.out.println("a)LAN");
	System.out.println("b)USB");
	System.out.println("c)RAM");
	System.out.println("d)CPU");
	responses[6]= sc.next();
	
	
	System.out.println("8)Information travels between components of motherboard through");
	System.out.println("a)Flash memory");
	System.out.println("b)Buses");
	System.out.println("c)CMOS");
	System.out.println("d)Bays");
	responses[7]= sc.next();
	
	System.out.println("9)Tranformation of input into output is performed by");
	System.out.println("a)Memory");
	System.out.println("b)Storage");
	System.out.println("c)Input output unit");
	System.out.println("d)CPU");
	responses[8]= sc.next();
	
	System.out.println("10)What is the function of the Recycle Bin");
	System.out.println("a)Store deleted file");
	System.out.println("b)Store temporary file");
	System.out.println("c)Store corrupted file");
	System.out.println("d)Store document file");
	responses[9]= sc.next();
	
	int score =0;// variable to store score
	for(int i=0; i<10; i++) {
		if(responses[i].equalsIgnoreCase(answers[i])) { //matching user's response with answer key
		score++;
		}
		
	}
	System.out.println("Score = "+score+"/10");//displays score
}
}
