package com.wolfmediabackend;

import com.wolfmediabackend.bean.Song;
import com.wolfmediabackend.service.UserService;
import com.wolfmediabackend.service.impl.SongsServiceImpl;
import com.wolfmediabackend.service.impl.UserServiceImpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        SongsServiceImpl songsImp = new SongsServiceImpl();
        UserServiceImpl userServiceImp = new UserServiceImpl();
        while (true){
            System.out.println("input your command:");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if(s.startsWith("insert song")){
                System.out.println("please input the parameters follow the order and use ';' as separator:\n" +
                        "song_id, song_title, duration, genres, play count, language, royalty_rate, release_date, release_country, album(10)");
                String commandInput = scanner.nextLine();
                String[] params = commandInput.split(";");
                Song song = new Song(Integer.valueOf(params[0]),params[1],params[2],params[3],params[4],params[5], BigDecimal.valueOf(Double.valueOf(params[6])),params[7],params[8],Integer.valueOf(params[9]));
                //4;Acadia;3:24;pop;0;English;0.9;2021;United States;1
                //24;Textbook;3:24;pop;0;English;0.9;2021;United States;1
                songsImp.enterSong(song);
                System.out.println("SUCCESSFUL!"+song.getSongTitle()+" has been inserted to table Song");
            } else if(s.startsWith("select all songs")){
                List<Song> results = songsImp.selectAllSongs();
                for (Song result : results) {
                    System.out.println(result);
                }
            } else if(s.startsWith("update play count")){
                songsImp.updatePlayCountForSongs();
            } else if(s.startsWith("user listened song")){
                System.out.println("please input the parameters follow the order and use ';' as separator:\n" +
                        "listener_id, song_id, date");
                String commandInput = scanner.nextLine();
                String[] params = commandInput.split(";");
                Date date = new Date();
                userServiceImp.listenedSong(Integer.valueOf(params[0]), Integer.valueOf(params[1]), date);
                System.out.println("User: "+params[0]+" listened to Song:"+params[1]+" on "+date);
            }
        }
    }
}
