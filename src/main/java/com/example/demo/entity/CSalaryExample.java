package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CSalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CSalaryExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Byte value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Byte value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Byte value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Byte value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Byte value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Byte value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Byte> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Byte> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Byte value1, Byte value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Byte value1, Byte value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Integer value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Integer value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Integer value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Integer value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Integer> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Integer> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Integer value1, Integer value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceIsNull() {
            addCriterion("socialinsurance is null");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceIsNotNull() {
            addCriterion("socialinsurance is not null");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceEqualTo(BigDecimal value) {
            addCriterion("socialinsurance =", value, "socialinsurance");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceNotEqualTo(BigDecimal value) {
            addCriterion("socialinsurance <>", value, "socialinsurance");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceGreaterThan(BigDecimal value) {
            addCriterion("socialinsurance >", value, "socialinsurance");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("socialinsurance >=", value, "socialinsurance");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceLessThan(BigDecimal value) {
            addCriterion("socialinsurance <", value, "socialinsurance");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("socialinsurance <=", value, "socialinsurance");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceIn(List<BigDecimal> values) {
            addCriterion("socialinsurance in", values, "socialinsurance");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceNotIn(List<BigDecimal> values) {
            addCriterion("socialinsurance not in", values, "socialinsurance");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("socialinsurance between", value1, value2, "socialinsurance");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("socialinsurance not between", value1, value2, "socialinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceIsNull() {
            addCriterion("Medicalinsurance is null");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceIsNotNull() {
            addCriterion("Medicalinsurance is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceEqualTo(BigDecimal value) {
            addCriterion("Medicalinsurance =", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceNotEqualTo(BigDecimal value) {
            addCriterion("Medicalinsurance <>", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceGreaterThan(BigDecimal value) {
            addCriterion("Medicalinsurance >", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Medicalinsurance >=", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceLessThan(BigDecimal value) {
            addCriterion("Medicalinsurance <", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Medicalinsurance <=", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceIn(List<BigDecimal> values) {
            addCriterion("Medicalinsurance in", values, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceNotIn(List<BigDecimal> values) {
            addCriterion("Medicalinsurance not in", values, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Medicalinsurance between", value1, value2, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Medicalinsurance not between", value1, value2, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andHousingfundIsNull() {
            addCriterion("housingfund is null");
            return (Criteria) this;
        }

        public Criteria andHousingfundIsNotNull() {
            addCriterion("housingfund is not null");
            return (Criteria) this;
        }

        public Criteria andHousingfundEqualTo(BigDecimal value) {
            addCriterion("housingfund =", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundNotEqualTo(BigDecimal value) {
            addCriterion("housingfund <>", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundGreaterThan(BigDecimal value) {
            addCriterion("housingfund >", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("housingfund >=", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundLessThan(BigDecimal value) {
            addCriterion("housingfund <", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("housingfund <=", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundIn(List<BigDecimal> values) {
            addCriterion("housingfund in", values, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundNotIn(List<BigDecimal> values) {
            addCriterion("housingfund not in", values, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housingfund between", value1, value2, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housingfund not between", value1, value2, "housingfund");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andActualsalaryIsNull() {
            addCriterion("actualsalary is null");
            return (Criteria) this;
        }

        public Criteria andActualsalaryIsNotNull() {
            addCriterion("actualsalary is not null");
            return (Criteria) this;
        }

        public Criteria andActualsalaryEqualTo(BigDecimal value) {
            addCriterion("actualsalary =", value, "actualsalary");
            return (Criteria) this;
        }

        public Criteria andActualsalaryNotEqualTo(BigDecimal value) {
            addCriterion("actualsalary <>", value, "actualsalary");
            return (Criteria) this;
        }

        public Criteria andActualsalaryGreaterThan(BigDecimal value) {
            addCriterion("actualsalary >", value, "actualsalary");
            return (Criteria) this;
        }

        public Criteria andActualsalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actualsalary >=", value, "actualsalary");
            return (Criteria) this;
        }

        public Criteria andActualsalaryLessThan(BigDecimal value) {
            addCriterion("actualsalary <", value, "actualsalary");
            return (Criteria) this;
        }

        public Criteria andActualsalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actualsalary <=", value, "actualsalary");
            return (Criteria) this;
        }

        public Criteria andActualsalaryIn(List<BigDecimal> values) {
            addCriterion("actualsalary in", values, "actualsalary");
            return (Criteria) this;
        }

        public Criteria andActualsalaryNotIn(List<BigDecimal> values) {
            addCriterion("actualsalary not in", values, "actualsalary");
            return (Criteria) this;
        }

        public Criteria andActualsalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actualsalary between", value1, value2, "actualsalary");
            return (Criteria) this;
        }

        public Criteria andActualsalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actualsalary not between", value1, value2, "actualsalary");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNull() {
            addCriterion("staffid is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffid is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(Integer value) {
            addCriterion("staffid =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(Integer value) {
            addCriterion("staffid <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(Integer value) {
            addCriterion("staffid >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffid >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(Integer value) {
            addCriterion("staffid <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("staffid <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<Integer> values) {
            addCriterion("staffid in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<Integer> values) {
            addCriterion("staffid not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(Integer value1, Integer value2) {
            addCriterion("staffid between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffid not between", value1, value2, "staffid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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