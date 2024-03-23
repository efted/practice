package com.ljj.weather.pojo;

public class weather {
    private String dates;
    private int max_temp;
    private int min_temp;
    private String weather_info;
    private String wind_direction;
    private String wind_power;
    private String city;

    public String getDates() {
        return dates;
    }

    public int getMax_temp() {
        return max_temp;
    }

    public int getMin_temp() {
        return min_temp;
    }

    public String getWeather_info() {
        return weather_info;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public String getWind_power() {
        return wind_power;
    }

    public String getCity() {
        return city;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public void setMax_temp(int max_temp) {
        this.max_temp = max_temp;
    }

    public void setMin_temp(int min_temp) {
        this.min_temp = min_temp;
    }

    public void setWeather_info(String weather_info) {
        this.weather_info = weather_info;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public void setWind_power(String wind_power) {
        this.wind_power = wind_power;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
