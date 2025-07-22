package ProxyDesignPattern;

public class Main {
    public static void main(String[] args){
        IVideoService videoService = new VideoService();
        IVideoService proxyService = new VideoProxyService(videoService);

        for(int i=0; i<20; i++){
            proxyService.play();
        }
    }

}
