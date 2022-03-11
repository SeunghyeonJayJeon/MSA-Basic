
package google.drive.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import google.drive.dto.entity.Notification;
import google.drive.mapper.NotificationMapper;
import google.drive.service.NotificationService;

@Transactional
@Service
public class NotificationServiceImpl implements NotificationService{
    @Autowired
    NotificationMapper notificationMapper;
    
    @Override
    public List<Notification> getList(){
        List<Notification> notificationList = notificationMapper.findList();

        return notificationList;
    }

    @Override
    public void save(Notification notification){
        
        notificationMapper.save(notification); 

        
    }

    @Override
    public Notification getById(Long id){
        Notification notification = notificationMapper.findOneById(id);

        return notification;
    }

    @Override
    public void delete(Long id){
        
        notificationMapper.deleteById(id); 


    }

    @Override
    public void update(Notification notification){

        notificationMapper.update(notification); 



    }
}
