package study10.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryImpl implements TestRepository {

    @Autowired
    SqlSession sqlSession;

    @Override
    public String getTime1() {
        return sqlSession.selectOne("test.getTime1");
    }
}
