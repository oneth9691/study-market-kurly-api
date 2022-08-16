package com.example.studymarketkurlyapi.api.service;

import java.util.List;

import com.example.studymarketkurlyapi.api.dao.TestMapper;
import com.example.studymarketkurlyapi.api.dto.portfolio;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestMapper testMapper;

    @Override
    public List<portfolio> getAllDataList() {
        return testMapper.getAllDataList();
    }
}