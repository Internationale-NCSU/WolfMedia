package com.wolfmediabackend.service.impl;

import com.wolfmediabackend.MybatisInitilizer;
import com.wolfmediabackend.bean.Album;
import com.wolfmediabackend.bean.Artist;
import com.wolfmediabackend.bean.Song;
import com.wolfmediabackend.mapper.SongMapper;
import com.wolfmediabackend.service.SongsService;
import org.apache.ibatis.session.SqlSession;


import java.util.List;

public class SongsImpl implements SongsService {
    private SqlSession sqlSession = MybatisInitilizer.initialize();
    private SongMapper songMapper = sqlSession.getMapper(SongMapper.class);

    @Override
    public List<Song> selectAllSongs() {
        return songMapper.selectAll();
    }

    @Override
    public void enterSong(Song song) {
        System.out.println(songMapper.insert(song));
        sqlSession.commit();
    }

    @Override
    public void updateSong(Song song) {
        songMapper.updateByPrimaryKey(song);
        sqlSession.commit();
    }

    @Override
    public void deleteSong(Integer id) {
        songMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void enterPlayCountForSongs() {

    }

    @Override
    public void updatePlayCountForSongs() {
        songMapper.updatePlayCountForSongs();
    }

    @Override
    public List<Song> findSongByArtist(Artist artist) {
        return songMapper.findSongByArtist(artist.getArtistId());
    }

    @Override
    public List<Song> findSongByAlbum(Album album) {
        return null;
    }
}
