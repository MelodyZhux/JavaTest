public class NetworkTest {

    public static void main(String[] args) {
        ProxyServer serv = new ProxyServer(new Server());
        serv.browse();
    }
}

interface NetWork {
    public void browse();
}

class Server implements NetWork {

    @Override
    public void browse() {
        System.out.println("real server");
    }

}

class ProxyServer implements  NetWork {
    private NetWork work;
    public ProxyServer(NetWork work) {
        this.work = work;
    }

    public void check() {
        System.out.println("check before connecting");;
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }
}