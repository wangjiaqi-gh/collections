package com.wangjiaqi.collections.hystrix.fallbackImpl;

import com.wangjiaqi.collections.hystrix.Fallback;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultFallback implements Fallback {
    
    
    @Override
    public Object invoke() {
        log.info("服务被熔断，走默认逻辑");
        return null;
    }
}
