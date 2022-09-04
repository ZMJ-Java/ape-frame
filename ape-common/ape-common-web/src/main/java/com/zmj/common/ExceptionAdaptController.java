package com.zmj.common;

import com.zmj.bean.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ZMJ
 * @Package com.zmj.common
 * @date 2022/9/3 14:09
 */
@RestControllerAdvice
public class ExceptionAdaptController {

    @ExceptionHandler({RuntimeException.class})
    public Result runTimeException(RuntimeException exception){
        exception.printStackTrace();
        return Result.fail();
    }

    @ExceptionHandler({Exception.class})
    public Result exception(RuntimeException exception){
        exception.printStackTrace();
        return Result.fail();
    }

}
