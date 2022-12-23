package DesignPartten;

public class SingletonTest {


}


class Eagerinitialization {
    private Eagerinitialization(){}

    private static Eagerinitialization instance = new Eagerinitialization();

    public Eagerinitialization getInstance() {
        return instance;

    }

}

class Lazyinitialization {

    private Lazyinitialization(){}

    private static Lazyinitialization instance = null;

    public Lazyinitialization getInstance() {
        if (instance == null)
            return new Lazyinitialization();
        else
            return instance;

    }





}