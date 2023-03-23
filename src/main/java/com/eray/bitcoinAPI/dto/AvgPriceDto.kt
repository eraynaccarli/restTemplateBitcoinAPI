package com.eray.bitcoinAPI.dto

import java.math.BigDecimal

data class AvgPriceDto(
        val mins: Int,
        val price: BigDecimal,
        var symbol: String?
)
