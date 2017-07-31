package com.reus.reusweather.gson;

/**
 * Created by lenovo on 2017/7/29.
 */

//当前空气质量状况
public class AQI {

    public AQIcity city;

    public class AQIcity {

        public String aqi;

        public String pm25;

    }
}
