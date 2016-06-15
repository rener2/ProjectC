package com.example.form;

import javax.validation.constraints.Size;

public class Post {

    @Size(min=1, max=35)
    private String messageID;

    @Size(min=1, max= 1000)
    private String objectID;

    @Size(min=1, max= 1000)
    private String serviceName;

    @Size(min=1, max= 1000)
    private String status;

    @Size(min=1, max= 1000)
    private String inquiryID;

    @Size(min=1, max= 1000)
    private String seizureResponseCode;

    @Size(min=1, max= 1000)
    private String bankResponseCode;

    @Size(min=1, max= 1000)
    private String errorCode;

    @Size(min=1, max= 1000)
    private String sendingTime;

    @Size(min=1, max= 1000)
    private String entryTime;

    @Size(min=1, max= 1000)
    private String clientsCode;

    @Size(min=1, max= 1000)
    private String compiler;

    @Size(min=1, max= 1000)
    private String originalDocument;

    private String responseID;

    private String messageXml;

    private String responseXml;

    private String seizureText;

    private String errorText;

    private String errorStack;

    private String bankResponseXml;

    private String bankResponseText;

    private String editTime;

    private String person;

    private int timesSent;

    private String seizureResponseTime;

    private String bankResponseID;

    private String bankResponseTime;


    public String getMessageID() {
        return messageID;
    }

    public String getObjectID() {
        return objectID;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInquiryID() {
        return inquiryID;
    }

    public void setInquiryID(String inquiryID) {
        this.inquiryID = inquiryID;
    }

    public String getSeizureResponseCode() {
        return seizureResponseCode;
    }

    public void setSeizureResponseCode(String seizureResponseCode) {
        this.seizureResponseCode = seizureResponseCode;
    }

    public String getBankResponseCode() {
        return bankResponseCode;
    }

    public void setBankResponseCode(String bankResponseCode) {
        this.bankResponseCode = bankResponseCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getSendingTime() {
        return sendingTime;
    }

    public void setSendingTime(String sendingTime) {
        this.sendingTime = sendingTime;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getClientsCode() {
        return clientsCode;
    }

    public void setClientsCode(String clientsCode) {
        this.clientsCode = clientsCode;
    }

    public String getCompiler() {
        return compiler;
    }

    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    public String getOriginalDocument() {
        return originalDocument;
    }

    public void setOriginalDocument(String originalDocument) {
        this.originalDocument = originalDocument;
    }

    public String getResponseID() {
        return responseID;
    }

    public void setResponseID(String responseID) {
        this.responseID = responseID;
    }

    public String getMessageXml() {
        return messageXml;
    }

    public void setMessageXml(String messageXml) {
        this.messageXml = messageXml;
    }

    public String getResponseXml() {
        return responseXml;
    }

    public void setResponseXml(String responseXml) {
        this.responseXml = responseXml;
    }

    public String getSeizureText() {
        return seizureText;
    }

    public void setSeizureText(String seizureText) {
        this.seizureText = seizureText;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public String getErrorStack() {
        return errorStack;
    }

    public void setErrorStack(String errorStack) {
        this.errorStack = errorStack;
    }

    public String getBankResponseXml() {
        return bankResponseXml;
    }

    public void setBankResponseXml(String bankResponseXml) {
        this.bankResponseXml = bankResponseXml;
    }

    public String getBankResponseText() {
        return bankResponseText;
    }

    public void setBankResponseText(String bankResponseText) {
        this.bankResponseText = bankResponseText;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getTimesSent() {
        return timesSent;
    }

    public void setTimesSent(int timesSent) {
        this.timesSent = timesSent;
    }

    public String getSeizureResponseTime() {
        return seizureResponseTime;
    }

    public void setSeizureResponseTime(String seizureResponseTime) {
        this.seizureResponseTime = seizureResponseTime;
    }

    public String getBankResponseID() {
        return bankResponseID;
    }

    public void setBankResponseID(String bankResponseID) {
        this.bankResponseID = bankResponseID;
    }

    public String getBankResponseTime() {
        return bankResponseTime;
    }

    public void setBankResponseTime(String bankResponseTime) {
        this.bankResponseTime = bankResponseTime;
    }
}
