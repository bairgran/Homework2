package edu.isu.cs.cs2263.hw02;


import java.util.StringTokenizer;

public class PTImpl implements PushbackTokenizer {

    private String initialString = " ";//"This is going to have to be edited in this class which is definitely not a good way to do this";
    private String currentString = initialString;
    private String tempString;

    private StringTokenizer ST = new StringTokenizer(currentString);

    @Override
    public void setInitialString(String initial) {
        currentString = initial;
    }

    @Override
    public String nextToken() {


        ST = new StringTokenizer(currentString);
        String temp = ST.nextToken();

        tempString = temp;
        // I don't know of any other ways I could split the first word off of the String without calling .nextToken()
        // which wouldn't work with this. I feel like there has to be a better way though
        String[] tempArray = currentString.split(" ", 2);

        currentString = tempArray[1];
        ST = new StringTokenizer(currentString);


        //currentString = currentString.replace(temp, "");
        return temp;
    }

    @Override
    public boolean hasMoreTokens() {
        if (ST.hasMoreTokens())
            return ST.hasMoreTokens();
        else
            return false;
    }

    @Override
    public void pushback() {
        currentString = tempString + " " + currentString;
    }
}
