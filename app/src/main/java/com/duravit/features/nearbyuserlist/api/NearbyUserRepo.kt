package com.duravit.features.nearbyuserlist.api

import com.duravit.app.Pref
import com.duravit.features.nearbyuserlist.model.NearbyUserResponseModel
import com.duravit.features.newcollection.model.NewCollectionListResponseModel
import com.duravit.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}