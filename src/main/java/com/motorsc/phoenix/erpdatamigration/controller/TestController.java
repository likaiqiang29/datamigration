/*
 * Created by likaiqiang on 2018-10-23 16:43.
 */
package com.motorsc.phoenix.erpdatamigration.controller;

import com.motorsc.phoenix.erpdatamigration.common.CommonResponse;
import com.motorsc.phoenix.erpdatamigration.common.ResponseUtil;
import com.motorsc.phoenix.erpdatamigration.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: likaiqiang
 */
@RestController
@RequestMapping("/product")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public CommonResponse test() {
        return ResponseUtil.generateResponse(testService.testDynamicDataSource());
    }
}
