package br.com.queshua.condoconnect.data.dto

import br.com.queshua.condoconnect.domain.model.Product

data class ProductResponse(
    val total: Int,
    val products: List<Product>
)
