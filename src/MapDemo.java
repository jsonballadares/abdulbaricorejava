package src;

import java.util.*;
import java.util.Map.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> tm = new HashMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        tm.put(4, "E");
        tm.put(5, "F");

        System.out.println(tm);

    }
}
