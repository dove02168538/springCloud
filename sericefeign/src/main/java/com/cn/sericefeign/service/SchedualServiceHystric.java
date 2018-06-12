package com.cn.sericefeign.service;

import com.cn.sericefeign.dao.SchedualService;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystric  implements SchedualService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
