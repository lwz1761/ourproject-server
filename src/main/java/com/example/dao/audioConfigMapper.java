package com.example.dao;

import com.example.entity.audioConfig;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface audioConfigMapper {
    int insert(audioConfig record);

    int insertSelective(audioConfig record);

    int setConfigById(audioConfig record);

    audioConfig getConfigById(String userid);
}