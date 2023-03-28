package com.wolfmediabackend.service;

import com.wolfmediabackend.bean.Album;
import com.wolfmediabackend.bean.Artist;
import com.wolfmediabackend.bean.Song;

import java.util.List;

public interface SongsService {
    public List<Song> selectAllSongs();
    public void enterSong(Song song);
    public void updateSong(Song song);
    public void deleteSong(Integer id);
    public void enterPlayCountForSongs();
    public void updatePlayCountForSongs();
    public List<Song> findSongByArtist(Artist artist);
    public List<Song> findSongByAlbum(Album album);
}