package com.duravit.features.dashboard.presentation.api.dayStartEnd

import com.duravit.app.Pref
import com.duravit.base.BaseResponse
import com.duravit.features.dashboard.presentation.model.DaystartDayendRequest
import com.duravit.features.dashboard.presentation.model.StatusDayStartEnd
import com.duravit.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.duravit.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}