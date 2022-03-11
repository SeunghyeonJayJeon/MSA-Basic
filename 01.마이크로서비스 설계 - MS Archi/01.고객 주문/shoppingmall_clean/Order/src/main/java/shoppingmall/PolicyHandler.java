package shoppingmall;

import shoppingmall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired OrderRepository orderRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverStockIncreased_PushMail(@Payload StockIncreased stockIncreased){

        if(!stockIncreased.validate()) return;

        System.out.println("\n\n##### listener PushMail : " + stockIncreased.toJson() + "\n\n");


        

        // Sample Logic //
        // Order order = new Order();
        // orderRepository.save(order);

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeliveryStarted_UpdateOrder(@Payload DeliveryStarted deliveryStarted){

        if(!deliveryStarted.validate()) return;

        System.out.println("\n\n##### listener UpdateOrder : " + deliveryStarted.toJson() + "\n\n");


        

        // Sample Logic //
        // Order order = new Order();
        // orderRepository.save(order);

    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeliveryReturned_UpdateOrder(@Payload DeliveryReturned deliveryReturned){

        if(!deliveryReturned.validate()) return;

        System.out.println("\n\n##### listener UpdateOrder : " + deliveryReturned.toJson() + "\n\n");


        

        // Sample Logic //
        // Order order = new Order();
        // orderRepository.save(order);

    }


}


