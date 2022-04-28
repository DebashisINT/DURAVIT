package com.duravit.features.weather.api

import com.duravit.features.task.api.TaskApi
import com.duravit.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}