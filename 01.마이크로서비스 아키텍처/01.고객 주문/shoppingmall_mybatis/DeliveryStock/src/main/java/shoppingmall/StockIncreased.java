package shoppingmall;


public class StockIncreased extends AbstractEvent {

    private Long id;
    private String itemId;

    public StockIncreased(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = id;
    }
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String ItemId) {
        this.itemId = itemId;
    }
}
