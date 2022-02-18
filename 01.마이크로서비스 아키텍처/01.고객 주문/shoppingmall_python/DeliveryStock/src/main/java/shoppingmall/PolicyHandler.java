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
    @Autowired DeliveryRepository deliveryRepository;
    @Autowired StockRepository stockRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverOrderPlaced_StartDelivery(@Payload OrderPlaced orderPlaced){

        if(!orderPlaced.validate()) return;

        System.out.println("\n\n##### listener StartDelivery : " + orderPlaced.toJson() + "\n\n");


        

        // Sample Logic //
        // Delivery delivery = new Delivery();
        // deliveryRepository.save(delivery);
        // Stock stock = new Stock();
        // stockRepository.save(stock);

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeliveryStarted_UpdateStock(@Payload DeliveryStarted deliveryStarted){

        if(!deliveryStarted.validate()) return;

        System.out.println("\n\n##### listener UpdateStock : " + deliveryStarted.toJson() + "\n\n");


        

        // Sample Logic //
        // Delivery delivery = new Delivery();
        // deliveryRepository.save(delivery);
        // Stock stock = new Stock();
        // stockRepository.save(stock);

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverOrderCanceled_ReturnDelivery(@Payload OrderCanceled orderCanceled){

        if(!orderCanceled.validate()) return;

        System.out.println("\n\n##### listener ReturnDelivery : " + orderCanceled.toJson() + "\n\n");


        

        // Sample Logic //
        // Delivery delivery = new Delivery();
        // deliveryRepository.save(delivery);
        // Stock stock = new Stock();
        // stockRepository.save(stock);

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeliveryReturned_UpdateStock(@Payload DeliveryReturned deliveryReturned){

        if(!deliveryReturned.validate()) return;

        System.out.println("\n\n##### listener UpdateStock : " + deliveryReturned.toJson() + "\n\n");


        

        // Sample Logic //
        // Delivery delivery = new Delivery();
        // deliveryRepository.save(delivery);
        // Stock stock = new Stock();
        // stockRepository.save(stock);

    }


}


