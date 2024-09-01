package com.elon.democlientconsumer.controller;


import com.elon.apicenter.request.DemoRequest;
import com.elon.apicenter.result.Result;
import com.elon.democlientconsumer.client.DemoServiceClientConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServiceConsumerController {

    @Autowired
    private DemoServiceClientConsumer demoServiceClientConsumer;

    @GetMapping("/")
    public String  getDemoService(){
        DemoRequest demoRequest = new DemoRequest();
        demoRequest.setMsg("This Demo Rquest.Msg From DemoClientController");
        Result result = demoServiceClientConsumer.sayMsg(demoRequest);
        return "you are visiting demoClientConsumer.Call DemoService:{"+result.getMessage()+"}";
    }
}
