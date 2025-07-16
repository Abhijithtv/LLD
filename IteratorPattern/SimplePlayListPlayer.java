package IteratorPattern;

public class SimplePlayListPlayer implements IPlaylistPlayer{
    PlayList playList;
    int index;

    public SimplePlayListPlayer(PlayList playList){
        this.playList = playList;
        index = 0;
    }


    @Override
    public boolean hasNext() {
        return index < playList.songs.size();
    }

    @Override
    public String next() {
        return playList.songs.get(index++);
    }
}
