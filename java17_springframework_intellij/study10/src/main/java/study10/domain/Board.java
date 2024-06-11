package study10.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("board")
public class Board {
    private int bno;
    private String title;
    private String content;
    private String regdate;
    private int visited;
}