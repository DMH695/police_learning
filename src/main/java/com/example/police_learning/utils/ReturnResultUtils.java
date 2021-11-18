package com.example.police_learning.utils;

import java.util.List;

public class ReturnResultUtils {
    /***
     * 成功不带数据
     * @return
     */
    public static ReturnResult returnSuccess(){
        ReturnResult returnResult=new ReturnResult();
        returnResult.setCode(200);
        returnResult.setMessage("success");
        return returnResult;
    }
    /***
     * 成功带数据
     * @return
     */
    public static ReturnResult returnSuccess(List<Object> data){
        ReturnResult returnResult=new ReturnResult();
        returnResult.setCode(200);
        returnResult.setData(data);
        return returnResult;
    }
    /***
     * 失败
     * @return
     */
    public static ReturnResult returnFail(Integer code,String message){
        ReturnResult returnResult=new ReturnResult();
        returnResult.setCode(code);
        returnResult.setMessage(message);
        return returnResult;
    }
}
