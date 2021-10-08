package com.unicomer.productstore.config;

import com.unicomer.productstore.rest.model.ResponseObject;
import com.unicomer.productstore.util.exceptions.ObjectsNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ ObjectsNotFoundException.class })
    public ResponseEntity<ResponseObject<?>> handleObjectNotFOund(Exception ex, WebRequest request) {
        ResponseObject<?> response = new ResponseObject<>();
        response.setItemAvailability(null);
        response.setOK(false);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
