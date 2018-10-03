package qw.springframework.sfpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import qw.springframework.sfpetclinic.controllers.MyController;

@SpringBootApplication
public class SfPetClinicApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SfPetClinicApplication.class, args);
    MyController controller = (MyController) ctx.getBean("myController");
    controller.hello();
  }
}
