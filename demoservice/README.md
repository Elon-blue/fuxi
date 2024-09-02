这是一个生产者(provider)的服务：
    架构：
        spring-cloud-starter-netflix-eureka-client
        apicenter
测试服务流程：
    配置Yml文件
    写Controller(因为apicenter已经写了请求路径，所以这里只需要调用方法就行)

        
总结：
    当eureka server启动的时候，生产者会将自己的实例信息注册到eureka server,后续可能还有服务续约