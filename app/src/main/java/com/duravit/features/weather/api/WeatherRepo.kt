package com.duravit.features.weather.api

import com.duravit.base.BaseResponse
import com.duravit.features.task.api.TaskApi
import com.duravit.features.task.model.AddTaskInputModel
import com.duravit.features.weather.model.ForeCastAPIResponse
import com.duravit.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}