package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CPayExample() {
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

        public Criteria andMilestoneIsNull() {
            addCriterion("milestone is null");
            return (Criteria) this;
        }

        public Criteria andMilestoneIsNotNull() {
            addCriterion("milestone is not null");
            return (Criteria) this;
        }

        public Criteria andMilestoneEqualTo(Byte value) {
            addCriterion("milestone =", value, "milestone");
            return (Criteria) this;
        }

        public Criteria andMilestoneNotEqualTo(Byte value) {
            addCriterion("milestone <>", value, "milestone");
            return (Criteria) this;
        }

        public Criteria andMilestoneGreaterThan(Byte value) {
            addCriterion("milestone >", value, "milestone");
            return (Criteria) this;
        }

        public Criteria andMilestoneGreaterThanOrEqualTo(Byte value) {
            addCriterion("milestone >=", value, "milestone");
            return (Criteria) this;
        }

        public Criteria andMilestoneLessThan(Byte value) {
            addCriterion("milestone <", value, "milestone");
            return (Criteria) this;
        }

        public Criteria andMilestoneLessThanOrEqualTo(Byte value) {
            addCriterion("milestone <=", value, "milestone");
            return (Criteria) this;
        }

        public Criteria andMilestoneIn(List<Byte> values) {
            addCriterion("milestone in", values, "milestone");
            return (Criteria) this;
        }

        public Criteria andMilestoneNotIn(List<Byte> values) {
            addCriterion("milestone not in", values, "milestone");
            return (Criteria) this;
        }

        public Criteria andMilestoneBetween(Byte value1, Byte value2) {
            addCriterion("milestone between", value1, value2, "milestone");
            return (Criteria) this;
        }

        public Criteria andMilestoneNotBetween(Byte value1, Byte value2) {
            addCriterion("milestone not between", value1, value2, "milestone");
            return (Criteria) this;
        }

        public Criteria andPercentageIsNull() {
            addCriterion("percentage is null");
            return (Criteria) this;
        }

        public Criteria andPercentageIsNotNull() {
            addCriterion("percentage is not null");
            return (Criteria) this;
        }

        public Criteria andPercentageEqualTo(Byte value) {
            addCriterion("percentage =", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotEqualTo(Byte value) {
            addCriterion("percentage <>", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageGreaterThan(Byte value) {
            addCriterion("percentage >", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageGreaterThanOrEqualTo(Byte value) {
            addCriterion("percentage >=", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageLessThan(Byte value) {
            addCriterion("percentage <", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageLessThanOrEqualTo(Byte value) {
            addCriterion("percentage <=", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageIn(List<Byte> values) {
            addCriterion("percentage in", values, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotIn(List<Byte> values) {
            addCriterion("percentage not in", values, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageBetween(Byte value1, Byte value2) {
            addCriterion("percentage between", value1, value2, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotBetween(Byte value1, Byte value2) {
            addCriterion("percentage not between", value1, value2, "percentage");
            return (Criteria) this;
        }

        public Criteria andConstractidIsNull() {
            addCriterion("constractID is null");
            return (Criteria) this;
        }

        public Criteria andConstractidIsNotNull() {
            addCriterion("constractID is not null");
            return (Criteria) this;
        }

        public Criteria andConstractidEqualTo(Integer value) {
            addCriterion("constractID =", value, "constractid");
            return (Criteria) this;
        }

        public Criteria andConstractidNotEqualTo(Integer value) {
            addCriterion("constractID <>", value, "constractid");
            return (Criteria) this;
        }

        public Criteria andConstractidGreaterThan(Integer value) {
            addCriterion("constractID >", value, "constractid");
            return (Criteria) this;
        }

        public Criteria andConstractidGreaterThanOrEqualTo(Integer value) {
            addCriterion("constractID >=", value, "constractid");
            return (Criteria) this;
        }

        public Criteria andConstractidLessThan(Integer value) {
            addCriterion("constractID <", value, "constractid");
            return (Criteria) this;
        }

        public Criteria andConstractidLessThanOrEqualTo(Integer value) {
            addCriterion("constractID <=", value, "constractid");
            return (Criteria) this;
        }

        public Criteria andConstractidIn(List<Integer> values) {
            addCriterion("constractID in", values, "constractid");
            return (Criteria) this;
        }

        public Criteria andConstractidNotIn(List<Integer> values) {
            addCriterion("constractID not in", values, "constractid");
            return (Criteria) this;
        }

        public Criteria andConstractidBetween(Integer value1, Integer value2) {
            addCriterion("constractID between", value1, value2, "constractid");
            return (Criteria) this;
        }

        public Criteria andConstractidNotBetween(Integer value1, Integer value2) {
            addCriterion("constractID not between", value1, value2, "constractid");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountIsNull() {
            addCriterion("Unpaidamount is null");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountIsNotNull() {
            addCriterion("Unpaidamount is not null");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountEqualTo(BigDecimal value) {
            addCriterion("Unpaidamount =", value, "unpaidamount");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountNotEqualTo(BigDecimal value) {
            addCriterion("Unpaidamount <>", value, "unpaidamount");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountGreaterThan(BigDecimal value) {
            addCriterion("Unpaidamount >", value, "unpaidamount");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Unpaidamount >=", value, "unpaidamount");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountLessThan(BigDecimal value) {
            addCriterion("Unpaidamount <", value, "unpaidamount");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Unpaidamount <=", value, "unpaidamount");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountIn(List<BigDecimal> values) {
            addCriterion("Unpaidamount in", values, "unpaidamount");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountNotIn(List<BigDecimal> values) {
            addCriterion("Unpaidamount not in", values, "unpaidamount");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Unpaidamount between", value1, value2, "unpaidamount");
            return (Criteria) this;
        }

        public Criteria andUnpaidamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Unpaidamount not between", value1, value2, "unpaidamount");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeIsNull() {
            addCriterion("invoicetime is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeIsNotNull() {
            addCriterion("invoicetime is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeEqualTo(Date value) {
            addCriterion("invoicetime =", value, "invoicetime");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeNotEqualTo(Date value) {
            addCriterion("invoicetime <>", value, "invoicetime");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeGreaterThan(Date value) {
            addCriterion("invoicetime >", value, "invoicetime");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("invoicetime >=", value, "invoicetime");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeLessThan(Date value) {
            addCriterion("invoicetime <", value, "invoicetime");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeLessThanOrEqualTo(Date value) {
            addCriterion("invoicetime <=", value, "invoicetime");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeIn(List<Date> values) {
            addCriterion("invoicetime in", values, "invoicetime");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeNotIn(List<Date> values) {
            addCriterion("invoicetime not in", values, "invoicetime");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeBetween(Date value1, Date value2) {
            addCriterion("invoicetime between", value1, value2, "invoicetime");
            return (Criteria) this;
        }

        public Criteria andInvoicetimeNotBetween(Date value1, Date value2) {
            addCriterion("invoicetime not between", value1, value2, "invoicetime");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
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
