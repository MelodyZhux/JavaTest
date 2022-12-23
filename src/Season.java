enum Season {

     Spring ("Spring","flower blooming"),
     Summer ("Summer","hot hot"),
     Season ("Autumn","leav is falling down"),
     Winter ("Winter","snow");

    private final String name;
    private final  String describe;

    private Season(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }



    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

}
