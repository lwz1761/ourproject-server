package com.example.Service;

import com.example.entity.audioConfig;

public interface audioConfigService {

    int setConfigById(audioConfig record);

    audioConfig getConfigById(String userid);
}
