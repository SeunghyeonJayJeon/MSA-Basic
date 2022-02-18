import util
import NotificationDB
from Notification import Notification
notificationrepository = NotificationDB.repository


from FileUploaded import FileUploaded

def wheneverFileUploaded_NotifyToUser(data):
    event = FileUploaded()
    event = util.AutoBinding(data, event)
    
    notification = Notification()
    notificationrepository.save(notification)
    
from VideoProcessed import VideoProcessed

def wheneverVideoProcessed_NotifyToUser(data):
    event = VideoProcessed()
    event = util.AutoBinding(data, event)
    
    notification = Notification()
    notificationrepository.save(notification)
    

