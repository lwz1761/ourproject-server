package com.example.controller;



import com.example.Service.audioConfigService;
import com.example.entity.audioConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/myController")
public class myController {

    @Autowired(required = false)
    audioConfigService audioConfigService;


    @GetMapping("/getConfig")
    public audioConfig getConfig(String userId){

        return audioConfigService.getConfigById(userId);
    }

    @PostMapping("/setConfig")
    public int setConfig(@Validated @RequestBody audioConfig record){
        System.out.println(record.getUserid());
        return audioConfigService.setConfigById(record);
    }


}
