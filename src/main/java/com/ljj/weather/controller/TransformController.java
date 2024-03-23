package com.ljj.weather.controller;

import com.ljj.weather.pojo.weather;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("show.do")
public class TransformController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String max_temps = req.getParameter("max_temp");
        String min_temps = req.getParameter("min_temp");
        String weather_infos = req.getParameter("weather_info");
        String wind_directions = req.getParameter("wind_direction");
        String wind_powers = req.getParameter("wind_power");
        int max_temp = Integer.parseInt(max_temps);
        int min_temp = Integer.parseInt(min_temps);
        weather wt = new weather();
        wt.setWind_power(wind_powers);
        wt.setWind_direction(wind_directions);
        wt.setMin_temp(min_temp);
        wt.setMax_temp(max_temp);
        wt.setWeather_info(weather_infos);
        req.setAttribute("weather_info",weather_infos);
        req.setAttribute("max_temp",max_temp);
        req.setAttribute("min_temp",min_temp);
        req.setAttribute("wind_direction",wind_directions);
        req.setAttribute("wind_power",wind_powers);
    }
}
