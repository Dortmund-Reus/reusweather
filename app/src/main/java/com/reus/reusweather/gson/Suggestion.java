package com.reus.reusweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/7/29.
 */

//一些天气相关的生活建议
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
