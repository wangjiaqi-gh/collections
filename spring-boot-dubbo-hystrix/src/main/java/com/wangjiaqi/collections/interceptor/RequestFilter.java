package com.wangjiaqi.collections.interceptor;

import com.alibaba.dubbo.rpc.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RequestFilter implements Filter {
    
    
    /**
     * 调用本服务的过滤器，区分于调用其他服务的过滤器
     * Created by wangjiaqi on 2018/12.5
     */
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        
        String serviceName = invoker.getInterface().getName();
        String methodName = RpcContext.getContext().getMethodName();
        Object[] objects = RpcContext.getContext().getArguments();
        String address = RpcContext.getContext().getRemoteAddressString();
        log.info("{}.{}({}),from {}", serviceName, methodName, objects, address);
        
        
        long startTs = System.currentTimeMillis();
        Result result = invoker.invoke(invocation);
        long endTs = System.currentTimeMillis();
        
        return result;
    }
}
