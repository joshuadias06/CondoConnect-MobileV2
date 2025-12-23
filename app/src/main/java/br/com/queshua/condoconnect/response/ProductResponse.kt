package br.com.queshua.condoconnect.response

import br.com.queshua.condoconnect.model.Product

data class ProductResponse(
    val total: Int,
    val products: List<Product>
)
