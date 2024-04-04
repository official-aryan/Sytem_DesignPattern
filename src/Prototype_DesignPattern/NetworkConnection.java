package Prototype_DesignPattern;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String data;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public static void main(String[] args)  {
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp("123.43.23");
        networkConnection.setData("ConnecctionStablished");
        System.out.println(networkConnection);

        try {
            NetworkConnection networkConnection1;
            networkConnection1 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
