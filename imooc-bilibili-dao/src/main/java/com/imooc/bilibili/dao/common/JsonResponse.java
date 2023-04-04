package com.imooc.bilibili.dao.common;

import java.io.Serializable;

/**
 * @ClassName: JsonResponse
 * @description: 通用的返回结果
 * @author: Neng.Tian
 * @create: 2023-03-29 23:18
 **/
public class JsonResponse<T> implements Serializable {
    private static final long serialVersionUID = 2112209197093061485L;

    public Integer code;

    public String msg;

    public T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JsonResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 成功返回
     *
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> JsonResponse<T> success(String msg, T data) {
        return new JsonResponse<T>(200, msg, data);
    }

    /**
     * 成功返回
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> JsonResponse<T> success(T data) {
        return new JsonResponse<>(200, "success", data);
    }

    /**
     * 请求成功
     *
     * @param <T>
     * @return
     */
    public static <T> JsonResponse<T> success() {
        return new JsonResponse<>(200, "success");
    }



    /**
     * 返回失败
     *
     * @param msg
     * @return
     */
    public static <T> JsonResponse<T> fail(String msg) {
        return new JsonResponse<>(501, msg);
    }

    /**
     * 失败
     *
     * @param code
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> JsonResponse<T> fail(Integer code, String msg) {
        return new JsonResponse<>(code, msg);
    }
}
