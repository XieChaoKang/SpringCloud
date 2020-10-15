package com.xck.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.lang.annotation.Annotation;
import java.util.List;

/**
 * @author xiechaokang
 * @date 2020/10/15
 * 自定义网关过滤器
 */
@Component
@Slf4j
public class LogGatewayFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //从请求里面获取参数
        String name = exchange.getRequest().getQueryParams().getFirst("name");
        //name为空贼代表没有携带该参数或者该参数为空 拦截
        if (StringUtils.isEmpty(name)){
            log.info("非法用户");
            //设置响应信息 返回
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        //参数正常 放行 执行下一个过滤器或者直接路由转发 访问具体服务
        return chain.filter(exchange);
    }

    /**该过滤器执行顺序*/
    @Override
    public int getOrder() {
        return 0;
    }

}
