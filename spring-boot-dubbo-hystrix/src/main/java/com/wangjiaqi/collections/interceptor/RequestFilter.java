package com.wangjiaqi.collections.interceptor;

import com.alibaba.dubbo.rpc.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RequestFilter implements Filter {
    
    
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
