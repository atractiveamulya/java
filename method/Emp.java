class Emp{
static int salary=25000;
public static double EmpSalary(int age){
	System.out.println("the salary is started");

	
	 if(age>18 && age<=25){
		return salary;
	}else if(age>25 && age<35){
		return salary+2000;
	}else if(age>35 && age<45){
         return salary+4000;
	

	}
	System.out.println("the EmpSalary is ended ")
 		return 0;
}
}



