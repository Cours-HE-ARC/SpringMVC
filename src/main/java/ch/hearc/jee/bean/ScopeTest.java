package ch.hearc.jee.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	
	public static void main( String[] args )
    {
    	ApplicationContext context = 
    	  new ClassPathXmlApplicationContext(new String[] {"root-context.xml"});

    	FirstBean fb = (FirstBean) context.getBean("firstBean");
    	FirstBean fb2 = (FirstBean) context.getBean("firstBean");
    	
    	
    	System.out.println("fb equals fb2: " + (fb.equals(fb2)));
    	
    	FirstBean fb3 = (FirstBean) context.getBean("secondFirstBean");
    	
    	System.out.println("fb equals fb3: " + (fb.equals(fb3)));
    	
    	
    }
}
