package com.motorsc.phoenix.erpdatamigration.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author: likaiqiang
 */
@Aspect
@Component
public class DynamicDataSourceAspect {
    private static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceAspect.class);

    /**
     * Dao aspect.
     */
    @Pointcut("execution( * com.motorsc.phoenix.erpdatamigration.mapper.master.*.*(..))")
    public void masterDaoAspect() {
    }

    @Pointcut("execution( * com.motorsc.phoenix.erpdatamigration.mapper.slave.*.*(..))")
    public void slaveDaoAspect() {
    }
    /**
     * Switch DataSource
     *
     * @param point the point
     */
    @Before("masterDaoAspect()")
    public void masterDataSource(JoinPoint point) {
        DynamicDataSourceContextHolder.useMasterDataSource();
        logger.debug("Switch DataSource to [{}] in Method [{}]",
                DynamicDataSourceContextHolder.getDataSourceKey(),
                point.getSignature());

    }

    /**
     * Restore DataSource
     *
     * @param point the point
     */
    @After("masterDaoAspect())")
    public void restoreDataSource(JoinPoint point) {
        DynamicDataSourceContextHolder.clearDataSourceKey();
        logger.debug("Restore DataSource to [{}] in Method [{}]",
                DynamicDataSourceContextHolder.getDataSourceKey(), point.getSignature());
    }

    /**
     * Switch DataSource
     *
     * @param point the point
     */
    @Before("slaveDaoAspect()")
    public void slaveDataSource(JoinPoint point) {

        DynamicDataSourceContextHolder.useSlaveDataSource();
        logger.debug("Switch DataSource to [{}] in Method [{}]",
                DynamicDataSourceContextHolder.getDataSourceKey(),
                point.getSignature());

    }

    /**
     * Restore DataSource
     *
     * @param point the point
     */
    @After("slaveDaoAspect())")
    public void restoreSlaveDataSource(JoinPoint point) {
        DynamicDataSourceContextHolder.clearDataSourceKey();
        logger.debug("Restore DataSource to [{}] in Method [{}]",
                DynamicDataSourceContextHolder.getDataSourceKey(), point.getSignature());
    }

}
