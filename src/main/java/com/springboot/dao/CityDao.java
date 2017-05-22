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

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    @Select("SELECT * FROM city where city_name=#{cityName}")
// 返回 Map 结果集
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description"),
    })
    City findByName(@Param("cityName") String cityName);
}
