public class Trainer {
//	object states
	String name;
	int id;
	String skill;
	double salary;
	
//	
	void teach()
	{
		System.out.println("Teaching java");
		
	}
	void assest()
	{
		System.out.println("TO read user input without scanner");
	}
//	method to read input
	void readinput(String a,int b,String c,double d)
	{
		name=a;
		id=b;
		skill=c;
		salary=d;
	}
	
	void readinput(String a,int b,String c)
	{
		name=a;
		id=b;
		skill=c;
	}
}
