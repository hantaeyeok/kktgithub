package study10.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {

    @Select("SELECT CURRENT_TIMESTAMP()")
    public String getTime2();
}