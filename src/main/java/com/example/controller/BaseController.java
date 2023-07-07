package com.example.controller;

import com.example.enumvalues.ResponseStatus;
import com.example.util.GlobalApiResponse;

import java.io.Serializable;

/**
 * Base Controller
 */
public class BaseController implements Serializable {

    protected final ResponseStatus API_SUCCESS_STATUS = ResponseStatus.SUCCESS;

    protected final ResponseStatus API_ERROR_STATUS = ResponseStatus.FAIL;


    protected String moduleName;

    protected String module;


    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    protected GlobalApiResponse successResponse(String message, Object data) {
        GlobalApiResponse globalApiResponse = new GlobalApiResponse();
        globalApiResponse.setStatus(API_SUCCESS_STATUS);
        globalApiResponse.setMessage(message);
        globalApiResponse.setData(data);
        return globalApiResponse;
    }

    protected GlobalApiResponse errorResponse(String message, Object errors) {
        GlobalApiResponse globalApiResponse = new GlobalApiResponse();
        globalApiResponse.setStatus(API_ERROR_STATUS);
        globalApiResponse.setMessage(message);
        globalApiResponse.setData(errors);
        return globalApiResponse;
    }
}
