/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.api.baseController;


public class BaseResource {

    private Integer status;

    private String message;

    private Object data;

    public ApiResponse success(Integer status,String message, Object data) {
        ApiResponse response = new ApiResponse();
        response.setMessage(message);
        response.setData(data);
        response.setStatus(status);
        return response;
    }

    public ApiResponse error(Integer status,String message, Object data) {
        ApiResponse response = new ApiResponse();
        response.setMessage(message);
        response.setData(data);
        response.setStatus(status);
        return response;
    }
}
