package maeing.tools.common;

import java.io.Serializable;

/**
 * <p>@Description : 响应消息类</p>
 * <p>@Author : maeing </p>
 * <p>@Date : 2018/3/19 18:13 </p>
 */
public class Notify implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4142736042660716318L;

	public enum Code {
        SUCCESS,
        FAILED,
        EXCEPTION;

        private Code() {
        }
    }

    public static Notify instance(Object data) {
        return new Notify(data);
    }

    public static Notify instance(Code code, String msg) {
        return new Notify(code, msg);
    }

    public Notify() {
        this.code = Code.SUCCESS;
    }

    public Notify(String msg) {
        this.code = Code.SUCCESS;
        this.msg = msg;
    }

    public Notify(Object data) {
        this.code = Code.SUCCESS;
        this.data = data;
    }

    public Notify(String msg, Object data) {
        this.code = Code.SUCCESS;
        this.msg = msg;
        this.data = data;
    }

    public Notify(Code code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Notify(Code code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Notify(Code code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private Code code; //响应代码

    private String msg; //响应消息

    private Object data; //数据携带

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public String getmsg() {
        return msg;
    }

    public void setmsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
