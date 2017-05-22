package com.springboot.dao;

/**
 * @author tanfan
 * @ClassName: CityDao
 * @Description:
 * @date: 2017/5/22 19:15
 * @since JDK 1.7
 */

import com.springboot.domain.City;
import org.apache.ibatis.annotations.*;

/**
 * 城市 DAO 接口类
 *
 * Created by xchunzhao on 02/05/2017.
 */
public interface CityDao {
    City findByName(@Param("cityName") String cityName);
}
