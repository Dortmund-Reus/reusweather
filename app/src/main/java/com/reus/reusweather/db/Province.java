package com.reus.reusweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2017/7/27.
 */

public class Province extends DataSupport {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private int id;

    private String provinceName;

    private int provinceCode;


}
