package edu.test.model.user;

import org.hibernate.Session;

import edu.test.util.HibernateUtil;

public class StudentManager {
	public static boolean addNew(StudentEntity student){
		Session session = HibernateUtil.getCurrentSession();
		
		session.beginTransaction();
		try{
			session.save(student);
		}catch(Exception ex){
			session.getTransaction().rollback();
			return false;
		}
		session.getTransaction().commit();
		return true;
	}
}
