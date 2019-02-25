package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan(basePackages = {"guru.services", "guru.springframework"}) in case a move the package services to guru
public class DiDemoApplication {

    public static void main(String[] args) {

       ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hallo());
        System.out.println(ctx.getBean((PropertyInjectedController.class)).sayHallo());
        System.out.println(ctx.getBean((SetterInjectedController.class)).sayHallo());
        System.out.println(ctx.getBean((ConstructorInjectedController.class)).sayHallo());
    }

}

