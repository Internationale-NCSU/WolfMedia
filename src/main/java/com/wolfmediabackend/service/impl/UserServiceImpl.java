package com.wolfmediabackend.service.impl;

import com.wolfmediabackend.MybatisInitilizer;
import com.wolfmediabackend.bean.User;
import com.wolfmediabackend.bean.listenedSong;
import com.wolfmediabackend.mapper.SongMapper;
import com.wolfmediabackend.mapper.UserMapper;
import com.wolfmediabackend.mapper.ListenedSongMapper;
import com.wolfmediabackend.service.UserService;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class UserServiceImpl implements UserService {
    private SqlSession sqlSession = MybatisInitilizer.initialize();
    private UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    private SongMapper songMapper = sqlSession.getMapper(SongMapper.class);
    private ListenedSongMapper lsMapper = sqlSession.getMapper(ListenedSongMapper.class);

    @Override
    public void deleteUserByPrimaryKey(Integer listenerId) {
        userMapper.deleteByPrimaryKey(listenerId);
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public User selectUserByPrimaryKey(Integer listenerId) {
        return selectUserByPrimaryKey(listenerId);
    }

    @Override
    public List<User> selectAll() {
        return selectAll();
    }

    @Override
    public void updateUserByPrimaryKey(User record) {
        updateUserByPrimaryKey(record);
    }

    @Override
    public void listenedSong(Integer listenerId, Integer songId, Date date) {
        listenedSong ls = new listenedSong(listenerId,songId,date);
        lsMapper.insert(ls);
        songMapper.updatePlayCountForSongs();
        sqlSession.commit();
    }

    @Override
    public void listenedPodcast(Integer listenerId, Integer episodeId, Date date) {

    }

    @Override
    public void subscribedArtist(Integer artistId, Integer listenerId, Date date) {

    }

    @Override
    public void subscribedPodcast(Integer listenerId, Integer podcastId, Date date) {

    }

    @Override
    public void ratedPodcast(Integer podcastId, Integer listenerId, String rating) {

    }
}
