package com.elon.apicenter.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class DemoRequest extends BaseRequset implements Serializable {

    private static final long serialVersionUID=1L;
    private String msg;
}
