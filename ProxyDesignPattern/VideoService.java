package ProxyDesignPattern;

public class VideoService implements IVideoService {

    @Override
    public void play() {
        System.out.println("Playing");
    }
}
