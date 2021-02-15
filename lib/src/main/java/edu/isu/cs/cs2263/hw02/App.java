package edu.isu.cs.cs2263.hw02;


public class App{

    public static void main(String[] args) {

        PushbackTokenizer t = new PTImpl();

        t.setInitialString("Im really hoping this works so I don't have to define the string in the PTImpl class which would be bad");

        System.out.println(t.nextToken());
        System.out.println(t.nextToken());
        t.pushback();
        System.out.println(t.nextToken());
        System.out.println(t.nextToken());
        t.pushback();
        System.out.println(t.nextToken());
        System.out.println(t.nextToken());
        System.out.println(t.nextToken());
        System.out.println(t.nextToken());
        System.out.println(t.nextToken());

        System.out.println(t.hasMoreTokens());



    }

}
