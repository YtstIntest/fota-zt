package com.intest.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Car {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_CAR.CAR_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String carId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_CAR.FK_CARTYPE_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String fkCartypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_CAR.VIN
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String vin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_CAR.LICENSE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String license;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_CAR.TERMINALCODE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String terminalcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_CAR.FK_SIMCARD_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String fkSimcardId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_CAR.ISDELETE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private BigDecimal isdelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_CAR.CREATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private Date createat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_CAR.CREATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String createby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_CAR.UPDATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private Date updateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_CAR.UPDATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String updateby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_CAR.CAR_ID
     *
     * @return the value of F_CAR.CAR_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getCarId() {
        return carId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_CAR.CAR_ID
     *
     * @param carId the value for F_CAR.CAR_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_CAR.FK_CARTYPE_ID
     *
     * @return the value of F_CAR.FK_CARTYPE_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getFkCartypeId() {
        return fkCartypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_CAR.FK_CARTYPE_ID
     *
     * @param fkCartypeId the value for F_CAR.FK_CARTYPE_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setFkCartypeId(String fkCartypeId) {
        this.fkCartypeId = fkCartypeId == null ? null : fkCartypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_CAR.VIN
     *
     * @return the value of F_CAR.VIN
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getVin() {
        return vin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_CAR.VIN
     *
     * @param vin the value for F_CAR.VIN
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_CAR.LICENSE
     *
     * @return the value of F_CAR.LICENSE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getLicense() {
        return license;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_CAR.LICENSE
     *
     * @param license the value for F_CAR.LICENSE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_CAR.TERMINALCODE
     *
     * @return the value of F_CAR.TERMINALCODE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getTerminalcode() {
        return terminalcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_CAR.TERMINALCODE
     *
     * @param terminalcode the value for F_CAR.TERMINALCODE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setTerminalcode(String terminalcode) {
        this.terminalcode = terminalcode == null ? null : terminalcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_CAR.FK_SIMCARD_ID
     *
     * @return the value of F_CAR.FK_SIMCARD_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getFkSimcardId() {
        return fkSimcardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_CAR.FK_SIMCARD_ID
     *
     * @param fkSimcardId the value for F_CAR.FK_SIMCARD_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setFkSimcardId(String fkSimcardId) {
        this.fkSimcardId = fkSimcardId == null ? null : fkSimcardId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_CAR.ISDELETE
     *
     * @return the value of F_CAR.ISDELETE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public BigDecimal getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_CAR.ISDELETE
     *
     * @param isdelete the value for F_CAR.ISDELETE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setIsdelete(BigDecimal isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_CAR.CREATEAT
     *
     * @return the value of F_CAR.CREATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_CAR.CREATEAT
     *
     * @param createat the value for F_CAR.CREATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_CAR.CREATEBY
     *
     * @return the value of F_CAR.CREATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_CAR.CREATEBY
     *
     * @param createby the value for F_CAR.CREATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_CAR.UPDATEAT
     *
     * @return the value of F_CAR.UPDATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_CAR.UPDATEAT
     *
     * @param updateat the value for F_CAR.UPDATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_CAR.UPDATEBY
     *
     * @return the value of F_CAR.UPDATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_CAR.UPDATEBY
     *
     * @param updateby the value for F_CAR.UPDATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}