package google.drive;

import javax.persistence.*;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Dashboard_table")
public class Dashboard {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long fileSize;
        private String fileName;
        private String videoUrl;
        private Boolean isIndexed;
        private Boolean isUploaded;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Long getFileSize() {
            return fileSize;
        }

        public void setFileSize(Long fileSize) {
            this.fileSize = fileSize;
        }
        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }
        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }
        public Boolean getIsIndexed() {
            return isIndexed;
        }

        public void setIsIndexed(Boolean isIndexed) {
            this.isIndexed = isIndexed;
        }
        public Boolean getIsUploaded() {
            return isUploaded;
        }

        public void setIsUploaded(Boolean isUploaded) {
            this.isUploaded = isUploaded;
        }

}