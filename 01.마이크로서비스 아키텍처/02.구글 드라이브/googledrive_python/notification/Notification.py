from sqlalchemy.ext.declarative import declarative_base 
from sqlalchemy import Column, String, Integer, event, Float, Boolean
from datetime import datetime

import util

Base = declarative_base()

class Notification(Base):
    __tablename__ = 'Notification_table'
    id = Column(Integer, primary_key=True)
    fileId = Column(Integer)
    content = Column(String(50))
    userId = Column(Integer)

    def __init__(self):
        self.id = None
        self.fileId = None
        self.content = None
        self.userId = None


