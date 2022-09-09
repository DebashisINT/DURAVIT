package com.duravit.features.newcollectionreport

import com.duravit.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}