package DesignPartten;

import jdk.swing.interop.SwingInterOpUtils;

public class TemplatePattenSample {
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
}
abstract  class Template {

    public void spendTime() {
        long beginTime = System.currentTimeMillis();
            code();
        long endTime = System.currentTimeMillis();


    }

    public abstract void code();
}

class SubTemplate extends Template{
@Override
    public void code() {

    for(int i = 2; i<=1000; i++) {
        boolean isFlag = true;
        for(int j = 2; j<=Math.sqrt(i); j++) {
            if(i % j == 0) {
                isFlag = false;
                break;
            }
            if(isFlag)
                System.out.println(i);


        }

    }

    }
}