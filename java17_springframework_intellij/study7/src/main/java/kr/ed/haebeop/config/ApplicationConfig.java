package kr.ed.haebeop.config;

import kr.ed.haebeop.controller.FileUploadController;
import kr.ed.haebeop.persistence.RestDAO;
import kr.ed.haebeop.persistence.UserPersistence;
import kr.ed.haebeop.persistence.UserPersistenceImpl;
import kr.ed.haebeop.repository.TestRepository;
import kr.ed.haebeop.repository.TestRepositoryImpl;
import kr.ed.haebeop.service.*;
import kr.ed.haebeop.test.CheckVO;
import kr.ed.haebeop.test.transaction.TransactionRepository;
import kr.ed.haebeop.test.transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "kr.ed.haebeop")
public class ApplicationConfig {
    @Bean
    public TestService testService3(){
        return new TestServiceImpl();
    }

    @Bean
    public TestRepository testRepository3(){
        return new TestRepositoryImpl();
    }

    @Bean
    public TransactionRepository tranRepository() { return new TransactionRepository(); }

    @Bean
    public TransactionService tranService() { return new TransactionService(); }

    @Bean
    public CheckVO chk1() { return new CheckVO(); }

    @Bean
    public RestService restService() { return new RestService(); }

    @Bean
    public RestDAO restDao() { return new RestDAO(); }

}
