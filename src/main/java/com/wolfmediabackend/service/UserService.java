package com.wolfmediabackend.service;

import com.wolfmediabackend.bean.User;

import java.util.Date;
import java.util.List;

public interface UserService {
    void deleteUserByPrimaryKey(Integer listenerId);
    void insert(User user);
    User selectUserByPrimaryKey(Integer listenerId);
    List<User> selectAll();
    void updateUserByPrimaryKey(User record);
    void listenedSong(Integer listenerId, Integer songId, Date date);
    void listenedPodcast(Integer listenerId, Integer episodeId, Date date);
    void subscribedArtist(Integer artistId, Integer listenerId, Date date);
    void subscribedPodcast(Integer listenerId, Integer podcastId, Date date);
    void ratedPodcast(Integer podcastId, Integer listenerId, String rating);
}
