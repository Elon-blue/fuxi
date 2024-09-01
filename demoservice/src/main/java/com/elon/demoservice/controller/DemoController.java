package com.elon.demoservice.controller;

import com.elon.apicenter.request.DemoRequest;
import com.elon.apicenter.result.Result;
import com.elon.apicenter.service.DemoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements DemoService {


    @Override
    public Result index() {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("you're visiting DemoService");
        return result;
    }

    @Override
    public Result sayMsg(@RequestBody DemoRequest demoRequest) {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("This is Demo Service ,you're message is"+ demoRequest.getMsg());
        return result;
    }
}
