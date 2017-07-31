package com.reus.reusweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lenovo on 2017/7/29.
 */

public class Weather {

    public String status;                   //代表请求的状态，ok表示成功

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    //由于daily_forecast中包含的是一个数组，因此这里使用List集合来引用Forecast类。
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
