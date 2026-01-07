package com.baima.milk.mapper.po;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class GoodInfo {
    private String id;
    private String title;
    private String goodCategory;
    private String goodDesc;
    private BigDecimal price;
    private BigDecimal priPrice;
    private String brand;
    private String name;
    private String goodSpecific;
    private String images;
    private String detailImages;
    private Date createTime;
    private Date updateTime;
}
