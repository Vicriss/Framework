package org.smart4j.framework.proxy;

/**
 * Created by wybe on 2018/4/11.
 */
public interface Proxy {

    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
