package shoppingmall;


public class StockReduced extends AbstractEvent {

    private Long id;

    public StockReduced(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = id;
    }
}
