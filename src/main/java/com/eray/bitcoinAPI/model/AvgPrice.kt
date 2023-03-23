package com.eray.bitcoinAPI.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal
// Modelleri kotlin yapmamızın sebebi bizim için otomatik constructer ve getter setter üretiyor
// Lombok testlerde sorun çıkarıyor
data class AvgPrice(
        @JsonProperty("mins")
        val mins: Int,
        @JsonProperty("price")
        val price: BigDecimal,
        @JsonProperty("symbol")
        var symbol: String?
)
