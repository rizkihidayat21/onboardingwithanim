package com.example.isekai
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

enum class OnBoardingPage(
    @StringRes val titleResource: Int,
    @StringRes val subTitleResource: Int,
    @StringRes val descriptionResource: Int,
    @DrawableRes val logoResource: Int
) {

    ONE(R.string.atur_priori, R.string.atur_priori,R.string.atur_priori, R.drawable.hotel_v_05),
    TWO(R.string.opini_yang_, R.string.opini_yang_,R.string.opini_yang_, R.drawable.rent_car),
    THREE(R.string.kolaborasi1, R.string.kolaborasi1,R.string.kolaborasi1, R.drawable.ticket)

}