package com.ybq.sbexp.annotation;

import com.ybq.sbexp.controller.BizRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

@Aspect
@Component
public class ParamAspect {

    @Pointcut("@annotation(com.ybq.sbexp.annotation.ParamAnnotaion)")
    public void pointCut() {

    }

    @Before("pointCut()")
    public boolean check(JoinPoint joinPoint) throws Exception {
        System.out.println("=============aspect");
        BizRequest request = (BizRequest) joinPoint.getArgs()[0];
        System.out.println(joinPoint.getSignature());
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        ParamAnnotaion annotaion = method.getAnnotation(ParamAnnotaion.class);
        String[] value = annotaion.value();
        for (String p : value) {
            Field declaredField = BizRequest.class.getDeclaredField(p);
            declaredField.setAccessible(true);
            Object o = declaredField.get(request);
            System.out.println("-----------");
            System.out.println(p);
            System.out.println(o);
            System.out.println(o instanceof Object);
            System.out.println(o instanceof String);
            System.out.println(o instanceof Integer);
            System.out.println(o instanceof LocalDateTime);
            System.out.println("-----------");

        }


        System.out.println("=============aspect");
        Object[] args = joinPoint.getArgs();
        //joinPoint.getSignature().
        return false;
    }
}
