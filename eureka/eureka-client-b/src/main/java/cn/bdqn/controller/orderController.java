package cn.bdqn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class orderController {

    @GetMapping("order")//远程调用
    public List<String> order(){
        List<String> list =new ArrayList<>();
        list.add("王康杰");
        list.add("王康");
        return list;
    }
}
