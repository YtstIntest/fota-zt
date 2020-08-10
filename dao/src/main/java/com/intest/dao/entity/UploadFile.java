package com.intest.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UploadFile {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.UPLOADFILE_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String uploadfileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.ORIGINALNAME
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String originalname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.FILESIZE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private BigDecimal filesize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.LASTMODIFIEDDATE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private Date lastmodifieddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.UPLOADTYPE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private BigDecimal uploadtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.FK_VALUELIST_KEY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String fkValuelistKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.SERVERSIDEPATH
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String serversidepath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.UPLOADEDSUCCESS
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private BigDecimal uploadedsuccess;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.BEGINUPLOADINGTIME
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private Date beginuploadingtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.ENDUPLOADINGTIME
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private Date enduploadingtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.ISDELETE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private BigDecimal isdelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.CREATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private Date createat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.CREATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String createby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.UPDATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private Date updateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_UPLOADFILE.UPDATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    private String updateby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.UPLOADFILE_ID
     *
     * @return the value of F_UPLOADFILE.UPLOADFILE_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getUploadfileId() {
        return uploadfileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.UPLOADFILE_ID
     *
     * @param uploadfileId the value for F_UPLOADFILE.UPLOADFILE_ID
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setUploadfileId(String uploadfileId) {
        this.uploadfileId = uploadfileId == null ? null : uploadfileId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.ORIGINALNAME
     *
     * @return the value of F_UPLOADFILE.ORIGINALNAME
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getOriginalname() {
        return originalname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.ORIGINALNAME
     *
     * @param originalname the value for F_UPLOADFILE.ORIGINALNAME
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setOriginalname(String originalname) {
        this.originalname = originalname == null ? null : originalname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.FILESIZE
     *
     * @return the value of F_UPLOADFILE.FILESIZE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public BigDecimal getFilesize() {
        return filesize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.FILESIZE
     *
     * @param filesize the value for F_UPLOADFILE.FILESIZE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setFilesize(BigDecimal filesize) {
        this.filesize = filesize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.LASTMODIFIEDDATE
     *
     * @return the value of F_UPLOADFILE.LASTMODIFIEDDATE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public Date getLastmodifieddate() {
        return lastmodifieddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.LASTMODIFIEDDATE
     *
     * @param lastmodifieddate the value for F_UPLOADFILE.LASTMODIFIEDDATE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setLastmodifieddate(Date lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.UPLOADTYPE
     *
     * @return the value of F_UPLOADFILE.UPLOADTYPE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public BigDecimal getUploadtype() {
        return uploadtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.UPLOADTYPE
     *
     * @param uploadtype the value for F_UPLOADFILE.UPLOADTYPE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setUploadtype(BigDecimal uploadtype) {
        this.uploadtype = uploadtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.FK_VALUELIST_KEY
     *
     * @return the value of F_UPLOADFILE.FK_VALUELIST_KEY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getFkValuelistKey() {
        return fkValuelistKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.FK_VALUELIST_KEY
     *
     * @param fkValuelistKey the value for F_UPLOADFILE.FK_VALUELIST_KEY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setFkValuelistKey(String fkValuelistKey) {
        this.fkValuelistKey = fkValuelistKey == null ? null : fkValuelistKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.SERVERSIDEPATH
     *
     * @return the value of F_UPLOADFILE.SERVERSIDEPATH
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getServersidepath() {
        return serversidepath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.SERVERSIDEPATH
     *
     * @param serversidepath the value for F_UPLOADFILE.SERVERSIDEPATH
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setServersidepath(String serversidepath) {
        this.serversidepath = serversidepath == null ? null : serversidepath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.UPLOADEDSUCCESS
     *
     * @return the value of F_UPLOADFILE.UPLOADEDSUCCESS
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public BigDecimal getUploadedsuccess() {
        return uploadedsuccess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.UPLOADEDSUCCESS
     *
     * @param uploadedsuccess the value for F_UPLOADFILE.UPLOADEDSUCCESS
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setUploadedsuccess(BigDecimal uploadedsuccess) {
        this.uploadedsuccess = uploadedsuccess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.BEGINUPLOADINGTIME
     *
     * @return the value of F_UPLOADFILE.BEGINUPLOADINGTIME
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public Date getBeginuploadingtime() {
        return beginuploadingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.BEGINUPLOADINGTIME
     *
     * @param beginuploadingtime the value for F_UPLOADFILE.BEGINUPLOADINGTIME
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setBeginuploadingtime(Date beginuploadingtime) {
        this.beginuploadingtime = beginuploadingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.ENDUPLOADINGTIME
     *
     * @return the value of F_UPLOADFILE.ENDUPLOADINGTIME
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public Date getEnduploadingtime() {
        return enduploadingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.ENDUPLOADINGTIME
     *
     * @param enduploadingtime the value for F_UPLOADFILE.ENDUPLOADINGTIME
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setEnduploadingtime(Date enduploadingtime) {
        this.enduploadingtime = enduploadingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.ISDELETE
     *
     * @return the value of F_UPLOADFILE.ISDELETE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public BigDecimal getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.ISDELETE
     *
     * @param isdelete the value for F_UPLOADFILE.ISDELETE
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setIsdelete(BigDecimal isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.CREATEAT
     *
     * @return the value of F_UPLOADFILE.CREATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.CREATEAT
     *
     * @param createat the value for F_UPLOADFILE.CREATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.CREATEBY
     *
     * @return the value of F_UPLOADFILE.CREATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.CREATEBY
     *
     * @param createby the value for F_UPLOADFILE.CREATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.UPDATEAT
     *
     * @return the value of F_UPLOADFILE.UPDATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.UPDATEAT
     *
     * @param updateat the value for F_UPLOADFILE.UPDATEAT
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_UPLOADFILE.UPDATEBY
     *
     * @return the value of F_UPLOADFILE.UPDATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_UPLOADFILE.UPDATEBY
     *
     * @param updateby the value for F_UPLOADFILE.UPDATEBY
     *
     * @mbg.generated Sun Aug 09 22:33:09 CST 2020
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}