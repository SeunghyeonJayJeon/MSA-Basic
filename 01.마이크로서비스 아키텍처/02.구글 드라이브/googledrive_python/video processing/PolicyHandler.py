import util
import VideoDB
from Video import Video
videorepository = VideoDB.repository


from FileUploaded import FileUploaded

def wheneverFileUploaded_ProcessVideo(data):
    event = FileUploaded()
    event = util.AutoBinding(data, event)
    
    video = Video()
    videorepository.save(video)
    

