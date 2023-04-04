package com.imooc.bilibili.service.handler;

import com.imooc.bilibili.dao.common.JsonResponse;
import com.imooc.bilibili.dao.exception.BusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: GlobalExceptionHandler
 * @description: 全局异常处理（Controler 入口请求）
 * @author: Neng.Tian
 * @create: 2023-04-04 22:17
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public JsonResponse<String> businessExceptionHandler(HttpServletRequest request, Throwable ex) {
        // 强制转换
        BusinessException businessException = (BusinessException)ex;
        return JsonResponse.fail(businessException.getCode(), businessException.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonResponse<String> commonExceptionHandler(HttpServletRequest request, Throwable ex) {
        // 全局异常处理
        return JsonResponse.fail(ex.getMessage());
    }
}
