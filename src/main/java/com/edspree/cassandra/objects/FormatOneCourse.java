package com.edspree.cassandra.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormatOneCourse {
    private String subject;
    @JsonProperty("no_batches")
    private String numBatches;
    @JsonProperty("fees_min")
    private String feesMin;
    @JsonProperty("fees_max")
    private String feesMax;
    @JsonProperty("test_during_course_max")
    private String maxTest;
    @JsonProperty("board")
    private String board;
    @JsonProperty("special_offer")
    private String splOffer;
    @JsonProperty("frequency")
    private String freq;
    @JsonProperty("route_for_admission")
    private String admRoute;
    @JsonProperty("average_duration_class")
    private String duration;
    @JsonProperty("test_during_course_min")
    private String minTest;
    @JsonProperty("duration_value")
    private String durationValue;
    @JsonProperty("fees_duration")
    private String feesDuration;
    @JsonProperty("average_batch_size")
    private String avgBatchSize;
    @JsonProperty("duration_period")
    private String durationPeriod;
    private String course;
    @JsonProperty("course_name")
    private String courseName;
    
    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }
    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }
    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
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
     * @return the feesMin
     */
    public String getFeesMin() {
        return feesMin;
    }
    /**
     * @param feesMin the feesMin to set
     */
    public void setFeesMin(String feesMin) {
        this.feesMin = feesMin;
    }
    /**
     * @return the feesMax
     */
    public String getFeesMax() {
        return feesMax;
    }
    /**
     * @param feesMax the feesMax to set
     */
    public void setFeesMax(String feesMax) {
        this.feesMax = feesMax;
    }
    /**
     * @return the maxTest
     */
    public String getMaxTest() {
        return maxTest;
    }
    /**
     * @param maxTest the maxTest to set
     */
    public void setMaxTest(String maxTest) {
        this.maxTest = maxTest;
    }
    /**
     * @return the board
     */
    public String getBoard() {
        return board;
    }
    /**
     * @param board the board to set
     */
    public void setBoard(String board) {
        this.board = board;
    }
    /**
     * @return the splOffer
     */
    public String getSplOffer() {
        return splOffer;
    }
    /**
     * @param splOffer the splOffer to set
     */
    public void setSplOffer(String splOffer) {
        this.splOffer = splOffer;
    }
    /**
     * @return the freq
     */
    public String getFreq() {
        return freq;
    }
    /**
     * @param freq the freq to set
     */
    public void setFreq(String freq) {
        this.freq = freq;
    }
    /**
     * @return the admRoute
     */
    public String getAdmRoute() {
        return admRoute;
    }
    /**
     * @param admRoute the admRoute to set
     */
    public void setAdmRoute(String admRoute) {
        this.admRoute = admRoute;
    }
    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }
    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }
    /**
     * @return the minTest
     */
    public String getMinTest() {
        return minTest;
    }
    /**
     * @param minTest the minTest to set
     */
    public void setMinTest(String minTest) {
        this.minTest = minTest;
    }
    /**
     * @return the durationValue
     */
    public String getDurationValue() {
        return durationValue;
    }
    /**
     * @param durationValue the durationValue to set
     */
    public void setDurationValue(String durationValue) {
        this.durationValue = durationValue;
    }
    /**
     * @return the feesDuration
     */
    public String getFeesDuration() {
        return feesDuration;
    }
    /**
     * @param feesDuration the feesDuration to set
     */
    public void setFeesDuration(String feesDuration) {
        this.feesDuration = feesDuration;
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
     * @return the durationPeriod
     */
    public String getDurationPeriod() {
        return durationPeriod;
    }
    /**
     * @param durationPeriod the durationPeriod to set
     */
    public void setDurationPeriod(String durationPeriod) {
        this.durationPeriod = durationPeriod;
    }
    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }
    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }    
}
