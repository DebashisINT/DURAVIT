package com.duravit.features.viewAllOrder.interf

import com.duravit.app.domain.NewOrderProductEntity
import com.duravit.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}