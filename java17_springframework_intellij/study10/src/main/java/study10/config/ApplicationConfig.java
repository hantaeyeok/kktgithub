package study10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import study10.repository.TestRepository;
import study10.repository.TestRepositoryImpl;
import study10.service.TestService;
import study10.service.TestServiceImpl;

@Configuration
@ComponentScan(basePackages = "study10")
public class ApplicationConfig {

    @Bean
    public TestRepository testRepository() { return new TestRepositoryImpl(); }

    @Bean
    public TestService testService() { return new TestServiceImpl(); }

}
