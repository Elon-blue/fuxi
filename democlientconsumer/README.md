这是一个客户端消费者(consumer)的服务：
    架构：
        spring-cloud-starter-netflix-eureka-client
        openFeign(内置Ribbon)
        apicenter(被依赖)
        
请求流程：
    当服务启动的时候，先将自己注册给eureka-server(eureka模块)，这个时候eureka-server已经提前启动，
    直接Get请求访问ip+端口(10086)，因为就写了这个测试请求，拿到测试结果
    这个时候你发现eureka-server监控界面已经能监控到这个服务的状态
        
        