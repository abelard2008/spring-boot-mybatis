package com.remote.taizhou.article.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.remote.taizhou.article.domain.City;
/**
 * Created by abelard on 2/5/18.
 */
@Mapper
public interface CityMapper {
    @Select("select * from city where state = #{state}")
    City findByState(@Param("state") String state);
}
