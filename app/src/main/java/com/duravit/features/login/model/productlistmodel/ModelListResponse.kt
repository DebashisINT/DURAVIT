package com.duravit.features.login.model.productlistmodel

import com.duravit.app.domain.ModelEntity
import com.duravit.app.domain.ProductListEntity
import com.duravit.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}