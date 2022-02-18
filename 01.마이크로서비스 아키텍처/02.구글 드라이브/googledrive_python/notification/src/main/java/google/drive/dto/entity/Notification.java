package google.drive.dto.entity;

import java.util.Date;
import lombok.Data;
@Data
public class Notification{
    private Long id;
    private Long fileId;
    private String content;
    private Long userId;

    
}