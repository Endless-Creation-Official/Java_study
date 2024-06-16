package enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK"), BAD_REQUEST(400,"BAD REQUEST"), NOT_FOUND(404,"NOT FOUND"),
    INTERNAL_SERVER_ERROR(500,"INTERNAL SERVER ERROR");
    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code) {
        HttpStatus[] values = HttpStatus.values();
        for (HttpStatus status : values) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }
}
