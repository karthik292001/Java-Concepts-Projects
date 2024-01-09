

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kn.hibernate1.Student;


public class HibernateDemo2 {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"karthik",98);
		Configuration con=new Configuration();
		con.configure();
		SessionFactory factory = con.buildSessionFactory();
		System.out.println("Connection established successfully = "+factory);
		
		Session session= factory.openSession();
		Transaction txt=session.beginTransaction();
		
		session.save(s1);
		System.out.println("object"+s1);
		
		System.out.println("student saved successfully");
		txt.commit();
	}

}
