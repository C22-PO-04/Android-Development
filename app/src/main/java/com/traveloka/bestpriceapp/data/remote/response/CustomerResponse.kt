package com.traveloka.bestpriceapp.data.remote.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue


data class CustomerResponse(

	@field:SerializedName("values")
	val values: List<CustomerItem>,

	@field:SerializedName("message")
	val message: String
)
data class CustomerItem(

	@field:SerializedName("voucher") val voucher: List<Any>,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: String
)
