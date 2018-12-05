package com.wangjiaqi.collections.hystrix;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * 业务失败返回处理函数
 * Created by wangjiaqi on 2018/12.5
 */
@SPI
public interface Fallback {
    Object invoke();
}
