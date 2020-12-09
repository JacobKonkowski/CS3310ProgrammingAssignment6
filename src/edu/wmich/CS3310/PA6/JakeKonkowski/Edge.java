package edu.wmich.CS3310.PA6.JakeKonkowski;

// A class to represent a graph edge
class Edge implements Comparable<Edge> 
{
    int src, dest, weight;

    // Comparator function used for 
    // sorting edgesbased on their weight
    public int compareTo(Edge compareEdge)
    {
        return this.weight - compareEdge.weight;
    }
};
