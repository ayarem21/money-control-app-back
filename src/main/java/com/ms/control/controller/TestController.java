package com.ms.control.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
/**
 * Simple test endpoint for health check or basic connectivity testing.
 * @return "hello" as plain text response
*/
    @GetMapping("/api/test")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
