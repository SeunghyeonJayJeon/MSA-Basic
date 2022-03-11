package shoppingmall;


public class DeliveryReturned extends AbstractEvent {

    private Long id;

    public DeliveryReturned(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = id;
    }
}
