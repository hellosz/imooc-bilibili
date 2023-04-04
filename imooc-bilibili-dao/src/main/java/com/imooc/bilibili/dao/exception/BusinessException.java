package com.imooc.bilibili.dao.exception;

import java.io.Serializable;

/**
 * @ClassName: BussinessException
 * @description: 通用的业务异常
 * @author: Neng.Tian
 * @create: 2023-04-04 22:14
 **/
public class BusinessException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 297206108282133077L;

    private Integer code;

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public BusinessException(Integer code, String name) {
        super(name);
        this.code = code;
    }

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public BusinessException(String name) {
        super(name);
        this.code = 500;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
