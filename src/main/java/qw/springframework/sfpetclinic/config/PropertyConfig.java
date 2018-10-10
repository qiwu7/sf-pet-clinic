package qw.springframework.sfpetclinic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import qw.springframework.sfpetclinic.examplebeans.FakeDataSource;
import qw.springframework.sfpetclinic.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("${classpath:datasource.properties}"),
        @PropertySource("classpath:jms.properties")
})
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

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
