
public class TrainerApp {

	public static void main(String[] args) {
		Trainer t1 = new Trainer();
		Trainer t2 = new Trainer();
		t1.readinput("karthik", 123, "ava", 600000);
		t2.readinput("karthik",456,"java");
		System.out.println("Name:" + t1.name + ", ID:" + t1.id + ", skill:" + t1.skill + ", salary:" + t1.salary);
		t1.teach();
		t1.assest();
		System.out.println("Name:" + t2.name + ", ID:" + t2.id + ", skill:" + t2.skill);
		t2.teach();
		t2.assest();
		
	}

}
