package com.wolfmediabackend.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PodcastEpisode {
    private Integer podcastEpisodeId;

    private String episodeTitle;

    private String duration;

    private String releaseDate;

    private String listeningCount;

    private String advertisementCount;

    private Integer podcast;

    public Integer getPodcastEpisodeId() {
        return podcastEpisodeId;
    }

    public void setPodcastEpisodeId(Integer podcastEpisodeId) {
        this.podcastEpisodeId = podcastEpisodeId;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public void setEpisodeTitle(String episodeTitle) {
        this.episodeTitle = episodeTitle == null ? null : episodeTitle.trim();
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate == null ? null : releaseDate.trim();
    }

    public String getListeningCount() {
        return listeningCount;
    }

    public void setListeningCount(String listeningCount) {
        this.listeningCount = listeningCount == null ? null : listeningCount.trim();
    }

    public String getAdvertisementCount() {
        return advertisementCount;
    }

    public void setAdvertisementCount(String advertisementCount) {
        this.advertisementCount = advertisementCount == null ? null : advertisementCount.trim();
    }

    public Integer getPodcast() {
        return podcast;
    }

    public void setPodcast(Integer podcast) {
        this.podcast = podcast;
    }
}