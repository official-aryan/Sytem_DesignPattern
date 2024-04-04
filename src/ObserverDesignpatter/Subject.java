package ObserverDesignpatter;

public interface Subject {

    void subscribe(Observer ob);
    void unsubscribe(Observer ob);

    void newvideoUploaded();
}
