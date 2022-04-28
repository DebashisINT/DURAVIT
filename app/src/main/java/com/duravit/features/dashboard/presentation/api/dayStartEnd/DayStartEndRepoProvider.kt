package com.duravit.features.dashboard.presentation.api.dayStartEnd

import com.duravit.features.stockCompetetorStock.api.AddCompStockApi
import com.duravit.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}