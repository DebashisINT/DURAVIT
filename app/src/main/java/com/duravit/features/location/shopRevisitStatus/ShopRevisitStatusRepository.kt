package com.duravit.features.location.shopRevisitStatus

import com.duravit.base.BaseResponse
import com.duravit.features.location.model.ShopDurationRequest
import com.duravit.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}