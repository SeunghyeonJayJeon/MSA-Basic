package google.drive;


public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }
    public Long getfileId() {
        return fileId;
    }

    public void setfileId(Long fileId) {
        this.fileId = fileId;
    }
    public String geturl() {
        return url;
    }

    public void seturl(String url) {
        this.url = url;
    }
}
