package com.ljj.weather.dao;

import com.ljj.weather.pojo.weather;
import com.ljj.weather.util.HiveUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WeatherDao {

    public List<weather> GetWeatherInfo() throws SQLException {
        //编写SQL语句

        String sql = " select * from weather";
        //调用通用查询方法
        ResultSet resultSet = HiveUtils.query(sql);
        //处理结果
        List<weather> list = new ArrayList<>();
        while (resultSet.next()) {
            weather wt = new weather();
            wt.setDates(resultSet.getString("dates"));
            wt.setMax_temp(resultSet.getInt("max_temp"));
            wt.setMin_temp(resultSet.getInt("min_temp"));
            wt.setWeather_info(resultSet.getString("weather_info"));
            wt.setWind_direction(resultSet.getString("wind_direction"));
            wt.setWind_power(resultSet.getString("wind_power"));
            wt.setCity(resultSet.getString("city"));
            list.add(wt);
        }
        return list;
    }


    //条件查询

    public List<weather> GetWeatherInfoByCondition(String city) throws SQLException {
        //编写SQL语句
        String sql = "select * from weather where city = ?";
        //调用通用查询方法
        ResultSet resultSet = HiveUtils.query(sql,city);
        //处理结果
        List <weather> list = new ArrayList<>();
        while (resultSet.next()) {
            weather wt = new weather();
            wt.setDates(resultSet.getString("dates"));
            wt.setMax_temp(resultSet.getInt("max_temp"));
            wt.setMin_temp(resultSet.getInt("min_temp"));
            wt.setWeather_info(resultSet.getString("weather_info"));
            wt.setWind_direction(resultSet.getString("wind_direction"));
            wt.setWind_power(resultSet.getString("wind_power"));
            wt.setCity(resultSet.getString("city"));
            list.add(wt);
        }
        return list;
    }

    public List<weather> GetWeatherInfoByCondition0(String city) throws SQLException {
        //编写SQL语句
        String sql = "select dates,wind_power from weather\n" +
                "where dates like '%2014%'\n" +
                "and wind_power like '%5%'\n" +
                "and city ='乌鲁木齐'";
        //调用通用查询方法
        ResultSet resultSet = HiveUtils.query(sql,city);
        //处理结果
        List <weather> list = new ArrayList<>();
        while (resultSet.next()) {
            weather wt = new weather();
            wt.setDates(resultSet.getString("dates"));
            //wt.setMax_temp(resultSet.getInt("max_temp"));
            //wt.setMin_temp(resultSet.getInt("min_temp"));
            //wt.setWeather_info(resultSet.getString("weather_info"));
            //wt.setWind_direction(resultSet.getString("wind_direction"));
            wt.setWind_power(resultSet.getString("wind_power"));
            //wt.setCity(resultSet.getString("city"));
            list.add(wt);
        }
        return list;
    }




}
