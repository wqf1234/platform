package cn.edu.njupt.platform.main.common;

/**
 * @description: 接口返回消息体
 * @author: zhangjia
 * @title: RestResult
 * @date 2022/1/25 9:42 下午
 */
public class RestResult<T> {
    private Integer code;
    private String message;
    private T data;

    public static RestResult ok() {
        return new RestResult();
    }

    public static RestResult ok(Object data) {
        return new RestResult(data);
    }

    public RestResult() {
        this.code = 0;
        this.message = "success";
    }

    public RestResult(Integer code) {
        this.code = code;
        this.message = "success";
    }

    public RestResult(T data) {
        this.code = 0;
        this.data = data;
        this.message = "success";
    }

    public RestResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public RestResult(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public RestResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMsg(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "RestResult{code=" + this.code + ", message='" + this.message + '\'' + ", data=" + this.data + '}';
    }
}
