package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;


public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;

    public FileIndexed(){
        super();
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }
}
