package com.skplanet.sellerpcs.batch.domain.sendemail.repository;

import com.skplanet.sellerpcs.batch.domain.sendemail.service.ProductSales2;

import java.util.List;

public interface TestRepository {
    List<ProductSales2> findProductSales2(long productNo, int dayRange);
}
