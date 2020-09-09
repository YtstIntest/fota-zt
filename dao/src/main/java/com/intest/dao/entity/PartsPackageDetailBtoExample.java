package com.intest.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartsPackageDetailBtoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    public PartsPackageDetailBtoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
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

        public Criteria andPartspackagedetailIdIsNull() {
            addCriterion("PARTSPACKAGEDETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdIsNotNull() {
            addCriterion("PARTSPACKAGEDETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdEqualTo(String value) {
            addCriterion("PARTSPACKAGEDETAIL_ID =", value, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdNotEqualTo(String value) {
            addCriterion("PARTSPACKAGEDETAIL_ID <>", value, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdGreaterThan(String value) {
            addCriterion("PARTSPACKAGEDETAIL_ID >", value, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTSPACKAGEDETAIL_ID >=", value, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdLessThan(String value) {
            addCriterion("PARTSPACKAGEDETAIL_ID <", value, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdLessThanOrEqualTo(String value) {
            addCriterion("PARTSPACKAGEDETAIL_ID <=", value, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdLike(String value) {
            addCriterion("PARTSPACKAGEDETAIL_ID like", value, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdNotLike(String value) {
            addCriterion("PARTSPACKAGEDETAIL_ID not like", value, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdIn(List<String> values) {
            addCriterion("PARTSPACKAGEDETAIL_ID in", values, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdNotIn(List<String> values) {
            addCriterion("PARTSPACKAGEDETAIL_ID not in", values, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdBetween(String value1, String value2) {
            addCriterion("PARTSPACKAGEDETAIL_ID between", value1, value2, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andPartspackagedetailIdNotBetween(String value1, String value2) {
            addCriterion("PARTSPACKAGEDETAIL_ID not between", value1, value2, "partspackagedetailId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdIsNull() {
            addCriterion("FK_PARTSPACKAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdIsNotNull() {
            addCriterion("FK_PARTSPACKAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdEqualTo(String value) {
            addCriterion("FK_PARTSPACKAGE_ID =", value, "fkPartspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdNotEqualTo(String value) {
            addCriterion("FK_PARTSPACKAGE_ID <>", value, "fkPartspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdGreaterThan(String value) {
            addCriterion("FK_PARTSPACKAGE_ID >", value, "fkPartspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_PARTSPACKAGE_ID >=", value, "fkPartspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdLessThan(String value) {
            addCriterion("FK_PARTSPACKAGE_ID <", value, "fkPartspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdLessThanOrEqualTo(String value) {
            addCriterion("FK_PARTSPACKAGE_ID <=", value, "fkPartspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdLike(String value) {
            addCriterion("FK_PARTSPACKAGE_ID like", value, "fkPartspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdNotLike(String value) {
            addCriterion("FK_PARTSPACKAGE_ID not like", value, "fkPartspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdIn(List<String> values) {
            addCriterion("FK_PARTSPACKAGE_ID in", values, "fkPartspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdNotIn(List<String> values) {
            addCriterion("FK_PARTSPACKAGE_ID not in", values, "fkPartspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdBetween(String value1, String value2) {
            addCriterion("FK_PARTSPACKAGE_ID between", value1, value2, "fkPartspackageId");
            return (Criteria) this;
        }

        public Criteria andFkPartspackageIdNotBetween(String value1, String value2) {
            addCriterion("FK_PARTSPACKAGE_ID not between", value1, value2, "fkPartspackageId");
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

        public Criteria andFiletypeIsNull() {
            addCriterion("FILETYPE is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("FILETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(BigDecimal value) {
            addCriterion("FILETYPE =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(BigDecimal value) {
            addCriterion("FILETYPE <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(BigDecimal value) {
            addCriterion("FILETYPE >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FILETYPE >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(BigDecimal value) {
            addCriterion("FILETYPE <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FILETYPE <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<BigDecimal> values) {
            addCriterion("FILETYPE in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<BigDecimal> values) {
            addCriterion("FILETYPE not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILETYPE between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILETYPE not between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberIsNull() {
            addCriterion("SOFTWARENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberIsNotNull() {
            addCriterion("SOFTWARENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberEqualTo(BigDecimal value) {
            addCriterion("SOFTWARENUMBER =", value, "softwarenumber");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberNotEqualTo(BigDecimal value) {
            addCriterion("SOFTWARENUMBER <>", value, "softwarenumber");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberGreaterThan(BigDecimal value) {
            addCriterion("SOFTWARENUMBER >", value, "softwarenumber");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOFTWARENUMBER >=", value, "softwarenumber");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberLessThan(BigDecimal value) {
            addCriterion("SOFTWARENUMBER <", value, "softwarenumber");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOFTWARENUMBER <=", value, "softwarenumber");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberIn(List<BigDecimal> values) {
            addCriterion("SOFTWARENUMBER in", values, "softwarenumber");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberNotIn(List<BigDecimal> values) {
            addCriterion("SOFTWARENUMBER not in", values, "softwarenumber");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOFTWARENUMBER between", value1, value2, "softwarenumber");
            return (Criteria) this;
        }

        public Criteria andSoftwarenumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOFTWARENUMBER not between", value1, value2, "softwarenumber");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated do_not_delete_during_merge Mon Aug 31 15:43:45 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table F_PARTSPACKAGEDETAIL
     *
     * @mbg.generated Mon Aug 31 15:43:45 CST 2020
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