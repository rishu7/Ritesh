package hibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DaoImpl {
	
	public static void main(String[] args) {
		

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		List<String> l = new ArrayList<String>();
		l.add("Amit");
		l.add("sumit");
		l.add("ram");
		Persistent p = new Persistent();
		p.setCompany_name("TCS");
		p.setEmployee_name(l);
		s.persist(p);
		t.commit();
		System.out.println("entry done");
		s.close();
	}
}
