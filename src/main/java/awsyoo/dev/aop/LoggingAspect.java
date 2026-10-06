package awsyoo.dev.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(* awsyoo.dev.TaskManager.*(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        System.out.println("Перед вызовом метода: " + joinPoint.getSignature().getName());
//    }
//
//    @AfterReturning(value = "execution(* awsyoo.dev.TaskManager.*(..))", returning = "result")
//    public void logAfterReturning(JoinPoint joinPoint, Object result) {
//        System.out.println("После возвращения результата метода: " + joinPoint.getSignature().getName() + ", результат - " + result);
//    }
//
//    @AfterThrowing(value = "execution(* awsyoo.dev.TaskManager.*(..))", throwing = "exc")
//    public void afterThrowing(JoinPoint joinPoint, Exception exc) {
//        System.out.println("После исключения: " + joinPoint.getSignature().getName() + ", исключение - " + exc.getMessage());
//    }
//
//    @After(value = "execution(* awsyoo.dev.TaskManager.*(..))")
//    public void afterThrowing(JoinPoint joinPoint) {
//        System.out.println("После выполнения метода: " + joinPoint.getSignature().getName());
//    }

//    @Around("execution(* awsyoo.dev.TaskManager.*(..))")
//    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("До вызова метода");
//        Object result = proceedingJoinPoint.proceed();
//        System.out.println("После вызова метода");
//        
//        return result;
//    }

    @Before("@annotation(loggable)")
    public void log(JoinPoint joinPoint, Loggable loggable) {
        for (int i = 0; i < loggable.count(); i++) {
            System.out.printf("LOG BEFORE METHOD (%s): %s%n", loggable.value(), joinPoint.getSignature().getName());
        }
    }

}
