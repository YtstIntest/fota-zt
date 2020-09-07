package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarTypeBtoExample {
    /**
     * F_CARTYPE
     */
    protected String orderByClause;

    /**
     * F_CARTYPE
     */
    protected boolean distinct;

    /**
     * F_CARTYPE
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public CarTypeBtoExample() {
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
     * F_CARTYPE null
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

        public Criteria andCartypeIdIsNull() {
            addCriterion("CARTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIdIsNotNull() {
            addCriterion("CARTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeIdEqualTo(String value) {
            addCriterion("CARTYPE_ID =", value, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypeIdNotEqualTo(String value) {
            addCriterion("CARTYPE_ID <>", value, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypeIdGreaterThan(String value) {
            addCriterion("CARTYPE_ID >", value, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARTYPE_ID >=", value, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypeIdLessThan(String value) {
            addCriterion("CARTYPE_ID <", value, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypeIdLessThanOrEqualTo(String value) {
            addCriterion("CARTYPE_ID <=", value, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypeIdLike(String value) {
            addCriterion("CARTYPE_ID like", value, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypeIdNotLike(String value) {
            addCriterion("CARTYPE_ID not like", value, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypeIdIn(List<String> values) {
            addCriterion("CARTYPE_ID in", values, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypeIdNotIn(List<String> values) {
            addCriterion("CARTYPE_ID not in", values, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypeIdBetween(String value1, String value2) {
            addCriterion("CARTYPE_ID between", value1, value2, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypeIdNotBetween(String value1, String value2) {
            addCriterion("CARTYPE_ID not between", value1, value2, "cartypeId");
            return (Criteria) this;
        }

        public Criteria andCartypenameIsNull() {
            addCriterion("CARTYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andCartypenameIsNotNull() {
            addCriterion("CARTYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCartypenameEqualTo(String value) {
            addCriterion("CARTYPENAME =", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotEqualTo(String value) {
            addCriterion("CARTYPENAME <>", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameGreaterThan(String value) {
            addCriterion("CARTYPENAME >", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameGreaterThanOrEqualTo(String value) {
            addCriterion("CARTYPENAME >=", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameLessThan(String value) {
            addCriterion("CARTYPENAME <", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameLessThanOrEqualTo(String value) {
            addCriterion("CARTYPENAME <=", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameLike(String value) {
            addCriterion("CARTYPENAME like", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotLike(String value) {
            addCriterion("CARTYPENAME not like", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameIn(List<String> values) {
            addCriterion("CARTYPENAME in", values, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotIn(List<String> values) {
            addCriterion("CARTYPENAME not in", values, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameBetween(String value1, String value2) {
            addCriterion("CARTYPENAME between", value1, value2, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotBetween(String value1, String value2) {
            addCriterion("CARTYPENAME not between", value1, value2, "cartypename");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andFkTerminalIdIsNull() {
            addCriterion("FK_TERMINAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdIsNotNull() {
            addCriterion("FK_TERMINAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdEqualTo(String value) {
            addCriterion("FK_TERMINAL_ID =", value, "fkTerminalId");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdNotEqualTo(String value) {
            addCriterion("FK_TERMINAL_ID <>", value, "fkTerminalId");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdGreaterThan(String value) {
            addCriterion("FK_TERMINAL_ID >", value, "fkTerminalId");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_TERMINAL_ID >=", value, "fkTerminalId");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdLessThan(String value) {
            addCriterion("FK_TERMINAL_ID <", value, "fkTerminalId");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdLessThanOrEqualTo(String value) {
            addCriterion("FK_TERMINAL_ID <=", value, "fkTerminalId");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdLike(String value) {
            addCriterion("FK_TERMINAL_ID like", value, "fkTerminalId");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdNotLike(String value) {
            addCriterion("FK_TERMINAL_ID not like", value, "fkTerminalId");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdIn(List<String> values) {
            addCriterion("FK_TERMINAL_ID in", values, "fkTerminalId");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdNotIn(List<String> values) {
            addCriterion("FK_TERMINAL_ID not in", values, "fkTerminalId");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdBetween(String value1, String value2) {
            addCriterion("FK_TERMINAL_ID between", value1, value2, "fkTerminalId");
            return (Criteria) this;
        }

        public Criteria andFkTerminalIdNotBetween(String value1, String value2) {
            addCriterion("FK_TERMINAL_ID not between", value1, value2, "fkTerminalId");
            return (Criteria) this;
        }
    }

    /**
     * F_CARTYPE
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_CARTYPE null
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