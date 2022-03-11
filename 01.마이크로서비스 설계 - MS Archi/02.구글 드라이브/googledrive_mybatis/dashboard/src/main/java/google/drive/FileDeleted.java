package google.drive;


public class FileDeleted extends AbstractEvent {

    private Long id;
    private Long size;
    private String name;
    private Long userId;

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }
    public Long getsize() {
        return size;
    }

    public void setsize(Long size) {
        this.size = size;
    }
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    public Long getuserId() {
        return userId;
    }

    public void setuserId(Long userId) {
        this.userId = userId;
    }
}
