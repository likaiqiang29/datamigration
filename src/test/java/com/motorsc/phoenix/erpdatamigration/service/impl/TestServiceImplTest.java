package com.motorsc.phoenix.erpdatamigration.service.impl;
/*
 * Created by likaiqiang on 2018-10-23 14:49.
 */

import com.motorsc.phoenix.erpdatamigration.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: likaiqiang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceImplTest {

    @Autowired
    TestService testService;

    @Test
    public void testDynamicDataSource() {
        testService.testDynamicDataSource();
    }
}
