package IteratorPattern;

import java.util.List;

public class Main {
    public static void main(String[] args){
        PlayList playList = new PlayList();
        IPlaylistPlayer random = playList.iterator("random");
        play(random);
        IPlaylistPlayer playlistPlayer = playList.iterator("simple");
        play(playlistPlayer);
    }

    public static void play(IPlaylistPlayer playlistPlayer){
        while(playlistPlayer.hasNext()){
            System.out.println(playlistPlayer.next());
        }
    }

}
