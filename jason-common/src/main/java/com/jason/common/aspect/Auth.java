package com.jason.common.aspect;

import com.jason.common.annotation.MyAuth;
import com.jason.common.model.Response;
import com.jason.common.utils.RedisUtil;
//import com.jason.user.model.Role;
//import com.jason.user.model.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author Jason
 * @CreateTime 2019/8/20 14:32
 * @Modify 2019/8/20 14:32
 * @Version 1.0
 */
@Aspect
@Component
public class Auth {

    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

    @Pointcut(value = "@annotation(com.jason.common.annotation.MyAuth)")
    public void pointcut() {
    }

    /**
     * 切面操作完成user鉴权
     *
     * @param joinPoint
     * @param myAuth
     * @return
     */
    @Around("pointcut()&&@annotation(myAuth)")
    public Object around(ProceedingJoinPoint joinPoint, MyAuth myAuth) {
        String role = myAuth.role();
        String token = request.getHeader("token");
//        User user = RedisUtil.get(token);
//        for (Role r : user.getRoles()) {
//            if (r.getName().equals(role)) {
//                try {
//                    return joinPoint.proceed();
//                } catch (Throwable throwable) {
//                    throwable.printStackTrace();
//                }
//            }
//        }
        Response response = new Response();
        response.error(403, "permission denied");
        return response;
    }

    @AfterReturning("@annotation(com.jason.common.annotation.MyAuth)")
    public void after() {
        String token = request.getHeader("token");
//        User user = RedisUtil.get(token);
//        RedisUtil.put(token, user, 30);
    }
}
