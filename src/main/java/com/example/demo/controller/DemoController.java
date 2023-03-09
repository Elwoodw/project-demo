package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.CommonException;
import com.example.demo.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo 用于参考
 */
@Slf4j
@RestController
@Api("测试demo")
public class DemoController {

    @ApiOperation(value = "用户测试",notes = "用户测试notes")
    @GetMapping("ok")
    public Result ok(String param)
    {
        log.info("ok");
        return ResultUtil.ok("ok");
    }

    @PostMapping("errors")
    public Result error()
    {
        throw  new CommonException(ResultEnum.ParamException);
    }
}
