package com.mpy.javaweb.commonResponse;
/**
 *
 * @param <T>
 *     ComResponse 是一个泛型类，返回的是一个泛型，外界可以传入任何类型的值
 *     理解泛型：
 *     有点像js方法，你给它传任何类型都可以,但是最后返回的类型是setData时候传的对象！！！
 */
public class ComResponse<T> {

    private String msg = "返回成功";
    private int code = 200;
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
