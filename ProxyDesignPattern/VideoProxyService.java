package ProxyDesignPattern;

public class VideoProxyService implements  IVideoService{
    int freq;
    private final IVideoService videoService;

    public VideoProxyService(IVideoService videoService){
        this.videoService = videoService;
        freq = 0;
    }
    
    @Override
    public void play() {
        if(freq++%5==0) {
            System.out.println("Request Blocked due to policy");
            return;
        }
        videoService.play();
    }
}
