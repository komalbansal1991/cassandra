package com.edspree.cassandra.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormatOneAmenities {
    @JsonProperty("online_class_portal")
    private String onlineClassPortal;
    private String library;
    @JsonProperty("test_series")
    private String testSeries;
    @JsonProperty("pick_and_drop_service")
    private String pickNDropService;
    private String wifi;
    @JsonProperty("air_conditioner")
    private String ac;
    @JsonProperty("study_material")
    private String studyMaterial;
    
    /**
     * @return the onlineClassPortal
     */
    public String getOnlineClassPortal() {
        return onlineClassPortal;
    }
    /**
     * @param onlineClassPortal the onlineClassPortal to set
     */
    public void setOnlineClassPortal(String onlineClassPortal) {
        this.onlineClassPortal = onlineClassPortal;
    }
    /**
     * @return the library
     */
    public String getLibrary() {
        return library;
    }
    /**
     * @param library the library to set
     */
    public void setLibrary(String library) {
        this.library = library;
    }
    /**
     * @return the testSeries
     */
    public String getTestSeries() {
        return testSeries;
    }
    /**
     * @param testSeries the testSeries to set
     */
    public void setTestSeries(String testSeries) {
        this.testSeries = testSeries;
    }
    /**
     * @return the pickNDropService
     */
    public String getPickNDropService() {
        return pickNDropService;
    }
    /**
     * @param pickNDropService the pickNDropService to set
     */
    public void setPickNDropService(String pickNDropService) {
        this.pickNDropService = pickNDropService;
    }
    /**
     * @return the wifi
     */
    public String getWifi() {
        return wifi;
    }
    /**
     * @param wifi the wifi to set
     */
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }
    /**
     * @return the ac
     */
    public String getAc() {
        return ac;
    }
    /**
     * @param ac the ac to set
     */
    public void setAc(String ac) {
        this.ac = ac;
    }
    /**
     * @return the studyMaterial
     */
    public String getStudyMaterial() {
        return studyMaterial;
    }
    /**
     * @param studyMaterial the studyMaterial to set
     */
    public void setStudyMaterial(String studyMaterial) {
        this.studyMaterial = studyMaterial;
    }
}
