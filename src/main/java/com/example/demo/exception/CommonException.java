package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;
import lombok.Data;

@Data
public class CommonException extends RuntimeException{
    private  Integer code;

    public CommonException(String message) {
        super(message);
    }

    public CommonException(Integer code, String message) {
        super(message);
        this.code = code;
    }


    public CommonException(ResultEnum resultEnum)
    {
        super(resultEnum.getMsg());
        this.code=resultEnum.getCode();
    }


}


