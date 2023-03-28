package com.wolfmediabackend;

import com.wolfmediabackend.bean.Song;
import com.wolfmediabackend.service.impl.SongsImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        while (true){
            SongsImpl songsImp = new SongsImpl();
            System.out.println("input your command:");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if(s.startsWith("insert song")){
                System.out.println("please input the parameters follow the order and use space as separator:\n" +
                        "song_id, song_title, duration, genres, play count, language, royalty_rate, release_date, release_country, album(10)");
                String commandInput = scanner.nextLine();
                String[] params = commandInput.split(";");
                System.out.println(params[0]+" "+params[9]);
                Song song = new Song(Integer.valueOf(params[0]),params[1],params[2],params[3],params[4],params[5], BigDecimal.valueOf(Double.valueOf(params[6])),params[7],params[8],Integer.valueOf(params[9]));
                //4;Acadia;3:24;pop;0;English;0.9;2021;United States;1
                //24;Textbook;3:24;pop;0;English;0.9;2021;United States;1
                songsImp.enterSong(song);
                System.out.println("SUCCESSFUL!"+song.getSongTitle()+" has been inserted to table Song");
            }
            if(s.startsWith("select all song")){
                List<Song> results = songsImp.selectAllSongs();
                for (Song result : results) {
                    System.out.println(result);
                }
            }
        }
    }
}
