package com.elon.apicenter.service;

import com.elon.apicenter.request.DemoRequest;
import com.elon.apicenter.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface DemoService {

    @GetMapping("/")
    Result index();

    @PostMapping("/sayMsg")
    Result sayMsg(DemoRequest demoRequest);

}
