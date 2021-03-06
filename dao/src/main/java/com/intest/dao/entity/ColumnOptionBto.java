package com.intest.dao.entity;

import java.util.Date;

public class ColumnOptionBto {
    /**
     * 主键 COLUMNOPTION_ID
     */
    private String columnoptionId;

    /**
     * 表格列选项ID FK_OPTION_ID
     */
    private String fkOptionId;

    /**
     * 表格列表ID FK_COLUMN_ID
     */
    private String fkColumnId;

    /**
     * 顺序 INTDEX
     */
    private Short intdex;

    /**
     * 是否删除 ISDELETE
     */
    private Short isdelete;

    /**
     * 创建时间 CREATEAT
     */
    private Date createat;

    /**
     * 创建人 CREATEBY
     */
    private String createby;

    /**
     * 修改时间 UPDATEAT
     */
    private Date updateat;

    /**
     * 修改人 UPDATEBY
     */
    private String updateby;

    /**
     * 主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return COLUMNOPTION_ID 主键
     */
    public String getColumnoptionId() {
        return columnoptionId;
    }

    /**
     * 主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param columnoptionId 主键
     */
    public void setColumnoptionId(String columnoptionId) {
        this.columnoptionId = columnoptionId == null ? null : columnoptionId.trim();
    }

    /**
     * 表格列选项ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FK_OPTION_ID 表格列选项ID
     */
    public String getFkOptionId() {
        return fkOptionId;
    }

    /**
     * 表格列选项ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fkOptionId 表格列选项ID
     */
    public void setFkOptionId(String fkOptionId) {
        this.fkOptionId = fkOptionId == null ? null : fkOptionId.trim();
    }

    /**
     * 表格列表ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FK_COLUMN_ID 表格列表ID
     */
    public String getFkColumnId() {
        return fkColumnId;
    }

    /**
     * 表格列表ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fkColumnId 表格列表ID
     */
    public void setFkColumnId(String fkColumnId) {
        this.fkColumnId = fkColumnId == null ? null : fkColumnId.trim();
    }

    /**
     * 顺序
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return INTDEX 顺序
     */
    public Short getIntdex() {
        return intdex;
    }

    /**
     * 顺序
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param intdex 顺序
     */
    public void setIntdex(Short intdex) {
        this.intdex = intdex;
    }

    /**
     * 是否删除
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ISDELETE 是否删除
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param isdelete 是否删除
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}