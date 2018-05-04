package com.skplanet.sellerpcs.batch.domain.sendemail.service;

import lombok.*;

import java.util.Date;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductSales2 {
    private Date basiDt;
    private long ordAmt;
}