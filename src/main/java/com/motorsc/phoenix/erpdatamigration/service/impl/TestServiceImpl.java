/*
 * Created by likaiqiang on 2018-10-23 14:39.
 */
package com.motorsc.phoenix.erpdatamigration.service.impl;

import com.motorsc.phoenix.erpdatamigration.mapper.master.ProductDao;
import com.motorsc.phoenix.erpdatamigration.mapper.slave.SlaveProductDao;
import com.motorsc.phoenix.erpdatamigration.modal.Product;
import com.motorsc.phoenix.erpdatamigration.service.TestService;
import com.motorsc.phoenix.erpdatamigration.utils.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: likaiqiang
 */
@Service
public class TestServiceImpl implements TestService{

    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    ProductDao productDao;

    @Autowired
    SlaveProductDao slaveProductDao;

    @Override
    public boolean testDynamicDataSource() {
        List<Product> productList = productDao.getAllProduct();
        for(Product product : productList) {
            logger.info("product:{}", JSONUtil.toJSONString(product));
            slaveProductDao.insert(product);
        }
        return true;
    }
}
