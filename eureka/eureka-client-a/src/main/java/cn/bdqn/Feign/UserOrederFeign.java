package cn.bdqn.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "eureka-client-b")
public interface UserOrederFeign {
    @GetMapping("order")
    public List<String> order();
}
