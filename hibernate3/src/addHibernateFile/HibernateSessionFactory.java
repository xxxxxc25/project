package addHibernateFile;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
    private static SessionFactory sessionFactory;
    public HibernateSessionFactory(){
    }
     static {
            Configuration configuration=new Configuration();
            Configuration configure = configuration.configure("hibernate.cfg.xml");
            sessionFactory=configure.buildSessionFactory();
           }
     public static SessionFactory getSessionFactory(){
    	 return sessionFactory;
     }
    public Session getSession(){
           return sessionFactory.openSession();
    }
}