package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class NameTest13b {

    public int foo() {
        int a = 1;
        a = ++a;
        a = a++;
        System.out.println(a);
        return a;
    }
}
