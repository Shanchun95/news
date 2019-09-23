package com.hsc.news.vo;


public class R {
    private int code;    //状态编号
    private String msg;  //登录状态信息
    private Object data; //方法传递的参数

    public R() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static R setOK(String msg, Object obj){
        R r = new R();
        r.setCode(200);
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }
    public static R setOK(String msg){
        R r = new R();
        r.setCode(200);
        r.setMsg(msg);
        r.setData(null);
        return r;
    }
    public static R setOK(){
        R r = new R();
        r.setCode(200);
        r.setMsg("OK");
        r.setData(null);
        return r;
    }
    public static R setERROR(String msg,Object obj){
        R r = new R();
        r.setCode(400);
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }
    public static R setERROR(String msg){
        R r = new R();
        r.setCode(400);
        r.setMsg(msg);
        r.setData(null);
        return r;
    }
    public static R setERROR(){
        R r = new R();
        r.setCode(200);
        r.setMsg("OK");
        r.setData(null);
        return r;
    }
    public static R setERROR(boolean issuccess){
        R r = new R();
        r.setCode(issuccess?200:400);
        r.setMsg("OK");
        r.setData(null);
        return r;
    }
}
