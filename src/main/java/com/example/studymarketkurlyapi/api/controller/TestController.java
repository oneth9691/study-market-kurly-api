package com.example.studymarketkurlyapi.api.controller;

import com.example.studymarketkurlyapi.api.dto.portfolio;
import com.example.studymarketkurlyapi.api.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TestController {
    private final TestService testService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "나이스";
    }

    @GetMapping("/test")
    @ResponseBody
    public List<portfolio> test() {

        return testService.getAllDataList();
    }
}