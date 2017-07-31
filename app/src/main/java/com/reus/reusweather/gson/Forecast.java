package com.reus.reusweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/7/29.
 */

//未来几天的天气状况
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temprature temprature;

    @SerializedName("cond")
    public More more;

    public class Temprature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}