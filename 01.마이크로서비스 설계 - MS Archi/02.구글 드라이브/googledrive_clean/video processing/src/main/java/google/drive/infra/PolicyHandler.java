package google.drive.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;

import google.drive.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import google.drive.domain.*;


@Service
public class PolicyHandler{
    @Autowired VideoRepository videoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverFileUploaded_ProcessVideo(@Payload FileUploaded fileUploaded){

        if(!fileUploaded.validate()) return;

        System.out.println("\n\n##### listener ProcessVideo : " + fileUploaded.toJson() + "\n\n");


        // Comments // 
		//if is video? 판별

        // Sample Logic //
        // Video video = new Video();
        // videoRepository.save(video);
        

    }


}


