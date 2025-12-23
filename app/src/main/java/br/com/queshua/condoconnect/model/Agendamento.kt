package br.com.queshua.condoconnect.model

import android.os.Parcel
import android.os.Parcelable

data class Agendamento(
    val id: Int,
    val event: String?,
    val hour: String?,
    val date: String?,
    val description: String?
): Parcelable{

    constructor(parcel: Parcel):this(
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString()?: ""
    )

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, p1: Int) {
        parcel.writeInt(id)
        parcel.writeString(event)
        parcel.writeString(hour)
        parcel.writeString(date)
        parcel.writeString(description)
    }

    companion object CREATOR : Parcelable.Creator<Agendamento> {
        override fun createFromParcel(parcel: Parcel): Agendamento {
            return Agendamento(parcel)
        }

        override fun newArray(size: Int): Array<Agendamento?> {
            return arrayOfNulls(size)
        }
    }

}
