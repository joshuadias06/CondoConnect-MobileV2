package br.com.queshua.condoconnect.model

import android.os.Parcel
import android.os.Parcelable

data class Produto(
    val productId: Int,
    val productName: String,
    val productPrice: String,
    val productDescription: String?,
    val productImageUrl: String?
): Parcelable{

    constructor(parcel: Parcel):this(
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString()?: "",
        parcel.readString()?:""
    )

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, p1: Int) {
        parcel.writeInt(productId)
        parcel.writeString(productName)
        parcel.writeString(productPrice)
        parcel.writeString(productDescription)
        parcel.writeString(productImageUrl)
    }

    companion object CREATOR : Parcelable.Creator<Produto> {
        override fun createFromParcel(parcel: Parcel): Produto {
            return Produto(parcel)
        }

        override fun newArray(size: Int): Array<Produto?> {
            return arrayOfNulls(size)
        }
    }
}
