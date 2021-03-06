package com.intest.dao.mapper;

import com.intest.dao.entity.ItemBto;
import com.intest.dao.entity.ItemBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemBtoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_ITEM
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    long countByExample(ItemBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_ITEM
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int deleteByExample(ItemBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_ITEM
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int deleteByPrimaryKey(String itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_ITEM
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int insert(ItemBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_ITEM
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int insertSelective(ItemBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_ITEM
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    List<ItemBto> selectByExample(ItemBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_ITEM
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    ItemBto selectByPrimaryKey(String itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_ITEM
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByExampleSelective(@Param("record") ItemBto record, @Param("example") ItemBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_ITEM
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByExample(@Param("record") ItemBto record, @Param("example") ItemBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_ITEM
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByPrimaryKeySelective(ItemBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_ITEM
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByPrimaryKey(ItemBto record);
}