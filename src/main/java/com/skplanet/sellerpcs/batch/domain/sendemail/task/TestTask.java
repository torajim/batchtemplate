package com.skplanet.sellerpcs.batch.domain.sendemail.task;

import com.skplanet.sellerpcs.batch.domain.sendemail.service.ProductSales2;
import com.skplanet.sellerpcs.batch.domain.sendemail.service.TestService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TestTask {
    private static final Logger log = LoggerFactory.getLogger(TestTask.class);

    @Autowired
    private TestService testService;

    @Scheduled(cron = "${emailalarm.schedule}")
    public void queryAndPrint(){
        List<ProductSales2> result = testService.getProductSales(1942676893, 52);
        result.forEach(s -> log.info(s.toString()));
    }
}