package com.intest.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ToolbarItemBto {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_TOOLBARITEM.TOOLBARITEM_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private String toolbaritemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_TOOLBARITEM.FK_TOOLBAR_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private String fkToolbarId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_TOOLBARITEM.FK_ITEM_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private String fkItemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_TOOLBARITEM.INTDEX
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private BigDecimal intdex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_TOOLBARITEM.ISDELETE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private BigDecimal isdelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_TOOLBARITEM.CREATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private Date createat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_TOOLBARITEM.CREATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private String createby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_TOOLBARITEM.UPDATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private Date updateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_TOOLBARITEM.UPDATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    private String updateby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_TOOLBARITEM.TOOLBARITEM_ID
     *
     * @return the value of F_TOOLBARITEM.TOOLBARITEM_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public String getToolbaritemId() {
        return toolbaritemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_TOOLBARITEM.TOOLBARITEM_ID
     *
     * @param toolbaritemId the value for F_TOOLBARITEM.TOOLBARITEM_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setToolbaritemId(String toolbaritemId) {
        this.toolbaritemId = toolbaritemId == null ? null : toolbaritemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_TOOLBARITEM.FK_TOOLBAR_ID
     *
     * @return the value of F_TOOLBARITEM.FK_TOOLBAR_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public String getFkToolbarId() {
        return fkToolbarId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_TOOLBARITEM.FK_TOOLBAR_ID
     *
     * @param fkToolbarId the value for F_TOOLBARITEM.FK_TOOLBAR_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setFkToolbarId(String fkToolbarId) {
        this.fkToolbarId = fkToolbarId == null ? null : fkToolbarId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_TOOLBARITEM.FK_ITEM_ID
     *
     * @return the value of F_TOOLBARITEM.FK_ITEM_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public String getFkItemId() {
        return fkItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_TOOLBARITEM.FK_ITEM_ID
     *
     * @param fkItemId the value for F_TOOLBARITEM.FK_ITEM_ID
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setFkItemId(String fkItemId) {
        this.fkItemId = fkItemId == null ? null : fkItemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_TOOLBARITEM.INTDEX
     *
     * @return the value of F_TOOLBARITEM.INTDEX
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public BigDecimal getIntdex() {
        return intdex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_TOOLBARITEM.INTDEX
     *
     * @param intdex the value for F_TOOLBARITEM.INTDEX
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setIntdex(BigDecimal intdex) {
        this.intdex = intdex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_TOOLBARITEM.ISDELETE
     *
     * @return the value of F_TOOLBARITEM.ISDELETE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public BigDecimal getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_TOOLBARITEM.ISDELETE
     *
     * @param isdelete the value for F_TOOLBARITEM.ISDELETE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setIsdelete(BigDecimal isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_TOOLBARITEM.CREATEAT
     *
     * @return the value of F_TOOLBARITEM.CREATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_TOOLBARITEM.CREATEAT
     *
     * @param createat the value for F_TOOLBARITEM.CREATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_TOOLBARITEM.CREATEBY
     *
     * @return the value of F_TOOLBARITEM.CREATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_TOOLBARITEM.CREATEBY
     *
     * @param createby the value for F_TOOLBARITEM.CREATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_TOOLBARITEM.UPDATEAT
     *
     * @return the value of F_TOOLBARITEM.UPDATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_TOOLBARITEM.UPDATEAT
     *
     * @param updateat the value for F_TOOLBARITEM.UPDATEAT
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_TOOLBARITEM.UPDATEBY
     *
     * @return the value of F_TOOLBARITEM.UPDATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_TOOLBARITEM.UPDATEBY
     *
     * @param updateby the value for F_TOOLBARITEM.UPDATEBY
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}