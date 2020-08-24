package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TableColumnBtoExample {
    /**
     * F_TABLECOLUMN
     */
    protected String orderByClause;

    /**
     * F_TABLECOLUMN
     */
    protected boolean distinct;

    /**
     * F_TABLECOLUMN
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public TableColumnBtoExample() {
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
     * F_TABLECOLUMN null
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

        public Criteria andTablecolumnIdIsNull() {
            addCriterion("TABLECOLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdIsNotNull() {
            addCriterion("TABLECOLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdEqualTo(String value) {
            addCriterion("TABLECOLUMN_ID =", value, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdNotEqualTo(String value) {
            addCriterion("TABLECOLUMN_ID <>", value, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdGreaterThan(String value) {
            addCriterion("TABLECOLUMN_ID >", value, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdGreaterThanOrEqualTo(String value) {
            addCriterion("TABLECOLUMN_ID >=", value, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdLessThan(String value) {
            addCriterion("TABLECOLUMN_ID <", value, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdLessThanOrEqualTo(String value) {
            addCriterion("TABLECOLUMN_ID <=", value, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdLike(String value) {
            addCriterion("TABLECOLUMN_ID like", value, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdNotLike(String value) {
            addCriterion("TABLECOLUMN_ID not like", value, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdIn(List<String> values) {
            addCriterion("TABLECOLUMN_ID in", values, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdNotIn(List<String> values) {
            addCriterion("TABLECOLUMN_ID not in", values, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdBetween(String value1, String value2) {
            addCriterion("TABLECOLUMN_ID between", value1, value2, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andTablecolumnIdNotBetween(String value1, String value2) {
            addCriterion("TABLECOLUMN_ID not between", value1, value2, "tablecolumnId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdIsNull() {
            addCriterion("FK_TABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkTableIdIsNotNull() {
            addCriterion("FK_TABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkTableIdEqualTo(String value) {
            addCriterion("FK_TABLE_ID =", value, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdNotEqualTo(String value) {
            addCriterion("FK_TABLE_ID <>", value, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdGreaterThan(String value) {
            addCriterion("FK_TABLE_ID >", value, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_TABLE_ID >=", value, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdLessThan(String value) {
            addCriterion("FK_TABLE_ID <", value, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdLessThanOrEqualTo(String value) {
            addCriterion("FK_TABLE_ID <=", value, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdLike(String value) {
            addCriterion("FK_TABLE_ID like", value, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdNotLike(String value) {
            addCriterion("FK_TABLE_ID not like", value, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdIn(List<String> values) {
            addCriterion("FK_TABLE_ID in", values, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdNotIn(List<String> values) {
            addCriterion("FK_TABLE_ID not in", values, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdBetween(String value1, String value2) {
            addCriterion("FK_TABLE_ID between", value1, value2, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkTableIdNotBetween(String value1, String value2) {
            addCriterion("FK_TABLE_ID not between", value1, value2, "fkTableId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdIsNull() {
            addCriterion("FK_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdIsNotNull() {
            addCriterion("FK_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdEqualTo(String value) {
            addCriterion("FK_COLUMN_ID =", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdNotEqualTo(String value) {
            addCriterion("FK_COLUMN_ID <>", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdGreaterThan(String value) {
            addCriterion("FK_COLUMN_ID >", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_COLUMN_ID >=", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdLessThan(String value) {
            addCriterion("FK_COLUMN_ID <", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdLessThanOrEqualTo(String value) {
            addCriterion("FK_COLUMN_ID <=", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdLike(String value) {
            addCriterion("FK_COLUMN_ID like", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdNotLike(String value) {
            addCriterion("FK_COLUMN_ID not like", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdIn(List<String> values) {
            addCriterion("FK_COLUMN_ID in", values, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdNotIn(List<String> values) {
            addCriterion("FK_COLUMN_ID not in", values, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdBetween(String value1, String value2) {
            addCriterion("FK_COLUMN_ID between", value1, value2, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdNotBetween(String value1, String value2) {
            addCriterion("FK_COLUMN_ID not between", value1, value2, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Short value) {
            addCriterion("ORDER_NUM =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Short value) {
            addCriterion("ORDER_NUM <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Short value) {
            addCriterion("ORDER_NUM >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_NUM >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Short value) {
            addCriterion("ORDER_NUM <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_NUM <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Short> values) {
            addCriterion("ORDER_NUM in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Short> values) {
            addCriterion("ORDER_NUM not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Short value1, Short value2) {
            addCriterion("ORDER_NUM between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_NUM not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("WIDTH =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("WIDTH <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("WIDTH >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("WIDTH >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("WIDTH <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("WIDTH <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Integer> values) {
            addCriterion("WIDTH in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("WIDTH not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("WIDTH between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("WIDTH not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNull() {
            addCriterion("CHECKED is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNotNull() {
            addCriterion("CHECKED is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualTo(Short value) {
            addCriterion("CHECKED =", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualTo(Short value) {
            addCriterion("CHECKED <>", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThan(Short value) {
            addCriterion("CHECKED >", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualTo(Short value) {
            addCriterion("CHECKED >=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThan(Short value) {
            addCriterion("CHECKED <", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualTo(Short value) {
            addCriterion("CHECKED <=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedIn(List<Short> values) {
            addCriterion("CHECKED in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotIn(List<Short> values) {
            addCriterion("CHECKED not in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedBetween(Short value1, Short value2) {
            addCriterion("CHECKED between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotBetween(Short value1, Short value2) {
            addCriterion("CHECKED not between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("SORT like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("SORT not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("SORT not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andIscansortIsNull() {
            addCriterion("ISCANSORT is null");
            return (Criteria) this;
        }

        public Criteria andIscansortIsNotNull() {
            addCriterion("ISCANSORT is not null");
            return (Criteria) this;
        }

        public Criteria andIscansortEqualTo(Short value) {
            addCriterion("ISCANSORT =", value, "iscansort");
            return (Criteria) this;
        }

        public Criteria andIscansortNotEqualTo(Short value) {
            addCriterion("ISCANSORT <>", value, "iscansort");
            return (Criteria) this;
        }

        public Criteria andIscansortGreaterThan(Short value) {
            addCriterion("ISCANSORT >", value, "iscansort");
            return (Criteria) this;
        }

        public Criteria andIscansortGreaterThanOrEqualTo(Short value) {
            addCriterion("ISCANSORT >=", value, "iscansort");
            return (Criteria) this;
        }

        public Criteria andIscansortLessThan(Short value) {
            addCriterion("ISCANSORT <", value, "iscansort");
            return (Criteria) this;
        }

        public Criteria andIscansortLessThanOrEqualTo(Short value) {
            addCriterion("ISCANSORT <=", value, "iscansort");
            return (Criteria) this;
        }

        public Criteria andIscansortIn(List<Short> values) {
            addCriterion("ISCANSORT in", values, "iscansort");
            return (Criteria) this;
        }

        public Criteria andIscansortNotIn(List<Short> values) {
            addCriterion("ISCANSORT not in", values, "iscansort");
            return (Criteria) this;
        }

        public Criteria andIscansortBetween(Short value1, Short value2) {
            addCriterion("ISCANSORT between", value1, value2, "iscansort");
            return (Criteria) this;
        }

        public Criteria andIscansortNotBetween(Short value1, Short value2) {
            addCriterion("ISCANSORT not between", value1, value2, "iscansort");
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
    }

    /**
     * F_TABLECOLUMN
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_TABLECOLUMN null
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