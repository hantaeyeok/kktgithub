package kr.ed.haebeop.persistence;

import kr.ed.haebeop.domain.FileDTO;
import org.apache.ibatis.annotations.Insert;

public interface FileUploadMapper {
    @Insert("INSERT INTO attach (uuid, uploadpath, filename, filetype, bno) "
            + "VALUES (#{uuid}, #{uploadpath}, #{filename}, #{filetype}, #{bno})")
    public int insertAttach(FileDTO fileDTO);
}
