package com.duravit.features.lead.api

import com.duravit.features.NewQuotation.api.GetQuotListRegRepository
import com.duravit.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}