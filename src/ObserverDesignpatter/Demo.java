package ObserverDesignpatter;

public class Demo {

    public static void main(String[] args) {
        youtube yt=new youtube();
        Subscriber aman=new Subscriber();
        Subscriber neha=new Subscriber();

        yt.subscribe(aman);
        yt.subscribe(neha);
        yt.newvideoUploaded();
    }
}
