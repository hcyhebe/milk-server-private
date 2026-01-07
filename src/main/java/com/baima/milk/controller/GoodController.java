package com.baima.milk.controller;

import com.baima.milk.mapper.GoodInfoMapper;
import com.baima.milk.mapper.po.GoodInfo;
import com.baima.milk.service.GoodInfoService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private GoodInfoService goodInfoService;

    @GetMapping("/getAllGoodInfos")
    public String getAllGoodInfos() {
        List<GoodInfo> goodInfos = goodInfoService.findGoodInfos();
        return String.format("goodInfos : %s", goodInfos);
    }

}