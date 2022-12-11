package com.example.gestion_achat.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class LogingAspect {


    @Before("execution(* com.exemple.GestionAchat.ServiceImp.*.*(..))")
    public void logMethodEntry(JoinPoint jp) {


        String name = jp.getSignature().getName();
        log.info("In method : " + name);

    }


}