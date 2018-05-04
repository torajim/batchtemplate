package com.skplanet.sellerpcs.batch.domain.sendemail.service;

import java.util.List;

public interface TestService {
    List<ProductSales2> getProductSales(long productNo, int weekRange);
}