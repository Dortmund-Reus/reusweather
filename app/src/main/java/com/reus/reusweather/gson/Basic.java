package com.reus.reusweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/7/29.
 */

//这个类包含的是城市的一些基本信息
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
