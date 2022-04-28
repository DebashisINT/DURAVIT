package com.duravit.features.location.api

import com.duravit.app.Pref
import com.duravit.base.BaseResponse
import com.duravit.features.location.model.AppInfoInputModel
import com.duravit.features.location.model.AppInfoResponseModel
import com.duravit.features.location.model.ShopDurationRequest
import com.duravit.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }
}