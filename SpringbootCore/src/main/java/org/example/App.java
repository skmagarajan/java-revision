package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
    static ApplicationContext ctx;
    public static void main( String[] args )
    {

        ctx = SpringApplication.run(App.class, args);

        System.out.println(ctx.getBean("Dept"));
        System.out.println(ctx.getBean("Dept"));

        // SingleTon will automatically create the bean and we can see constructor is called.
        // And Same object is returned whenever the getBean is called

        // In Prototype will create the bean and we can see constructor is called only when the object is called.
        // And different object is returned whenever the bean is called
    }
}
