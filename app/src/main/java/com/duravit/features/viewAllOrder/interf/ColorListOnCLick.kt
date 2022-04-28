package com.duravit.features.viewAllOrder.interf

import com.duravit.app.domain.NewOrderGenderEntity
import com.duravit.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}