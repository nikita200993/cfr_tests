package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class VarArgsTest1e {

    public void x(int a, Integer ... bs) {
    }

    public void x(int a, int b1) {
    }

    public void t() {
        Integer a = 2;
        x(3, new Integer[]{null});
        x(3, a);
        x(3, new Integer[]{a});
        x(3, null);
    }

}
