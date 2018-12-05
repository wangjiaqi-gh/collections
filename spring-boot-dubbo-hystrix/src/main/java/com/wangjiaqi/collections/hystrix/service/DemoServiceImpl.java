package com.wangjiaqi.collections.hystrix.service;

import com.alibaba.dubbo.config.annotation.Reference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 测试服务
 * Created by wangjiaqi on 2018/12.5
 */
@Component
@Slf4j
public class DemoServiceImpl  {
    
    // 这里调用其他服务，然后走正常逻辑，parameters中填写key：fallback ，value：需要实现的fallback的方法名
    
    
//    @Reference(registry = "wxblender", parameters = {"fallback", "DefaultFallback"})
//    DemoService demoService;
    
//    public String ping() {
//        String result = "";
//        String ping = demoService.ping();
//        if (null != ping) {
//            result = ping;
//        }
//        return result;
//    }
}
