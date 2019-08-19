package com.miaoshaproject.response;

public class CommonReturnType {
    //表明对应请求的返回处理结果"success" 和 "fail"
    private String status;

    //status == success ,则data内返回前端需要的json数据
    //status == fail ,则data使用通用的错误格式

    private Object data;


    //定义一个通用的创建方法
    public static CommonReturnType creat(Object result){
        return CommonReturnType.creat(result,"success");
    }
    //不带status就是success
    public static CommonReturnType creat(Object result, String status){
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
