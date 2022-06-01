package com.example.demo.ventity;

import java.math.BigDecimal;

public class VConstract {
    private Integer id;

    private String maincode;

    private String code;

    private String name;

    private String client;

    private Integer year;

    private String contact;

    private String contacttel;

    private Byte deadline;

    private BigDecimal amount = new BigDecimal(0);

    private String state;

    private BigDecimal  crediting = new BigDecimal(0);

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaincode() {
        return maincode;
    }

    public void setMaincode(String maincode) {
        this.maincode = maincode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel;
    }

    public Byte getDeadline() {
        return deadline;
    }

    public void setDeadline(Byte deadline) {
        this.deadline = deadline;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal  amount) {
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal  getCrediting() {
        return crediting;
    }

    public void setCrediting(BigDecimal  crediting) {
        this.crediting = crediting;
    }

	@Override
	public String toString() {
		return "VConstract [id=" + id + ", maincode=" + maincode + ", code=" + code + ", name=" + name + ", client="
				+ client + ", year=" + year + ", contact=" + contact + ", contacttel=" + contacttel + ", deadline="
				+ deadline + ", amount=" + amount + ", state=" + state + ", crediting=" + crediting + "]";
	}

}
