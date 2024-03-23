package com.ljj.weather.controller;

import com.ljj.weather.dao.WeatherDao;
import com.ljj.weather.pojo.weather;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.sql.SQLException;
import java.util.List;

@RestController
public class WeatherController extends HttpServlet{
    public static void main(String[] args) throws SQLException {
        //查询
        WeatherDao weatherDao = new WeatherDao();
        List<weather> list1 = weatherDao.GetWeatherInfo();
        for(weather wt : list1){
            System.out.println(wt.getDates()+','+
                               wt.getMax_temp()+','+wt.getMin_temp()+','+
                               wt.getWeather_info()+','+wt.getWind_direction()+','+
                               wt.getWind_power()+','+wt.getCity());
        }

    }
    @RequestMapping("/list")
    public List<weather> index() throws SQLException {
        WeatherDao weatherDao = new WeatherDao();
        List<weather> list1 = weatherDao.GetWeatherInfo();

        return list1;
    }
    @RequestMapping("/beijing")
    public List<weather> index0() throws SQLException {
        WeatherDao weatherDao = new WeatherDao();
        List<weather> list1 = weatherDao.GetWeatherInfoByCondition("北京");
        return list1;
    }
    @RequestMapping("/wulumuqi")
    public List<weather> index1() throws SQLException {
        WeatherDao weatherDao = new WeatherDao();
        List<weather> list1 = weatherDao.GetWeatherInfoByCondition("乌鲁木齐");
        return list1;
    }
    @RequestMapping("/shanghai")
    public List<weather> index2() throws SQLException {
        WeatherDao weatherDao = new WeatherDao();
        List<weather> list1 = weatherDao.GetWeatherInfoByCondition("上海");
        return list1;
    }
    @RequestMapping("/chongqing")
    public List<weather> index3() throws SQLException {
        WeatherDao weatherDao = new WeatherDao();
        List<weather> list1 = weatherDao.GetWeatherInfoByCondition("重庆");
        return list1;
    }
    @RequestMapping("/haerbin")
    public List<weather> index4() throws SQLException {
        WeatherDao weatherDao = new WeatherDao();
        List<weather> list1 = weatherDao.GetWeatherInfoByCondition("哈尔滨");
        return list1;
    }
    @RequestMapping("/xian")
    public List<weather> index5() throws SQLException {
        WeatherDao weatherDao = new WeatherDao();
        List<weather> list1 = weatherDao.GetWeatherInfoByCondition("西安");
        return list1;
    }
    @RequestMapping("/xiamen")
    public List<weather> index6() throws SQLException {
        WeatherDao weatherDao = new WeatherDao();
        List<weather> list1 = weatherDao.GetWeatherInfoByCondition("厦门");
        return list1;
    }
    @RequestMapping("/gg")
    public List<weather> index7() throws SQLException {
        WeatherDao weatherDao = new WeatherDao();
        List<weather> list1 = weatherDao.GetWeatherInfoByCondition0("厦门");
        return list1;
    }

}

