package com.bytesbanana.msscbeerservice.web.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class BeerDto {
    private UUID id;
    private Integer version;

    private OffsetDateTime createDate;
    private  OffsetDateTime lastModifiedDate;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
    private BigDecimal price;

    private Integer quantityOnHand;
}
