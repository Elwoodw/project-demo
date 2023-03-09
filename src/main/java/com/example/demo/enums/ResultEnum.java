package com.example.demo.enums;

public enum ResultEnum {
    /**
     * 成功.: 200 (因为http中的状态码200一般都是表示成功)
     */
    SUCCESS(200, "成功"),

    /**
     * 系统异常. ErrorCode : -1
     */
    SystemException(-1, "系统异常"),

    /**
     * 未知异常. ErrorCode : 1
     */
    UnknownException(1, "未知异常"),

    /**
     * 服务异常. ErrorCode : 2
     */
    ServiceException(2, "服务异常"),


    /**
     * 提示级错误. ErrorCode : 3
     */
    InfoException(3, "提示级错误"),

    /**
     * 数据库操作异常. ErrorCode : 4
     */
    DBException(4, "数据库操作异常"),

    /**
     * 参数验证错误. ErrorCode : 5
     */
    ParamException(5, "参数验证错误")
    ;

    private  Integer code;
    private  String msg;

    ResultEnum(Integer code,String msg)
    {
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
