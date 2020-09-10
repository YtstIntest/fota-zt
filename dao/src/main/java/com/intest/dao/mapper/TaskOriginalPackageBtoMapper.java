package com.intest.dao.mapper;

import com.intest.dao.entity.TaskOriginalPackageBto;
import com.intest.dao.entity.TaskOriginalPackageBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskOriginalPackageBtoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TASKORIGINALPACKAGE
     *
     * @mbg.generated Mon Sep 07 10:39:41 CST 2020
     */
    long countByExample(TaskOriginalPackageBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TASKORIGINALPACKAGE
     *
     * @mbg.generated Mon Sep 07 10:39:41 CST 2020
     */
    int deleteByExample(TaskOriginalPackageBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TASKORIGINALPACKAGE
     *
     * @mbg.generated Mon Sep 07 10:39:41 CST 2020
     */
    int deleteByPrimaryKey(String taskoriginalpackageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TASKORIGINALPACKAGE
     *
     * @mbg.generated Mon Sep 07 10:39:41 CST 2020
     */
    int insert(TaskOriginalPackageBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TASKORIGINALPACKAGE
     *
     * @mbg.generated Mon Sep 07 10:39:41 CST 2020
     */
    int insertSelective(TaskOriginalPackageBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TASKORIGINALPACKAGE
     *
     * @mbg.generated Mon Sep 07 10:39:41 CST 2020
     */
    List<TaskOriginalPackageBto> selectByExample(TaskOriginalPackageBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TASKORIGINALPACKAGE
     *
     * @mbg.generated Mon Sep 07 10:39:41 CST 2020
     */
    TaskOriginalPackageBto selectByPrimaryKey(String taskoriginalpackageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TASKORIGINALPACKAGE
     *
     * @mbg.generated Mon Sep 07 10:39:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") TaskOriginalPackageBto record, @Param("example") TaskOriginalPackageBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TASKORIGINALPACKAGE
     *
     * @mbg.generated Mon Sep 07 10:39:41 CST 2020
     */
    int updateByExample(@Param("record") TaskOriginalPackageBto record, @Param("example") TaskOriginalPackageBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TASKORIGINALPACKAGE
     *
     * @mbg.generated Mon Sep 07 10:39:41 CST 2020
     */
    int updateByPrimaryKeySelective(TaskOriginalPackageBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TASKORIGINALPACKAGE
     *
     * @mbg.generated Mon Sep 07 10:39:41 CST 2020
     */
    int updateByPrimaryKey(TaskOriginalPackageBto record);
}