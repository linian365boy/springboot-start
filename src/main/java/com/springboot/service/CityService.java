package com.springboot.service;

import com.springboot.domain.City;

/**
 * @author tanfan
 * @ClassName: CityService
 * @Description:
 * @date: 2017/5/22 19:19
 * @since JDK 1.7
 */
public interface CityService {
    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
