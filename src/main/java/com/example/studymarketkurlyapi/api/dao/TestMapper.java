package com.example.studymarketkurlyapi.api.dao;

import java.util.List;

import com.example.studymarketkurlyapi.api.dto.portfolio;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    List<portfolio> getAllDataList();
}