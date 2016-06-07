package com.sparg.java.model.sfdc;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: vimal.sengoden
 * Date: 6/3/2015
 * Time: 8:50 PM
 */

public class AbstractAccount extends AbstractSObject {

    @JsonProperty(value="RecordTypeId")
    protected String recordTypeId;
    @JsonProperty(value="ParentId")
    protected String parentId;
    @JsonProperty(value="Master_Policy_Number__c")
    protected String customerNumber;
    @JsonProperty(value="Branch_Number__c")
    protected String masterPolicyNumber;
    @JsonProperty(value="Name")
    protected String name;

    @JsonProperty(value="Phone")
    protected String phone;
    @JsonProperty(value="Fax")
    protected String fax;

    @JsonProperty(value="BillingStreet")
    protected String billingStreet;
    @JsonProperty(value="BillingCity")
    protected String billingCity;
    @JsonProperty(value="BillingState")
    protected String billingState;
    @JsonProperty(value="BillingPostalCode")
    protected String billingPostalCode;


    @JsonProperty(value="Same_as_Billing__c")
    protected boolean shippingAddressSameAsBilling;
    @JsonProperty(value="ShippingStreet")
    protected String shippingStreet;
    @JsonProperty(value="ShippingCity")
    protected String shippingCity;
    @JsonProperty(value="ShippingState")
    protected String shippingState;
    @JsonProperty(value="ShippingPostalCode")
    protected String shippingPostalCode;

    @JsonProperty(value="Rec_Relief_Delegated__c")
    protected boolean delegatedRescissionRelief;
    @JsonProperty(value="Delegated_Resc_Relief_Months__c")
    protected Integer delegatedRescissionReliefMonths;
    @JsonProperty(value="Delegated_Resc_Relief_Effective_Date__c")
    protected Date delegatedRescissionReliefEffectiveFrom;
    @JsonProperty(value="Delegated_Resc_Relief_End_Date__c")
    protected Date delegatedRescissionReliefEffectiveTo;

    @JsonProperty(value="Rec_Relief_Non_Delegated__c")
    protected boolean nonDelegatedRescissionRelief;
    @JsonProperty(value="Non_Delegated_Rec_Relief_Months__c")
    protected Integer nonDelegatedRescissionReliefMonths;
    @JsonProperty(value="Non_Delegated_Rec_Relief_Effective_Date__c")
    protected Date nonDelegatedRescissionReliefEffectiveFrom;
    @JsonProperty(value="Non_Delegated_Resc_Relief_End_Date__c")
    protected Date nonDelegatedRescissionReliefEffectiveTo;

    @JsonProperty(value="Other_Pricing_Enhancements__c")
    protected String effectivePricingLoanPrograms;

    public String getRecordTypeId() {
        return recordTypeId;
    }

    public void setRecordTypeId(final String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(final String parentId) {
        this.parentId = parentId;
    }

    public String getMasterPolicyNumber() {
        return masterPolicyNumber;
    }

    public void setMasterPolicyNumber(final String masterPolicyNumber) {
        this.masterPolicyNumber = masterPolicyNumber;
    }

    public void setCustomerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(final String fax) {
        this.fax = fax;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(final String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(final String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(final String billingState) {
        this.billingState = billingState;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(final String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public boolean isShippingAddressSameAsBilling() {
        return shippingAddressSameAsBilling;
    }

    public void setShippingAddressSameAsBilling(final boolean shippingAddressSameAsBilling) {
        this.shippingAddressSameAsBilling = shippingAddressSameAsBilling;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(final String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(final String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(final String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    public void setShippingPostalCode(final String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }

    public boolean isDelegatedRescissionRelief() {
        return delegatedRescissionRelief;
    }

    public void setDelegatedRescissionRelief(final boolean delegatedRescissionRelief) {
        this.delegatedRescissionRelief = delegatedRescissionRelief;
    }

    public Integer getDelegatedRescissionReliefMonths() {
        return delegatedRescissionReliefMonths;
    }

    public void setDelegatedRescissionReliefMonths(final Integer delegatedRescissionReliefMonths) {
        this.delegatedRescissionReliefMonths = delegatedRescissionReliefMonths;
    }

    public Date getDelegatedRescissionReliefEffectiveFrom() {
        return delegatedRescissionReliefEffectiveFrom;
    }

    public void setDelegatedRescissionReliefEffectiveFrom(final Date delegatedRescissionReliefEffectiveFrom) {
        this.delegatedRescissionReliefEffectiveFrom = delegatedRescissionReliefEffectiveFrom;
    }

    public Date getDelegatedRescissionReliefEffectiveTo() {
        return delegatedRescissionReliefEffectiveTo;
    }

    public void setDelegatedRescissionReliefEffectiveTo(final Date delegatedRescissionReliefEffectiveTo) {
        this.delegatedRescissionReliefEffectiveTo = delegatedRescissionReliefEffectiveTo;
    }

    public boolean isNonDelegatedRescissionRelief() {
        return nonDelegatedRescissionRelief;
    }

    public void setNonDelegatedRescissionRelief(final boolean nonDelegatedRescissionRelief) {
        this.nonDelegatedRescissionRelief = nonDelegatedRescissionRelief;
    }

    public Integer getNonDelegatedRescissionReliefMonths() {
        return nonDelegatedRescissionReliefMonths;
    }

    public void setNonDelegatedRescissionReliefMonths(final Integer nonDelegatedRescissionReliefMonths) {
        this.nonDelegatedRescissionReliefMonths = nonDelegatedRescissionReliefMonths;
    }

    public Date getNonDelegatedRescissionReliefEffectiveFrom() {
        return nonDelegatedRescissionReliefEffectiveFrom;
    }

    public void setNonDelegatedRescissionReliefEffectiveFrom(final Date nonDelegatedRescissionReliefEffectiveFrom) {
        this.nonDelegatedRescissionReliefEffectiveFrom = nonDelegatedRescissionReliefEffectiveFrom;
    }

    public Date getNonDelegatedRescissionReliefEffectiveTo() {
        return nonDelegatedRescissionReliefEffectiveTo;
    }

    public void setNonDelegatedRescissionReliefEffectiveTo(final Date nonDelegatedRescissionReliefEffectiveTo) {
        this.nonDelegatedRescissionReliefEffectiveTo = nonDelegatedRescissionReliefEffectiveTo;
    }

    public String getEffectivePricingLoanPrograms() {
        return effectivePricingLoanPrograms;
    }

    public void setEffectivePricingLoanPrograms(final String effectivePricingLoanPrograms) {
        this.effectivePricingLoanPrograms = effectivePricingLoanPrograms;
    }
}
