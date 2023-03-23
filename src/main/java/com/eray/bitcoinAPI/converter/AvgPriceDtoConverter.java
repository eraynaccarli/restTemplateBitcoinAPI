package com.eray.bitcoinAPI.converter;

import com.eray.bitcoinAPI.dto.AvgPriceDto;
import com.eray.bitcoinAPI.model.AvgPrice;
import org.springframework.stereotype.Component;

@Component
public class AvgPriceDtoConverter {

    public AvgPriceDto convert(AvgPrice from){
        return new AvgPriceDto(from.getMins(),from.getPrice(),from.getSymbol());
    }
}
