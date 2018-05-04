package com.skplanet.sellerpcs.batch.domain.sendemail.repository;

import com.skplanet.sellerpcs.batch.domain.sendemail.service.ProductSales2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Repository
@RequiredArgsConstructor
public class TestRepositoryImpl implements TestRepository{

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<ProductSales2> findProductSales2(long productNo, int dayRange) {
        List<ProductSales> orgList = testMapper.selectProductSalesByProductNo(productNo, dayRange);
        return orgList.stream()
                //.filter(s -> s.getOrdAmt() > 0)
                .map(o -> modelMapper.map(o, ProductSales2.class))
                .collect(Collectors.toList());
    }
}