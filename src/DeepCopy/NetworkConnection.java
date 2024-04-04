package DeepCopy;



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
        // Perform deep copy
        NetworkConnection cloned = (NetworkConnection) super.clone();
        // Modify to deep copy the mutable fields
        cloned.ip = new String(this.ip);
        cloned.data = new String(this.data);
        return cloned;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public static void main(String[] args)  {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("123.43.23");
        networkConnection.setData("ConnectionEstablished");
        System.out.println(networkConnection);

        try {
            NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
            networkConnection1.setIp("23.32.44");
            networkConnection1.setData("es");
            System.out.println(networkConnection1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(networkConnection);
    }
}
