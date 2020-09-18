package com.example.dao;

import com.example.entity.audioConfig;

public interface audioConfigMapper {
    int insert(audioConfig record);

    int insertSelective(audioConfig record);
}