import util
import IndexDB
from Index import Index
indexrepository = IndexDB.repository


from FileUploaded import FileUploaded

def wheneverFileUploaded_MakeIndex(data):
    event = FileUploaded()
    event = util.AutoBinding(data, event)
    
    index = Index()
    indexrepository.save(index)
    

