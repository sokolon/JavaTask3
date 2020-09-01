package com.company;


import java.util.HashSet;
import java.util.LinkedList;

public class Graph {

    private final LinkedList<HashSet<Integer>> list = new LinkedList<>();
    public void quantityGraph(){
        System.out.println(list.size());
    }
    public void addInteraction(int a, int b) {

        HashSet<Integer> hashSetA = null;
        HashSet<Integer> hashSetB = null;

        for (HashSet<Integer> oneHashset : list) {
            if (oneHashset.contains(a)) {
                hashSetA = oneHashset;
                break;
            }
        }
        for (HashSet<Integer> oneHashset : list) {
            if (oneHashset.contains(b)) {
                hashSetB = oneHashset;
                break;
            }
        }

        if (hashSetA == null && hashSetB == null){ //no "a" no "b"
            HashSet<Integer> newGraph = new HashSet<>();
            newGraph.add(a);
            newGraph.add(b);
            list.add(newGraph);
        }
        if (hashSetA != null && hashSetB == null){ //yes "a" no "b"
            hashSetA.add(b);
        }

        if (hashSetA == null && hashSetB != null){ //no "a" yes "b"
            hashSetB.add(a);
        }

        if (hashSetA != null && hashSetB != null){ //yes "a" yes "b"
            hashSetA.addAll(hashSetB);
            list.remove(hashSetB);
        }
    }
}

