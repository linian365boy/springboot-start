package com.springboot.service.impl;

import com.springboot.dao.CityDao;
import com.springboot.domain.City;
import com.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tanfan
 * @ClassName: CityServiceImpl
 * @Description:
 * @date: 2017/5/22 19:20
 * @since JDK 1.7
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
