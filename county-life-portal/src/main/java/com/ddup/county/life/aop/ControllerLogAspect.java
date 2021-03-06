package com.ddup.county.life.aop;

import com.ddup.county.life.dto.CommonDTO;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Aspect
@Component
public class ControllerLogAspect {
    public static final Logger logger = LoggerFactory.getLogger(ControllerLogAspect.class);
    Gson gson;

    @Autowired
    public ControllerLogAspect(Gson gson) {
        this.gson = gson;
    }

    @Around("execution(* com.ddup.county.life.controller.*.*(..))")
    public Object handleControllerMethod(ProceedingJoinPoint pjp) {
        Stopwatch stopwatch = Stopwatch.createStarted();

        Object resultEntity = null;
        try {
            logger.info("执行Controller开始: {} 参数：{}", pjp.getSignature(), gson.toJson(pjp.getArgs()));
            resultEntity = pjp.proceed(pjp.getArgs());
            logger.info("执行Controller结束: {}", pjp.getSignature());
            logger.info("耗时：{} (毫秒).\n\n", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
        }
        //只捕获PresentException + UserException + Exception
       /* catch (CouponException e) {
            logger.error("异常{方法：" + pjp.getSignature() + "， 参数：" + pjp.getArgs() + ",异常：" + e.getMessage() + "}", e);
            resultEntity = gson.toJson(new CommonDTO("-1", e.getErrorMsg()));
        } catch (UserException userException) {
            resultEntity = gson.toJson(new CommonDTO("-101", "用户未登录"));
        } catch (ConponRecordException e) {
            logger.error("异常{方法：" + pjp.getSignature() + "， 参数：" + pjp.getArgs() + ",异常：" + e.getMessage() + "}", e);
            resultEntity = gson.toJson(new CommonDTO("-1", "服务器开小差，请稍后再试！"));
        }*/ catch (Throwable throwable) {
            resultEntity = handlerException(pjp, throwable);
        }
        return resultEntity;
    }

    @Around("@annotation(com.ddup.county.life.annotation.ExceptionLog)")
    public Object handleServiceMethod(ProceedingJoinPoint pjp) {
        Stopwatch stopwatch = Stopwatch.createStarted();

        Object resultEntity = null;
        try {
            logger.info("执行Controller开始: {} 参数：{}", pjp.getSignature(), Lists.newArrayList(pjp.getArgs()));
            resultEntity = pjp.proceed(pjp.getArgs());
            logger.info("执行Controller结束: {}" + pjp.getSignature());
            logger.info("耗时：{}", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS), "(毫秒).");
        }
        //只捕获PresentException + UserException + Exception
        /*catch (CouponException e) {
            logger.error("异常{方法：" + pjp.getSignature() + "， 参数：" + pjp.getArgs() + ",异常：" + e.getMessage() + "}", e);
            resultEntity = new CommonDTO("-1", e.getErrorMsg());
        } catch (UserException userException) {
            resultEntity = new CommonDTO("-101", "用户未登录");
        } catch (ConponRecordException e) {
            logger.error("异常{方法：" + pjp.getSignature() + "， 参数：" + pjp.getArgs() + ",异常：" + e.getMessage() + "}", e);
            resultEntity = new CommonDTO("-1", "服务器开小差，请稍后再试！");
        } */ catch (Throwable throwable) {
            resultEntity = handlerException(pjp, throwable, null);
        }
        return resultEntity;
    }

    private Object handlerException(ProceedingJoinPoint pjp, Throwable e) {
        CommonDTO result = CommonDTO.fail("-1", "服务器开小差，请稍后再试");
        logger.error("异常{方法：" + pjp.getSignature() + "， 参数：" + gson.toJson(pjp.getArgs()) + ",异常：" + e.getMessage() + "}", e);
        return result;
    }

    private Object handlerException(ProceedingJoinPoint pjp, Throwable e, String param) {
        Object result = CommonDTO.fail("-1", "服务器开小差，请稍后再试");
        logger.error("异常{方法：" + pjp.getSignature() + "， 参数：" + gson.toJson(pjp.getArgs()) + ",异常：" + e.getMessage() + "}", e);
        return result;
    }
}
