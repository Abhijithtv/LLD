package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    public List<String> songs;

    public PlayList(){
        songs = new ArrayList<>();
        songs.add("a");
        songs.add("b");
        songs.add("c");
        songs.add("d");
        songs.add("e");
        songs.add("f");
    }

    public IPlaylistPlayer iterator(String type){
        IPlaylistPlayer playlistPlayer = null;

        switch (type){
            case "simple":
                playlistPlayer = new SimplePlayListPlayer(this);
                break;
            case "random":
                playlistPlayer = new RandomPlayListPlayer(this);
                break;
        }
        return playlistPlayer;
    }

}
