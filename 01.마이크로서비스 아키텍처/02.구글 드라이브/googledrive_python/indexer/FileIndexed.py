from AbstractEvent import AbstractEvent
import json
from datetime import datetime

class FileIndexed(AbstractEvent):
    id : int
    fileId : int
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.fileId = None

