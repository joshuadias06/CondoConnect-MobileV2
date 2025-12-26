package br.com.queshua.condoconnect.data.remote.api

import br.com.queshua.condoconnect.data.dto.ProductResponse
import br.com.queshua.condoconnect.data.dto.ResponseEdit
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface ProductApi {
    @GET("api/products")
    fun getProducts(): Call<ProductResponse>

    @FormUrlEncoded
    @POST("api/products/create")
    fun createProduct(
        @Field("ProductId") id: Int,
        @Field("ProductName") name: String,
        @Field("ProductPrice") price: String,
        @Field("ProductDescription") description: String?,
        @Field("ProductImageUrl") imageUrl: String?
    ): Call<Void>

    @FormUrlEncoded
    @PUT("api/products/update")
    fun updateProduct(
        @Field("ProductId") id: Int,
        @Field("ProductName") name: String,
        @Field("ProductPrice") price: String,
        @Field("ProductDescription") description: String?,
        @Field("ProductImageUrl") imageUrl: String?
    ): Call<ResponseEdit>

    @FormUrlEncoded
    @DELETE("api/products/delete")
    fun deleteProduct(
        @Field("ProductId") id: Int
    ): Call<Void>

}