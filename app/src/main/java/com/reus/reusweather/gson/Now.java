package com.reus.reusweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/7/29.
 */

//当前的天气信息
public class Now {

    @SerializedName("tmp")
    public String temperature;                           //这个字段是温度

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;                             //这个字段是其他天气信息，比如阵雨之类的
    }
}
