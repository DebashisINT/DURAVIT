package com.duravit.features.location.shopRevisitStatus

import com.duravit.features.location.shopdurationapi.ShopDurationApi
import com.duravit.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}