package com.duravit.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.duravit.app.FileUtils
import com.duravit.base.BaseResponse
import com.duravit.features.NewQuotation.model.*
import com.duravit.features.addshop.model.AddShopRequestData
import com.duravit.features.addshop.model.AddShopResponse
import com.duravit.features.damageProduct.model.DamageProductResponseModel
import com.duravit.features.damageProduct.model.delBreakageReq
import com.duravit.features.damageProduct.model.viewAllBreakageReq
import com.duravit.features.login.model.userconfig.UserConfigResponseModel
import com.duravit.features.myjobs.model.WIPImageSubmit
import com.duravit.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}