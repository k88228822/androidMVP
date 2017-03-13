package com.example.wang.test.entity;

/**
 * Created by wangzhen on 2016/12/20.
 */

public class TestResult {
    private String code;
    private String desc;
    private MyData data;

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setData(MyData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                ", data=" + data +
                '}';
    }

    public MyData getData() {
        return data;
    }

    public static class MyData{
        String id;
        String country;
        String province;
        String city;
        String district;
        String carrier;

        public String getIp() {
            return id;
        }

        public void setIp(String ip) {
            this.id = ip;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCarrier() {
            return carrier;
        }

        public void setCarrier(String carrier) {
            this.carrier = carrier;
        }

        @Override
        public String toString() {
            return "MyData{" +
                    "id='" + id + '\'' +
                    ", country='" + country + '\'' +
                    ", province='" + province + '\'' +
                    ", city='" + city + '\'' +
                    ", district='" + district + '\'' +
                    ", carrier='" + carrier + '\'' +
                    '}';
        }
    }

}
