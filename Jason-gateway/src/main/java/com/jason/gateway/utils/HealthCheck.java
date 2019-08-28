package com.jason.gateway.utils;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 所选微服务健康检查类
 * @Author Jason
 * @CreateTime 2019/8/28 9:16
 * @Modify 2019/8/28 9:16
 * @Version 1.0
 */
@Component
public class HealthCheck implements IPing {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public boolean isAlive(Server server) {
        String url = "http://" + server.getId() + "/health";
        try {
            //rest+ribbon请求数据
            ResponseEntity<String> health = restTemplate.getForEntity(url, String.class);
            if (health.getStatusCode() == HttpStatus.OK) {
                System.out.println("ping " + url + " success and  response is " + health.getBody());
                return true;
            }
            System.out.println("ping " + url + " fail and response is " + health.getBody());
            return false;
        } catch (Exception e) {
            System.out.println("ping " + url + " fail");
            return false;
        }
    }
}
