
from AbstractEvent import AbstractEvent
import json

class FileUploaded(AbstractEvent):
    id : int
    size : int
    name : str
    userId : int
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.size = None
        self.name = None
        self.userId = None

