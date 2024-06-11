package study10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study10.mapper.TestMapper;
import study10.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public String getTime1() {
        return testRepository.getTime1();
    }

}
