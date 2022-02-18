package shoppingmall;


public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long itemId;
    private Long orderId;

    public DeliveryStarted(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = id;
    }
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long ItemId) {
        this.itemId = itemId;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long OrderId) {
        this.orderId = orderId;
    }
}
