package DesignPartten;

public class ProxySample {
    public static void main(String[] args) {
        Service service = new Service();
        ProxyService proxyService = new ProxyService(service);
        proxyService.browse();
    }
}

interface NetWork {
    public void browse();
}


class Service implements NetWork {

    @Override
    public void browse(){
        System.out.println("REAL SERVER");
    }

}


class ProxyService implements NetWork {

    NetWork work;

    public ProxyService(NetWork work) {
        this.work = work;
    }

    public void check() {
    System.out.println("check before connecting network");
}
    @Override
    public void browse() {
        check();
        work.browse();

    }
}
