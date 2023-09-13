

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sql_Operation {

	public static void main(String[] args) {
	
		EntityManagerFactory e1 = Persistence.createEntityManagerFactory("ABC");
		
		EntityManager em = e1.createEntityManager();
		
		em.getTransaction().begin();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your roll number");
		int rno = sc.nextInt();
		System.out.println("Enter your name");
		String name = sc.next();
		Stu s1 = new Stu();
		s1.setStu_id(rno);
		s1.setStu_name(name);

		em.persist(s1);
		
		System.out.println("dataSaved");
		em.getTransaction().commit();
		
		
		
		
		em.getTransaction().begin();
		
		Student s=em.find(Student.class, 3); 
		
		System.out.println(s.getSname());
		em.remove(s);  
		em.getTransaction().commit();

	}

}
