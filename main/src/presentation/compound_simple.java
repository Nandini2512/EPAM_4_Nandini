package presentation;
import java.util.Scanner;
import java.math.*;
import java.io.*;
public class compound_simple implements presented{

public static void main(String[] args) {
	compound_simple object=new compound_simple();
	Scanner scanObj=new Scanner(System.in);
	System.out.format("Enter principle Amount : ");
	int Principle_Amount=scanObj.nextInt();
	System.out.format("Enter Rate of Interest : ");
	int Rate_Of_Interest=scanObj.nextInt();
	System.out.format("Time : ");
	int Time=scanObj.nextInt();
	System.out.format("Simple Interest : %d\n",object.Simple_Interest_Action(Principle_Amount,Rate_Of_Interest,Time));
	System.out.format("Compound Interest : %d",object.Compound_Interest_Action(Principle_Amount,Rate_Of_Interest,Time));
}
@Override
public int Compound_Interest_Action(int Principle_Amount, int Rate_Of_Interest, int Time) {
	// TODO Auto-generated method stub
	double Compound_Interest_result=Principle_Amount*(Math.pow(1.0+Rate_Of_Interest/100.0,Time)-1.0);
	//float result=(float)Compound_Interest_result;
	return (int)Math.round(Compound_Interest_result);

	
}

@Override
public int Simple_Interest_Action(int Principle_Amount, int Rate_Of_Interest, int Time) {
	// TODO Auto-generated method stub
	int Simple_Interest_result=(Principle_Amount*Time*Rate_Of_Interest)/100;
	return Simple_Interest_result;
	
}
	
	
}
