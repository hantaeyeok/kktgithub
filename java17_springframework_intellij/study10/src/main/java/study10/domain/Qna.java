package study10.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("qna")
public class Qna {
    private int qno;
    private int rev;
    private int parno;
    private String title;
    private String content;
    private String regdate;
    private int visited;
}