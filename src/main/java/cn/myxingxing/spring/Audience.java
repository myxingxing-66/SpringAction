package cn.myxingxing.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by lixing on 17/11/9.
 */
@Aspect
public class Audience {

    @Pointcut("execution(** concert.Performance.perform(..))")
    public void performance() {
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phone");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("Clap Clap Clap!!!");
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }

}
