package com.duravit.features.location.api

import com.duravit.features.location.shopdurationapi.ShopDurationApi
import com.duravit.features.location.shopdurationapi.ShopDurationRepository

/**
 * Created by Saikat on 17-Aug-20.
 */
object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}