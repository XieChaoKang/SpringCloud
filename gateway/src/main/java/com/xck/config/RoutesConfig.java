package com.xck.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiechaokang
 * @date 2020/10/14
 */
@Configuration
public class RoutesConfig {

    /**编码形式配置路由
     * route 可多次调用 相当于配置多个路由 id不同即可
     * path : 访问地址（网关ip+path） 例：http://localhost:9527/guonei
     * uri : 转发的地址
     * */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("baidu1",r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        routes.route("baidu2",r -> r.path("/mil").uri("http://news.baidu.com/mil")).build();
        return routes.build();
    }
}
