package Ex_3;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Content is playing");
    }
    @Override
    public void pause() {
        System.out.println("Content is on pause");
    }
    @Override
    public void stop() {
        System.out.println("Content stopped");
    }
    @Override
    public void record() {
        System.out.println("Content is recording");
    }

}
