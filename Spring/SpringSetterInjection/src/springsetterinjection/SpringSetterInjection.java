/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springsetterinjection;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory; 

import org.springframework.beans.factory.xml.XmlBeanFactory;
/**
 *
 * @author Lenovo
 */
public class SpringSetterInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Resource resource= new ClassPathResource("AplicationContext.xml");
    BeanFactory factory=new XmlBeanFactory(resource);
    
           Empolyee e=(Empolyee)factory.getBean("obj");  
        e.display();  
        
        
    }

   
    
}
