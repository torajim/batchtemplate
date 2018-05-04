package com.skplanet.sellerpcs.batch.domain.sendemail.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestMapper {
    List<ProductSales> selectProductSalesByProductNo(@Param("productNo") long productNo, @Param("dayRange") int dayRange);
}