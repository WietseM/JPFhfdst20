package be.vdab.jpfhfdst20;

import java.util.Comparator;

public class DescendingComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}
