package com.skplanet.sellerpcs.batch.domain.sendemail.repository;

import lombok.*;

import java.util.Date;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductSales {
    private Date basiDt;
    private long ordAmt;
}