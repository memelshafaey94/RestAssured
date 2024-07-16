package APIs;


import com.fasterxml.jackson.annotation.JsonProperty;

public class UserProfilePhoto {

    @JsonProperty("Id")
    private String Id;

    @JsonProperty("UniqueId")
    private String UniqueId;

    @JsonProperty("FileName")
    private String FileName;

    @JsonProperty("FileDownloadName")
    private String FileDownloadName;

    @JsonProperty("FileType")
    private String FileType;

    @JsonProperty("FileSize")
    private int FileSize;

    @JsonProperty("FilePath")
    private String FilePath;

    @JsonProperty("Path")
    private String Path;

    public String getId() {
        return this.Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getUniqueId() {
        return this.UniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.UniqueId = uniqueId;
    }

    public String getFileName() {
        return this.FileName;
    }

    public void setFileName(String fileName) {
        this.FileName = fileName;
    }

    public String getFileDownloadName() {
        return this.FileDownloadName;
    }

    public void setFileDownloadName(String fileDownloadName) {
        this.FileDownloadName = fileDownloadName;
    }

    public String getFileType() {
        return this.FileType;
    }

    public void setFileType(String fileType) {
        this.FileType = fileType;
    }

    public int getFileSize() {
        return this.FileSize;
    }

    public void setFileSize(int fileSize) {
        this.FileSize = fileSize;
    }

    public String getFilePath() {
        return this.FilePath;
    }

    public void setFilePath(String filePath) {
        this.FilePath = filePath;
    }

    public String getPath() {
        return this.Path;
    }

    public void setPath(String path) {
        this.Path = path;
    }
}
