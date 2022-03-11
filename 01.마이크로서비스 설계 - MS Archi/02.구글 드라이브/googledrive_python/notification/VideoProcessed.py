
from AbstractEvent import AbstractEvent
import json

class VideoProcessed(AbstractEvent):
    id : int
    fileId : int
    url : str
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.fileId = None
        self.url = None

