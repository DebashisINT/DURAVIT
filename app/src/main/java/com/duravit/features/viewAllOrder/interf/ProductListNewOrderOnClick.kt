package com.duravit.features.viewAllOrder.interf

import com.duravit.app.domain.NewOrderGenderEntity
import com.duravit.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}