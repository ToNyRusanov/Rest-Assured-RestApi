package users.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReqResUsersModel {

    @Expose
    List<ReqResUserModel> data;
    @Expose
    private String page;
    @Expose
    @SerializedName("per_page")
    private String perPage;
    @Expose
    private String total;
    @Expose
    @SerializedName("total_pages")
    private String totalPages;

    public String getPage() {
        return page;
    }

    public String getPerPage() {
        return perPage;
    }

    public String getTotal() {
        return total;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public List<ReqResUserModel> getData() {
        return data;
    }
}
