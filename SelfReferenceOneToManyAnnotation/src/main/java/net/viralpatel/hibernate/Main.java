package net.viralpatel.hibernate;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
public class Main {
 
    public static void main(String[] args) {
 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
 
        Employee manager1 = new Employee("Chuck", "Norris");
        
        Employee employee1 = new Employee("Sergey", "Brin");
        Employee employee2 = new Employee("Larry", "Page");

        employee1.setManager(manager1);
        employee2.setManager(manager1);
        
        Employee manager2 = new Employee("Premendra", "Kumar");
        
        Employee employee3 = new Employee("Manmeet", "Brin");
        Employee employee4 = new Employee("Lullu", "Page");
        
        
        
        employee3.setManager(manager2);
        employee4.setManager(manager2);
        
        session.save(employee1);
        session.save(employee2);
        
        session.save(employee3);
        session.save(employee4);
        
        session.getTransaction().commit();
        session.close();
    }
}