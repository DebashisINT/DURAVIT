package com.duravit.features.viewAllOrder.interf

import com.duravit.app.domain.NewOrderColorEntity
import com.duravit.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}