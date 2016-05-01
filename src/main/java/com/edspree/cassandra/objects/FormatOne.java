package com.edspree.cassandra.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormatOne {
    private String name;
    @JsonProperty("other_branches")
    private String otherBranches;
    @JsonProperty("number_branches")
    private String numBranches;
    private String usp;
    @JsonProperty("number_subjects")
    private String numSubjects;
    private String discount;
    @JsonProperty("average_batch_size")
    private String avgBatchSize;
    @JsonProperty("average_teacher_experience")
    private String avgTeacherExp;
    @JsonProperty("website")
    private String websiteUrl;
    @JsonProperty("institute_fees_max")
    private String instiFeesMax;
    @JsonProperty("running_since")
    private String runningSince;
    @JsonProperty("number_students")
    private String numStudents;
    @JsonProperty("amenities")
    private FormatOneAmenities amen; 
    @JsonProperty("courses")
    private FormatOneCourse[] courses;
    private String address;
    @JsonProperty("institute_fees_min")
    private String instiFeesMin;
    @JsonProperty("number_batches")
    private String numBatches;
    
    /**
     * @return the numBatches
     */
    public String getNumBatches() {
        return numBatches;
    }
    /**
     * @param numBatches the numBatches to set
     */
    public void setNumBatches(String numBatches) {
        this.numBatches = numBatches;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the otherBranches
     */
    public String getOtherBranches() {
        return otherBranches;
    }
    /**
     * @param otherBranches the otherBranches to set
     */
    public void setOtherBranches(String otherBranches) {
        this.otherBranches = otherBranches;
    }
    /**
     * @return the numBranches
     */
    public String getNumBranches() {
        return numBranches;
    }
    /**
     * @param numBranches the numBranches to set
     */
    public void setNumBranches(String numBranches) {
        this.numBranches = numBranches;
    }
    /**
     * @return the usp
     */
    public String getUsp() {
        return usp;
    }
    /**
     * @param usp the usp to set
     */
    public void setUsp(String usp) {
        this.usp = usp;
    }
    /**
     * @return the numSubjects
     */
    public String getNumSubjects() {
        return numSubjects;
    }
    /**
     * @param numSubjects the numSubjects to set
     */
    public void setNumSubjects(String numSubjects) {
        this.numSubjects = numSubjects;
    }
    /**
     * @return the discount
     */
    public String getDiscount() {
        return discount;
    }
    /**
     * @param discount the discount to set
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }
    /**
     * @return the avgBatchSize
     */
    public String getAvgBatchSize() {
        return avgBatchSize;
    }
    /**
     * @param avgBatchSize the avgBatchSize to set
     */
    public void setAvgBatchSize(String avgBatchSize) {
        this.avgBatchSize = avgBatchSize;
    }
    /**
     * @return the avgTeacherExp
     */
    public String getAvgTeacherExp() {
        return avgTeacherExp;
    }
    /**
     * @param avgTeacherExp the avgTeacherExp to set
     */
    public void setAvgTeacherExp(String avgTeacherExp) {
        this.avgTeacherExp = avgTeacherExp;
    }
    /**
     * @return the websiteUrl
     */
    public String getWebsiteUrl() {
        return websiteUrl;
    }
    /**
     * @param websiteUrl the websiteUrl to set
     */
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }
    /**
     * @return the instiFeesMax
     */
    public String getInstiFeesMax() {
        return instiFeesMax;
    }
    /**
     * @param instiFeesMax the instiFeesMax to set
     */
    public void setInstiFeesMax(String instiFeesMax) {
        this.instiFeesMax = instiFeesMax;
    }
    /**
     * @return the runningSince
     */
    public String getRunningSince() {
        return runningSince;
    }
    /**
     * @param runningSince the runningSince to set
     */
    public void setRunningSince(String runningSince) {
        this.runningSince = runningSince;
    }
    /**
     * @return the numStudents
     */
    public String getNumStudents() {
        return numStudents;
    }
    /**
     * @param numStudents the numStudents to set
     */
    public void setNumStudents(String numStudents) {
        this.numStudents = numStudents;
    }
    /**
     * @return the amen
     */
    public FormatOneAmenities getAmen() {
        return amen;
    }
    /**
     * @param amen the amen to set
     */
    public void setAmen(FormatOneAmenities amen) {
        this.amen = amen;
    }
    /**
     * @return the courses
     */
    public FormatOneCourse[] getCourses() {
        return courses;
    }
    /**
     * @param courses the courses to set
     */
    public void setCourses(FormatOneCourse[] courses) {
        this.courses = courses;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * @return the instiFeesMin
     */
    public String getInstiFeesMin() {
        return instiFeesMin;
    }
    /**
     * @param instiFeesMin the instiFeesMin to set
     */
    public void setInstiFeesMin(String instiFeesMin) {
        this.instiFeesMin = instiFeesMin;
    }
}
