package com.code.demo;



import javax.sound.midi.Instrument;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.entity.Category;
import com.code.entity.Order;
import com.code.entity.OrderDetails;
import com.code.entity.Product;
import com.code.entity.Role;
import com.code.entity.User;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	//create the object configuration class
    	//configure the hibernateconfig xml file
    	//annotate each to to the configure
    	//call the method buildSessionFactory
    	//returns the object of Sessionfactory
 SessionFactory sessionFactory=   new Configuration()
    			.configure("hibernate.cfg.xml")
    			.addAnnotatedClass(Category.class)
    			.addAnnotatedClass(Order.class)
    			.addAnnotatedClass(OrderDetails.class)
    			.addAnnotatedClass(Product.class)
    			.addAnnotatedClass(User.class)
    			.addAnnotatedClass(Role.class)
    			.buildSessionFactory();

 
    }
}
