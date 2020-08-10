package com.intest.dao.mapper;

import com.intest.dao.entity.Car;
import com.intest.dao.entity.CarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_CAR
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    long countByExample(CarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_CAR
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    int deleteByExample(CarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_CAR
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    int deleteByPrimaryKey(String carId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_CAR
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    int insert(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_CAR
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    int insertSelective(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_CAR
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    List<Car> selectByExample(CarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_CAR
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    Car selectByPrimaryKey(String carId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_CAR
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_CAR
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_CAR
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    int updateByPrimaryKeySelective(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_CAR
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    int updateByPrimaryKey(Car record);
}