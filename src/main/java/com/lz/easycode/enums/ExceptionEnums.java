package com.lz.easycode.enums;

/**
 * @ClassName ExceptionEnums
 * @Description TODO    自定义异常枚举类
 * @Author LZ
 * @Date 2020/8/8 17:44
 * @Version 1.0
 **/
public enum  ExceptionEnums {

    SERVER_DO_ERROR             (1001,"交易处理失败"),
    SERVER_FTP_DOWN_ERROR       (1002,"从ftp下载文件失败"),
    SERVER_ALIYUN_UPLOAD_ERROR  (1003,"上传阿里云失败"),
    SERVER_IMG_ERROR            (1004,"图片错误"),
    SERVER_DB_ERROR             (1005,"数据库错误"),
    SERVER_DB_IS_NULL           (1006,"要查询的数据不存在"),
    /**
     *  TODO 可在此添加其它类型异常
     **/
    //枚举类如果写方法的话，此处需要写分号
    SERVER_OTHER_ERROR          (1099,"其他异常");

    private int ecode;

    private String emsg;

    ExceptionEnums(int ecode, String emsg) {
        this.ecode = ecode;
        this.emsg = emsg;
    }

    public int getEcode() {
        return ecode;
    }

    public String getEmsg() {
        return emsg;
    }

    public void setEcode(int ecode) {
        this.ecode = ecode;
    }

    public void setEmsg(String emsg) {
        this.emsg = emsg;
    }

    public static ExceptionEnums statOf(int ecode) {
        for (ExceptionEnums state : values()) {
            if (state.getEcode()== ecode) {
                return state;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ExceptionEnums{" +
                "ecode='" + ecode + '\'' +
                ", emsg='" + emsg + '\'' +
                '}';
    }
}


