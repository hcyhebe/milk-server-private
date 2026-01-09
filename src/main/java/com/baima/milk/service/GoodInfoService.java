package com.baima.milk.service;

import com.baima.milk.mapper.GoodInfoMapper;
import com.baima.milk.mapper.po.GoodInfo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodInfoService {

    @Autowired
    private GoodInfoMapper goodInfoMapper;

    public List<GoodInfo> findGoodInfos() {
        return goodInfoMapper.getAllGoodInfos();
    }

    public GoodInfo findGoodInfoById(Long id) {
        return goodInfoMapper.findGoodInfoById(id);
    }
}
