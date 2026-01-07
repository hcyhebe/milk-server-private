package com.baima.milk.mapper;

import com.baima.milk.mapper.po.GoodInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodInfoMapper {
    @Select("SELECT * FROM good_info")
    List<GoodInfo> getAllGoodInfos();
}
