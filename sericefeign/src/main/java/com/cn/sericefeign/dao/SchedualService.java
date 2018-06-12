package com.cn.sericefeign.dao;

import com.cn.sericefeign.service.SchedualServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "eurekaclient")
//@Component
@FeignClient(value = "eurekaclient",fallback = SchedualServiceHystric.class)
public interface SchedualService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
