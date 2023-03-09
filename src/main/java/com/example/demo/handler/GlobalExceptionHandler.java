package com.example.demo.handler;

import com.example.demo.entity.Result;
import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.CommonException;
import com.example.demo.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理系统内部异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e){
        return ResultUtil.error(ResultEnum.SystemException);
    }

    /**
     * 处理自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(CommonException.class)
    public Result handleMyException(CommonException e){
        return ResultUtil.error(e.getCode(), e.getMessage());
    }
}
