package IteratorPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomPlayListPlayer implements  IPlaylistPlayer{
    PlayList playList;
    List<String> shuffledSongs;
    int index;

    public RandomPlayListPlayer(PlayList playList){
        this.playList = playList;
        this.shuffledSongs = new ArrayList<>(playList.songs);
        Collections.shuffle(shuffledSongs);
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < shuffledSongs.size();
    }

    @Override
    public String next() {
        return shuffledSongs.get(index++);
    }
}
