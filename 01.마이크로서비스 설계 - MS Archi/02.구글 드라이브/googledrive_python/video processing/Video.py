from sqlalchemy.ext.declarative import declarative_base 
from sqlalchemy import Column, String, Integer, event, Float, Boolean
from datetime import datetime

import util
from VideoProcessed import VideoProcessed

Base = declarative_base()

class Video(Base):
    __tablename__ = 'Video_table'
    id = Column(Integer, primary_key=True)
    fileId = Column(Integer)
    url = Column(String(50))

    def __init__(self):
        self.id = None
        self.fileId = None
        self.url = None

@event.listens_for(Video, 'after_insert')
def PostPersist(mapper, connection, target):
    event = VideoProcessed()
    event = util.AutoBinding(target, event)

    event.Publish()
    

    

