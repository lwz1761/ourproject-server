package com.example.ServiceImp;

import com.example.Service.audioConfigService;
import com.example.dao.audioConfigMapper;
import com.example.entity.audioConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class audioConfigServiceImp implements audioConfigService {

    @Autowired(required = false)
    audioConfigMapper mapper;


    @Override
    public int setConfigById(audioConfig record) {
        return mapper.setConfigById(record);
    }

    @Override
    public audioConfig getConfigById(String userid) {
        return mapper.getConfigById(userid);
    }
}
