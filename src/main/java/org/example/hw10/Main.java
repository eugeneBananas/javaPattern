package org.example.hw10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("There is not any args");
            return;
        }
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        String beanName = args[0];
        Musician mag = (Musician) context.getBean(beanName);
        mag.doCoding();
    }
}
