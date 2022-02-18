from AbstractEvent import AbstractEvent
import json
from datetime import datetime

class VideoProcessed(AbstractEvent):
    id : int
    fileId : int
    url : str
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.fileId = None
        self.url = None

