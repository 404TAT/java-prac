package com.temp.javaprac.controller;
import com.temp.javaprac.common.ResultCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/upload")
public class UploadController {

    @GetMapping("/check")
    public ResultCode check() {
        return ResultCode.SUCCESS;
    }
    @PostMapping("/chunk")
    public ResultCode upload() {
        return ResultCode.SUCCESS;
    }

    @PostMapping("/merge")
    public ResultCode merge() {
        return ResultCode.SUCCESS;
    }
}
