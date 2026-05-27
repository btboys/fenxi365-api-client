package com.fenxi365.openapi.client.model;

import java.time.LocalDate;

public class Employee extends AcDetails {

    public enum Gender {
        MALE, FEMALE
    }

    private Gender gender;
    private Long departmentId;
    private String departmentName;
    private String post;
    private String job;
    private String telPhone;
    private LocalDate birthDate;
    private LocalDate onboardingDate;
    private LocalDate dimissionDate;
    private String idCard;
    private String bankName;
    private String bankAccount;
    private String email;
    private String edu;
    private String status;
    private Long provisionId;
    private Boolean purchase;
    private String payslipPassword;
    private Boolean payslipPwdChanged;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getOnboardingDate() {
        return onboardingDate;
    }

    public void setOnboardingDate(LocalDate onboardingDate) {
        this.onboardingDate = onboardingDate;
    }

    public LocalDate getDimissionDate() {
        return dimissionDate;
    }

    public void setDimissionDate(LocalDate dimissionDate) {
        this.dimissionDate = dimissionDate;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getProvisionId() {
        return provisionId;
    }

    public void setProvisionId(Long provisionId) {
        this.provisionId = provisionId;
    }

    public Boolean getPurchase() {
        return purchase;
    }

    public void setPurchase(Boolean purchase) {
        this.purchase = purchase;
    }

    public String getPayslipPassword() {
        return payslipPassword;
    }

    public void setPayslipPassword(String payslipPassword) {
        this.payslipPassword = payslipPassword;
    }

    public Boolean getPayslipPwdChanged() {
        return payslipPwdChanged;
    }

    public void setPayslipPwdChanged(Boolean payslipPwdChanged) {
        this.payslipPwdChanged = payslipPwdChanged;
    }
}
