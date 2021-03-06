package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartsPackageBtoExample {
    /**
     * F_PARTSPACKAGE
     */
    protected String orderByClause;

    /**
     * F_PARTSPACKAGE
     */
    protected boolean distinct;

    /**
     * F_PARTSPACKAGE
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public PartsPackageBtoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * F_PARTSPACKAGE null
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPartspackageIdIsNull() {
            addCriterion("PARTSPACKAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdIsNotNull() {
            addCriterion("PARTSPACKAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdEqualTo(String value) {
            addCriterion("PARTSPACKAGE_ID =", value, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdNotEqualTo(String value) {
            addCriterion("PARTSPACKAGE_ID <>", value, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdGreaterThan(String value) {
            addCriterion("PARTSPACKAGE_ID >", value, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTSPACKAGE_ID >=", value, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdLessThan(String value) {
            addCriterion("PARTSPACKAGE_ID <", value, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdLessThanOrEqualTo(String value) {
            addCriterion("PARTSPACKAGE_ID <=", value, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdLike(String value) {
            addCriterion("PARTSPACKAGE_ID like", value, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdNotLike(String value) {
            addCriterion("PARTSPACKAGE_ID not like", value, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdIn(List<String> values) {
            addCriterion("PARTSPACKAGE_ID in", values, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdNotIn(List<String> values) {
            addCriterion("PARTSPACKAGE_ID not in", values, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdBetween(String value1, String value2) {
            addCriterion("PARTSPACKAGE_ID between", value1, value2, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andPartspackageIdNotBetween(String value1, String value2) {
            addCriterion("PARTSPACKAGE_ID not between", value1, value2, "partspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdIsNull() {
            addCriterion("FK_PARTSBIGPACKAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdIsNotNull() {
            addCriterion("FK_PARTSBIGPACKAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdEqualTo(String value) {
            addCriterion("FK_PARTSBIGPACKAGE_ID =", value, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdNotEqualTo(String value) {
            addCriterion("FK_PARTSBIGPACKAGE_ID <>", value, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdGreaterThan(String value) {
            addCriterion("FK_PARTSBIGPACKAGE_ID >", value, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_PARTSBIGPACKAGE_ID >=", value, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdLessThan(String value) {
            addCriterion("FK_PARTSBIGPACKAGE_ID <", value, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdLessThanOrEqualTo(String value) {
            addCriterion("FK_PARTSBIGPACKAGE_ID <=", value, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdLike(String value) {
            addCriterion("FK_PARTSBIGPACKAGE_ID like", value, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdNotLike(String value) {
            addCriterion("FK_PARTSBIGPACKAGE_ID not like", value, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdIn(List<String> values) {
            addCriterion("FK_PARTSBIGPACKAGE_ID in", values, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdNotIn(List<String> values) {
            addCriterion("FK_PARTSBIGPACKAGE_ID not in", values, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdBetween(String value1, String value2) {
            addCriterion("FK_PARTSBIGPACKAGE_ID between", value1, value2, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsbigpackageIdNotBetween(String value1, String value2) {
            addCriterion("FK_PARTSBIGPACKAGE_ID not between", value1, value2, "fkPartsbigpackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdIsNull() {
            addCriterion("FK_PARTS_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdIsNotNull() {
            addCriterion("FK_PARTS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdEqualTo(String value) {
            addCriterion("FK_PARTS_ID =", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdNotEqualTo(String value) {
            addCriterion("FK_PARTS_ID <>", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdGreaterThan(String value) {
            addCriterion("FK_PARTS_ID >", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_PARTS_ID >=", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdLessThan(String value) {
            addCriterion("FK_PARTS_ID <", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdLessThanOrEqualTo(String value) {
            addCriterion("FK_PARTS_ID <=", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdLike(String value) {
            addCriterion("FK_PARTS_ID like", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdNotLike(String value) {
            addCriterion("FK_PARTS_ID not like", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdIn(List<String> values) {
            addCriterion("FK_PARTS_ID in", values, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdNotIn(List<String> values) {
            addCriterion("FK_PARTS_ID not in", values, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdBetween(String value1, String value2) {
            addCriterion("FK_PARTS_ID between", value1, value2, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdNotBetween(String value1, String value2) {
            addCriterion("FK_PARTS_ID not between", value1, value2, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdIsNull() {
            addCriterion("FK_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkFileIdIsNotNull() {
            addCriterion("FK_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkFileIdEqualTo(String value) {
            addCriterion("FK_FILE_ID =", value, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdNotEqualTo(String value) {
            addCriterion("FK_FILE_ID <>", value, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdGreaterThan(String value) {
            addCriterion("FK_FILE_ID >", value, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_FILE_ID >=", value, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdLessThan(String value) {
            addCriterion("FK_FILE_ID <", value, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdLessThanOrEqualTo(String value) {
            addCriterion("FK_FILE_ID <=", value, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdLike(String value) {
            addCriterion("FK_FILE_ID like", value, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdNotLike(String value) {
            addCriterion("FK_FILE_ID not like", value, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdIn(List<String> values) {
            addCriterion("FK_FILE_ID in", values, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdNotIn(List<String> values) {
            addCriterion("FK_FILE_ID not in", values, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdBetween(String value1, String value2) {
            addCriterion("FK_FILE_ID between", value1, value2, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andFkFileIdNotBetween(String value1, String value2) {
            addCriterion("FK_FILE_ID not between", value1, value2, "fkFileId");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionIsNull() {
            addCriterion("SOFTWAREVERSION is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionIsNotNull() {
            addCriterion("SOFTWAREVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionEqualTo(String value) {
            addCriterion("SOFTWAREVERSION =", value, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionNotEqualTo(String value) {
            addCriterion("SOFTWAREVERSION <>", value, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionGreaterThan(String value) {
            addCriterion("SOFTWAREVERSION >", value, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTWAREVERSION >=", value, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionLessThan(String value) {
            addCriterion("SOFTWAREVERSION <", value, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionLessThanOrEqualTo(String value) {
            addCriterion("SOFTWAREVERSION <=", value, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionLike(String value) {
            addCriterion("SOFTWAREVERSION like", value, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionNotLike(String value) {
            addCriterion("SOFTWAREVERSION not like", value, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionIn(List<String> values) {
            addCriterion("SOFTWAREVERSION in", values, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionNotIn(List<String> values) {
            addCriterion("SOFTWAREVERSION not in", values, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionBetween(String value1, String value2) {
            addCriterion("SOFTWAREVERSION between", value1, value2, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andSoftwareversionNotBetween(String value1, String value2) {
            addCriterion("SOFTWAREVERSION not between", value1, value2, "softwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionIsNull() {
            addCriterion("HARDWAREVERSION is null");
            return (Criteria) this;
        }

        public Criteria andHardwareversionIsNotNull() {
            addCriterion("HARDWAREVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareversionEqualTo(String value) {
            addCriterion("HARDWAREVERSION =", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionNotEqualTo(String value) {
            addCriterion("HARDWAREVERSION <>", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionGreaterThan(String value) {
            addCriterion("HARDWAREVERSION >", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionGreaterThanOrEqualTo(String value) {
            addCriterion("HARDWAREVERSION >=", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionLessThan(String value) {
            addCriterion("HARDWAREVERSION <", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionLessThanOrEqualTo(String value) {
            addCriterion("HARDWAREVERSION <=", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionLike(String value) {
            addCriterion("HARDWAREVERSION like", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionNotLike(String value) {
            addCriterion("HARDWAREVERSION not like", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionIn(List<String> values) {
            addCriterion("HARDWAREVERSION in", values, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionNotIn(List<String> values) {
            addCriterion("HARDWAREVERSION not in", values, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionBetween(String value1, String value2) {
            addCriterion("HARDWAREVERSION between", value1, value2, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionNotBetween(String value1, String value2) {
            addCriterion("HARDWAREVERSION not between", value1, value2, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andPartnumberIsNull() {
            addCriterion("PARTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPartnumberIsNotNull() {
            addCriterion("PARTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPartnumberEqualTo(String value) {
            addCriterion("PARTNUMBER =", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberNotEqualTo(String value) {
            addCriterion("PARTNUMBER <>", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberGreaterThan(String value) {
            addCriterion("PARTNUMBER >", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberGreaterThanOrEqualTo(String value) {
            addCriterion("PARTNUMBER >=", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberLessThan(String value) {
            addCriterion("PARTNUMBER <", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberLessThanOrEqualTo(String value) {
            addCriterion("PARTNUMBER <=", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberLike(String value) {
            addCriterion("PARTNUMBER like", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberNotLike(String value) {
            addCriterion("PARTNUMBER not like", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberIn(List<String> values) {
            addCriterion("PARTNUMBER in", values, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberNotIn(List<String> values) {
            addCriterion("PARTNUMBER not in", values, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberBetween(String value1, String value2) {
            addCriterion("PARTNUMBER between", value1, value2, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberNotBetween(String value1, String value2) {
            addCriterion("PARTNUMBER not between", value1, value2, "partnumber");
            return (Criteria) this;
        }

        public Criteria andSendidIsNull() {
            addCriterion("SENDID is null");
            return (Criteria) this;
        }

        public Criteria andSendidIsNotNull() {
            addCriterion("SENDID is not null");
            return (Criteria) this;
        }

        public Criteria andSendidEqualTo(String value) {
            addCriterion("SENDID =", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotEqualTo(String value) {
            addCriterion("SENDID <>", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidGreaterThan(String value) {
            addCriterion("SENDID >", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidGreaterThanOrEqualTo(String value) {
            addCriterion("SENDID >=", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLessThan(String value) {
            addCriterion("SENDID <", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLessThanOrEqualTo(String value) {
            addCriterion("SENDID <=", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLike(String value) {
            addCriterion("SENDID like", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotLike(String value) {
            addCriterion("SENDID not like", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidIn(List<String> values) {
            addCriterion("SENDID in", values, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotIn(List<String> values) {
            addCriterion("SENDID not in", values, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidBetween(String value1, String value2) {
            addCriterion("SENDID between", value1, value2, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotBetween(String value1, String value2) {
            addCriterion("SENDID not between", value1, value2, "sendid");
            return (Criteria) this;
        }

        public Criteria andReceiveidIsNull() {
            addCriterion("RECEIVEID is null");
            return (Criteria) this;
        }

        public Criteria andReceiveidIsNotNull() {
            addCriterion("RECEIVEID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveidEqualTo(String value) {
            addCriterion("RECEIVEID =", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidNotEqualTo(String value) {
            addCriterion("RECEIVEID <>", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidGreaterThan(String value) {
            addCriterion("RECEIVEID >", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEID >=", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidLessThan(String value) {
            addCriterion("RECEIVEID <", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEID <=", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidLike(String value) {
            addCriterion("RECEIVEID like", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidNotLike(String value) {
            addCriterion("RECEIVEID not like", value, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidIn(List<String> values) {
            addCriterion("RECEIVEID in", values, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidNotIn(List<String> values) {
            addCriterion("RECEIVEID not in", values, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidBetween(String value1, String value2) {
            addCriterion("RECEIVEID between", value1, value2, "receiveid");
            return (Criteria) this;
        }

        public Criteria andReceiveidNotBetween(String value1, String value2) {
            addCriterion("RECEIVEID not between", value1, value2, "receiveid");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberIsNull() {
            addCriterion("PARTSASSEMBLYNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberIsNotNull() {
            addCriterion("PARTSASSEMBLYNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberEqualTo(String value) {
            addCriterion("PARTSASSEMBLYNUMBER =", value, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberNotEqualTo(String value) {
            addCriterion("PARTSASSEMBLYNUMBER <>", value, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberGreaterThan(String value) {
            addCriterion("PARTSASSEMBLYNUMBER >", value, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberGreaterThanOrEqualTo(String value) {
            addCriterion("PARTSASSEMBLYNUMBER >=", value, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberLessThan(String value) {
            addCriterion("PARTSASSEMBLYNUMBER <", value, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberLessThanOrEqualTo(String value) {
            addCriterion("PARTSASSEMBLYNUMBER <=", value, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberLike(String value) {
            addCriterion("PARTSASSEMBLYNUMBER like", value, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberNotLike(String value) {
            addCriterion("PARTSASSEMBLYNUMBER not like", value, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberIn(List<String> values) {
            addCriterion("PARTSASSEMBLYNUMBER in", values, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberNotIn(List<String> values) {
            addCriterion("PARTSASSEMBLYNUMBER not in", values, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberBetween(String value1, String value2) {
            addCriterion("PARTSASSEMBLYNUMBER between", value1, value2, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andPartsassemblynumberNotBetween(String value1, String value2) {
            addCriterion("PARTSASSEMBLYNUMBER not between", value1, value2, "partsassemblynumber");
            return (Criteria) this;
        }

        public Criteria andMd5IsNull() {
            addCriterion("MD5 is null");
            return (Criteria) this;
        }

        public Criteria andMd5IsNotNull() {
            addCriterion("MD5 is not null");
            return (Criteria) this;
        }

        public Criteria andMd5EqualTo(String value) {
            addCriterion("MD5 =", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotEqualTo(String value) {
            addCriterion("MD5 <>", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThan(String value) {
            addCriterion("MD5 >", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThanOrEqualTo(String value) {
            addCriterion("MD5 >=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThan(String value) {
            addCriterion("MD5 <", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThanOrEqualTo(String value) {
            addCriterion("MD5 <=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Like(String value) {
            addCriterion("MD5 like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotLike(String value) {
            addCriterion("MD5 not like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5In(List<String> values) {
            addCriterion("MD5 in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotIn(List<String> values) {
            addCriterion("MD5 not in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Between(String value1, String value2) {
            addCriterion("MD5 between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotBetween(String value1, String value2) {
            addCriterion("MD5 not between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIsNull() {
            addCriterion("PROJECTCODE is null");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIsNotNull() {
            addCriterion("PROJECTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectcodeEqualTo(String value) {
            addCriterion("PROJECTCODE =", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotEqualTo(String value) {
            addCriterion("PROJECTCODE <>", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThan(String value) {
            addCriterion("PROJECTCODE >", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTCODE >=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThan(String value) {
            addCriterion("PROJECTCODE <", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThanOrEqualTo(String value) {
            addCriterion("PROJECTCODE <=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLike(String value) {
            addCriterion("PROJECTCODE like", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotLike(String value) {
            addCriterion("PROJECTCODE not like", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIn(List<String> values) {
            addCriterion("PROJECTCODE in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotIn(List<String> values) {
            addCriterion("PROJECTCODE not in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeBetween(String value1, String value2) {
            addCriterion("PROJECTCODE between", value1, value2, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotBetween(String value1, String value2) {
            addCriterion("PROJECTCODE not between", value1, value2, "projectcode");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("ISDELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("ISDELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Short value) {
            addCriterion("ISDELETE =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Short value) {
            addCriterion("ISDELETE <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Short value) {
            addCriterion("ISDELETE >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Short value) {
            addCriterion("ISDELETE >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Short value) {
            addCriterion("ISDELETE <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Short value) {
            addCriterion("ISDELETE <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Short> values) {
            addCriterion("ISDELETE in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Short> values) {
            addCriterion("ISDELETE not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Short value1, Short value2) {
            addCriterion("ISDELETE between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Short value1, Short value2) {
            addCriterion("ISDELETE not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNull() {
            addCriterion("CREATEAT is null");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNotNull() {
            addCriterion("CREATEAT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateatEqualTo(Date value) {
            addCriterion("CREATEAT =", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotEqualTo(Date value) {
            addCriterion("CREATEAT <>", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThan(Date value) {
            addCriterion("CREATEAT >", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEAT >=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThan(Date value) {
            addCriterion("CREATEAT <", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThanOrEqualTo(Date value) {
            addCriterion("CREATEAT <=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatIn(List<Date> values) {
            addCriterion("CREATEAT in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotIn(List<Date> values) {
            addCriterion("CREATEAT not in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatBetween(Date value1, Date value2) {
            addCriterion("CREATEAT between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotBetween(Date value1, Date value2) {
            addCriterion("CREATEAT not between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("CREATEBY is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("CREATEBY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("CREATEBY =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("CREATEBY <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("CREATEBY >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEBY >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("CREATEBY <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("CREATEBY <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("CREATEBY like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("CREATEBY not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("CREATEBY in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("CREATEBY not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("CREATEBY between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("CREATEBY not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNull() {
            addCriterion("UPDATEAT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNotNull() {
            addCriterion("UPDATEAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateatEqualTo(Date value) {
            addCriterion("UPDATEAT =", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotEqualTo(Date value) {
            addCriterion("UPDATEAT <>", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThan(Date value) {
            addCriterion("UPDATEAT >", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATEAT >=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThan(Date value) {
            addCriterion("UPDATEAT <", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThanOrEqualTo(Date value) {
            addCriterion("UPDATEAT <=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatIn(List<Date> values) {
            addCriterion("UPDATEAT in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotIn(List<Date> values) {
            addCriterion("UPDATEAT not in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatBetween(Date value1, Date value2) {
            addCriterion("UPDATEAT between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotBetween(Date value1, Date value2) {
            addCriterion("UPDATEAT not between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("UPDATEBY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("UPDATEBY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("UPDATEBY =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("UPDATEBY <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("UPDATEBY >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEBY >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("UPDATEBY <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("UPDATEBY <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("UPDATEBY like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("UPDATEBY not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("UPDATEBY in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("UPDATEBY not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("UPDATEBY between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("UPDATEBY not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIsNull() {
            addCriterion("PACKAGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIsNotNull() {
            addCriterion("PACKAGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPackagetypeEqualTo(Short value) {
            addCriterion("PACKAGETYPE =", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNotEqualTo(Short value) {
            addCriterion("PACKAGETYPE <>", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeGreaterThan(Short value) {
            addCriterion("PACKAGETYPE >", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PACKAGETYPE >=", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeLessThan(Short value) {
            addCriterion("PACKAGETYPE <", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeLessThanOrEqualTo(Short value) {
            addCriterion("PACKAGETYPE <=", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIn(List<Short> values) {
            addCriterion("PACKAGETYPE in", values, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNotIn(List<Short> values) {
            addCriterion("PACKAGETYPE not in", values, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeBetween(Short value1, Short value2) {
            addCriterion("PACKAGETYPE between", value1, value2, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNotBetween(Short value1, Short value2) {
            addCriterion("PACKAGETYPE not between", value1, value2, "packagetype");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionIsNull() {
            addCriterion("TARGETSOFTWAREVERSION is null");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionIsNotNull() {
            addCriterion("TARGETSOFTWAREVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionEqualTo(String value) {
            addCriterion("TARGETSOFTWAREVERSION =", value, "targetsoftwareversion");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionNotEqualTo(String value) {
            addCriterion("TARGETSOFTWAREVERSION <>", value, "targetsoftwareversion");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionGreaterThan(String value) {
            addCriterion("TARGETSOFTWAREVERSION >", value, "targetsoftwareversion");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionGreaterThanOrEqualTo(String value) {
            addCriterion("TARGETSOFTWAREVERSION >=", value, "targetsoftwareversion");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionLessThan(String value) {
            addCriterion("TARGETSOFTWAREVERSION <", value, "targetsoftwareversion");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionLessThanOrEqualTo(String value) {
            addCriterion("TARGETSOFTWAREVERSION <=", value, "targetsoftwareversion");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionLike(String value) {
            addCriterion("TARGETSOFTWAREVERSION like", value, "targetsoftwareversion");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionNotLike(String value) {
            addCriterion("TARGETSOFTWAREVERSION not like", value, "targetsoftwareversion");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionIn(List<String> values) {
            addCriterion("TARGETSOFTWAREVERSION in", values, "targetsoftwareversion");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionNotIn(List<String> values) {
            addCriterion("TARGETSOFTWAREVERSION not in", values, "targetsoftwareversion");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionBetween(String value1, String value2) {
            addCriterion("TARGETSOFTWAREVERSION between", value1, value2, "targetsoftwareversion");
            return (Criteria) this;
        }

        public Criteria andTargetsoftwareversionNotBetween(String value1, String value2) {
            addCriterion("TARGETSOFTWAREVERSION not between", value1, value2, "targetsoftwareversion");
            return (Criteria) this;
        }
    }

    /**
     * F_PARTSPACKAGE
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_PARTSPACKAGE null
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}