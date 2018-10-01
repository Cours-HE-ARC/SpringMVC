package ch.hearc.jee.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManualInstanciation {

	
	public static void main( String[] args )
    {
    	ApplicationContext context = 
    	  new ClassPathXmlApplicationContext(new String[] {"root-context.xml"});

    	FirstBean fb = (FirstBean) context.getBean("firstBean");
    	
    	System.out.println(fb);
    	
    }
}
