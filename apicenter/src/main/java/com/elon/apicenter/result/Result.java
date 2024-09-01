package com.elon.apicenter.result;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Result implements Serializable {

    private static final long serialVersionUID=1L;
    private int code;
    private String message;
    private Object object;
}
