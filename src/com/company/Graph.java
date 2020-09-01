package com.company;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph {

    private LinkedList<HashSet<Integer>> list = new LinkedList<>(); //lista linkedlist, hashsetow integerow
    public void quantityGraph(){
        System.out.println(list.size());
    }
    public void addInteraction(int a, int b) {

        HashSet<Integer> hashSetA = null;
        HashSet<Integer> hashSetB = null;

        for (int i = 0; i < list.size(); i++) {
            HashSet<Integer> oneHashset = list.get(i);
            if (oneHashset.contains(a)) {
                hashSetA = oneHashset;
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            HashSet<Integer> oneHashset = list.get(i);
            if (oneHashset.contains(b)) {
                hashSetB = oneHashset;
                break;
            }
        }
        if (hashSetA == null && hashSetB == null){ //nie ma a nie ma b
            HashSet<Integer> newGraph = new HashSet<>();
            newGraph.add(a);
            newGraph.add(b);
            list.add(newGraph);
        }
        if (hashSetA != null && hashSetB == null){ //jest a nie ma b
            hashSetA.add(b);
        }

        if (hashSetA == null && hashSetB != null){ //nie ma a jest b
            hashSetB.add(a);
        }

        if (hashSetA != null && hashSetB != null){ //jeden tak drugi tak
            hashSetA.addAll(hashSetB);
            list.remove(hashSetB);
        }
    }
}

