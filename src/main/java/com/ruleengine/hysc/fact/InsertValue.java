package com.ruleengine.hysc.fact;

/**
 * This class was automatically generated by the data modeler tool.
 * @author dalididilo
 */

public class InsertValue implements java.io.Serializable {
    @Override
    public String toString() {
        return "InsertValue{" +
                "deviceId='" + deviceId + '\'' +
                ", type='" + type + '\'' +
                ", grade='" + grade + '\'' +
                ", watchType='" + watchType + '\'' +
                ", collectValue=" + collectValue +
                '}';
    }

    static final long serialVersionUID = 1L;
    private String deviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @org.kie.api.definition.type.Label("传感器类型")
    private java.lang.String type;
    @org.kie.api.definition.type.Label("告警等级")
    private java.lang.String grade;

    @org.kie.api.definition.type.Label("监测类型")
    private java.lang.String watchType;

    @org.kie.api.definition.type.Label(value = "采集数值")
    private double collectValue;

    public InsertValue() {
    }

    public java.lang.String getType() {
        return this.type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public java.lang.String getGrade() {
        return this.grade;
    }

    public void setGrade(java.lang.String grade) {
        this.grade = grade;
    }

    public java.lang.String getWatchType() {
        return this.watchType;
    }

    public void setWatchType(java.lang.String watchType) {
        this.watchType = watchType;
    }

    public double getCollectValue() {
        return this.collectValue;
    }

    public void setCollectValue(double collectValue) {
        this.collectValue = collectValue;
    }

    public InsertValue(java.lang.String type, java.lang.String grade,
                       java.lang.String watchType, double collectValue) {
        this.type = type;
        this.grade = grade;
        this.watchType = watchType;
        this.collectValue = collectValue;
    }

}