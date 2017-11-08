package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * spring事务中运行时异常才会回滚
 *
 * Created by xiaolinzi on 2017/11/8.
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
