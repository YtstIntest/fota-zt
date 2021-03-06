package com.intest.dao.mapper;

import com.intest.dao.entity.OptionBto;
import com.intest.dao.entity.OptionBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OptionBtoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_OPTION
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    long countByExample(OptionBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_OPTION
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int deleteByExample(OptionBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_OPTION
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int deleteByPrimaryKey(String optionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_OPTION
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int insert(OptionBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_OPTION
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int insertSelective(OptionBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_OPTION
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    List<OptionBto> selectByExample(OptionBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_OPTION
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    OptionBto selectByPrimaryKey(String optionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_OPTION
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByExampleSelective(@Param("record") OptionBto record, @Param("example") OptionBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_OPTION
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByExample(@Param("record") OptionBto record, @Param("example") OptionBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_OPTION
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByPrimaryKeySelective(OptionBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_OPTION
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByPrimaryKey(OptionBto record);
}