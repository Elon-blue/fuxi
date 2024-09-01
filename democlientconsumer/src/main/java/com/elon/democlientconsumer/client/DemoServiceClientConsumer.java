package com.elon.democlientconsumer.client;


import com.elon.apicenter.service.DemoService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("demoservice")
public interface DemoServiceClientConsumer extends DemoService {



}
