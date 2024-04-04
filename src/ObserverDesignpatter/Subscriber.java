package ObserverDesignpatter;

public class Subscriber implements Observer{
    @Override
    public void notified() {
        System.out.println("youtube have added new video");
    }
}
