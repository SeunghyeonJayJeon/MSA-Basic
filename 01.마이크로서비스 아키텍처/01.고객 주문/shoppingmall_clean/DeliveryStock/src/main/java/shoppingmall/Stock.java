package shoppingmall;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;


@Entity
@Table(name="Stock_table")
public class Stock  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private Long id;

    @PostPersist
    public void onPostPersist(){
        StockReduced stockReduced = new StockReduced();
        BeanUtils.copyProperties(this, stockReduced);
        stockReduced.publishAfterCommit();

        StockIncreased stockIncreased = new StockIncreased();
        BeanUtils.copyProperties(this, stockIncreased);
        stockIncreased.publishAfterCommit();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    



}
