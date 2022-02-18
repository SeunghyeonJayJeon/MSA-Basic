from sqlalchemy.ext.declarative import declarative_base 
from sqlalchemy import Column, String, Integer, event, Float, Boolean
from datetime import datetime

import util
from FileIndexed import FileIndexed

Base = declarative_base()

class Index(Base):
    __tablename__ = 'Index_table'
    id = Column(Integer, primary_key=True)
    fileId = Column(Integer)

    def __init__(self):
        self.id = None
        self.fileId = None

@event.listens_for(Index, 'after_insert')
def PostPersist(mapper, connection, target):
    event = FileIndexed()
    event = util.AutoBinding(target, event)

    event.Publish()
    

    

