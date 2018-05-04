package com.skplanet.sellerpcs.batch.domain.sendemail.service;

import com.skplanet.sellerpcs.batch.domain.sendemail.repository.TestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestRepository testRepository;

    @Override
    public List<ProductSales2> getProductSales(long productNo, int weekRange) {
        return testRepository.findProductSales2(productNo, weekRange * 7);
    }
}