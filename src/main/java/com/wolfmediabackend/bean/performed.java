package com.wolfmediabackend.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class performed {
    private Integer songId;

    private Integer artistId;

    private String isCollaborator;

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getIsCollaborator() {
        return isCollaborator;
    }

    public void setIsCollaborator(String isCollaborator) {
        this.isCollaborator = isCollaborator == null ? null : isCollaborator.trim();
    }
}