package cn.bdqn.controller;

import cn.bdqn.Feign.UserOrederFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class controller {
    @Autowired
    private DiscoveryClient discoveryClient; //服务发现
    @Autowired
    UserOrederFeign userOrederFeign;


    @GetMapping("text")
    public String text(String name){
        List<ServiceInstance> instances = discoveryClient.getInstances(name);
        ServiceInstance serviceInstance=instances.get(0);
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        System.out.println(host+port);
        return instances.get(0).toString();
    }
    @GetMapping("user")
    public List<String> user(){
        System.out.println("调用order");
        List<String> order = userOrederFeign.order();
        return order;
    }















    public static void main(String[] args) {
        System.out.println("asdf");
        System.out.println("二次修改");
        System.out.println("三次修改");
    }
}
