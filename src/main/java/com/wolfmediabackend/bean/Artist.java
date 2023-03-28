package com.wolfmediabackend.bean;

public class Artist {
    private Integer artistId;

    private String artistName;

    private String status;

    private String monthlyListener;

    private String type;

    private String country;

    private String primaryGenre;

    private Integer recordLabel;

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName == null ? null : artistName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMonthlyListener() {
        return monthlyListener;
    }

    public void setMonthlyListener(String monthlyListener) {
        this.monthlyListener = monthlyListener == null ? null : monthlyListener.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getPrimaryGenre() {
        return primaryGenre;
    }

    public void setPrimaryGenre(String primaryGenre) {
        this.primaryGenre = primaryGenre == null ? null : primaryGenre.trim();
    }

    public Integer getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(Integer recordLabel) {
        this.recordLabel = recordLabel;
    }
}