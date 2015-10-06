package net.hevilavio.model;

/**
 * Created by hevilavio on 10/6/15.
 */
public class ApiResult {

    private String status;
    private String message;

    private ApiResult() {
    }

    private ApiResult(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public static ApiResult buildSuccess(String message){
        return new ApiResult("OK", message);
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
