package ee.sda.jremoteEE1blog.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler({NullPointerException.class, IndexOutOfBoundsException.class})
    String error(){
        return "indexoutofbounds";
    }

    @ExceptionHandler(IllegalStateException.class)
    String illegalState(){
        return "illegalStatement";
    }
}
