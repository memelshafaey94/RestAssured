package APIs;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetProfile {

    @JsonProperty("Total")
    private String Total;

    @JsonProperty("PageNumber")
    private String PageNumber;

    @JsonProperty("PageSize")
    private String PageSize;

    @JsonProperty("Filter")
    private String Filter;

    @JsonProperty("Data")
    private UserProfileData Data;

    @JsonProperty("Messages")
    private List<UserMessages> Messages;

    @JsonProperty("IsSuccess")
    private String IsSuccess;

    @JsonProperty("Exception")
    private String Exception;




    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        this.Total = total;
    }

    public String getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.PageNumber = pageNumber;
    }

    public String getPageSize() {
        return PageSize;
    }

    public void setPageSize(String pageSize) {
        this.PageSize = pageSize;
    }

    public String getFilter() {
        return Filter;
    }

    public void setFilter(String filter) {
        this.Filter = filter;
    }

    public UserProfileData getData() {
        return Data;
    }

    public void setData(UserProfileData data) {
        this.Data = data;
    }

    public List<UserMessages> getMessages() {
        return Messages;
    }

    public void setMessages(List<UserMessages> messages) {
        this.Messages = messages;
    }

    public String getIsSuccess() {
        return IsSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.IsSuccess = isSuccess;
    }

    public String getException() {
        return Exception;
    }

    public void setException(String exception) {
        this.Exception = exception;

    }
}
