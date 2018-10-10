package qw.springframework.sfpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import qw.springframework.sfpetclinic.controllers.ConstructorInjectedController;
import qw.springframework.sfpetclinic.controllers.MyController;
import qw.springframework.sfpetclinic.controllers.PropertyInjectedController;
import qw.springframework.sfpetclinic.controllers.SetterInjectedController;
import qw.springframework.sfpetclinic.examplebeans.FakeDataSource;

@SpringBootApplication
public class SfPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfPetClinicApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());
    }
}
