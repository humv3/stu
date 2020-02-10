package com.tian.common.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:TianZhenYu
 * @date:2020/1/30
 * @description:com.tian.common.util shop_parent
 */
@ControllerAdvice
public class CommonExceptionHandler {

      //返回json的错误信息
     @ExceptionHandler(Exception.class)
     @ResponseBody
     @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
     public Map<String, Object> handleUserNotExistsException(Exception e) {
            Map<String, Object> map = new HashMap<>();
            map.put("message", e.getMessage());
            return map;
     }
     //错误以后，跳转到自己定义的错误页面
      @ExceptionHandler(ArithmeticException.class)
      public String handleArithmeticException(ArithmeticException e) {
         System.out.println("handle1 500*到了**************");
         return "/500.html";
      }
}
