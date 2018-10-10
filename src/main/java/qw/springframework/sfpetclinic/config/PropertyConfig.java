package qw.springframework.sfpetclinic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import qw.springframework.sfpetclinic.examplebeans.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${qw.username}")
    String user;

    @Value("${qw.password}")
    String password;

    @Value("${qw.dburl}")
    String dbUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        return new FakeDataSource(user, password, dbUrl);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
