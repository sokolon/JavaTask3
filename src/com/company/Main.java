package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Graph graph = new Graph();
        for (int i=0; i<n; i++)
        {
            int edge1 = scan.nextInt();
            int edge2 = scan.nextInt();

            graph.addInteraction(edge1, edge2);
        }

        graph.quantityGraph();
    }
}
