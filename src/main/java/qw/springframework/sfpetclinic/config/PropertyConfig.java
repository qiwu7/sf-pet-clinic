package qw.springframework.sfpetclinic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import qw.springframework.sfpetclinic.examplebeans.FakeDataSource;
import qw.springframework.sfpetclinic.examplebeans.FakeJmsBroker;

@Configuration
public class PropertyConfig {

    @Value("${qw.username}")
    String user;

    @Value("${qw.password}")
    String password;

    @Value("${qw.dburl}")
    String dbUrl;

    @Value("${qw.jms.username}")
    String jmsUser;

    @Value("${qw.jms.password}")
    String jmsPassword;

    @Value("${qw.jms.dburl}")
    String jmsDbUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        return new FakeDataSource(user, password, dbUrl);
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        return new FakeJmsBroker(jmsUser, jmsPassword, jmsDbUrl);
    }
}
