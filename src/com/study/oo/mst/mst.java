package com.study.oo.mst;//import java.util.*;
//Comp3600 Ass2 Q1
//YU GU, u6013813
//All algorithm from Lecture sliders
import java.util.*;

/******************* Q1 (i) *******************/
public class mst {
    private static double[][] graph; // graph: the edge-weighted graph
    private static ArrayList<ArrayList<Double>> points; // points: the coordinates for n vertices
    private int[] id; // id[i] means parent of i
    private static int countE = 0; // count the number of edges when generate graphs.
    private static int countJ; // record the random number from 1 to n for each loop.

    /* Generate the complete graph for n vertices and n*(n-1)/2 edges with random weight */
    private void generateCompleteG(int n){
        graph = new double[n][n];
        countJ = n;
        // in complete graph, countJ is n where n is the number of vertices
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < countJ; j++) {
                double x1 = points.get(i).get(0);
                double x2 = points.get(i).get(1);
                double y1 = points.get(j).get(0);
                double y2 = points.get(j).get(1);
                // use euclidean find distance between 2 points
                double distance = Math.sqrt(Math.pow(x1-y1,2)+Math.pow(x2-y2,2));
                graph[i][j] =  distance;
                graph[j][i] = graph[i][j];
                countE += 1;
            }
        }
    }
    // generate the points for graph in an ArrayList
    private static ArrayList<ArrayList<Double>> generatePoints(int n){
        ArrayList<ArrayList<Double>> point = new ArrayList<>();
        for (int i = 0; i < n; i ++){
            point.add(vertex(Math.random(),Math.random()));
            //this function will random number from 0 to 1.
        }
        return point;
    }

    private static ArrayList<Double> vertex (double x,double y){
        ArrayList<Double> a = new ArrayList<>();
        a.add(x);
        a.add(y);
        return a;
    }

    /******************* Kruskal *******************/
    private double kruskal() {
        double kSet = 0;
        id = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            id[i] = i;
        }
        // In a randomly connected graph, n vertices at least have (n-1) edges
        Edge edges[] = new Edge[countE];
        int k = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = i+1; j < countJ; j++) {
                    Edge edge = new Edge(i, j, graph[i][j]);
                    edges[k++] = edge;
            }
        }
        //quick-sort the edge by its weight for greedy algorithm
        quickSort(edges);
        for (int i = 0; i < edges.length; i++) {
            kSet += union(edges[i]);
        }
        return kSet;
    }

    /******************* Help function about Edge in graph *******************/
    class Edge implements Comparable<Edge> {
        private Edge next;
        private Edge(){}
        int pointX;
        int pointY;
        double weightXY;
        private Edge(int pointX, int pointY, double weightXY) {
            this.pointX = pointX;
            this.pointY = pointY;
            this.weightXY = weightXY;
        }
        //compare weights between two edges
        public int compareTo(Edge nextE) {
            if (this.weightXY > nextE.weightXY) {
                return 1;
            }
            else if (this.weightXY == nextE.weightXY) {
                return 0;
            }
            else{
                return  -1;
            }
        }
    }

    /******************* Help function about quickSort *******************/
    private void quickSort(Edge[] args){
        sort(args, 0, args.length -1);
    }

    // reference from https://www.programcreek.com/2012/11/quicksort-array-in-java/
    private void sort(Edge[] arr, int low, int high) {
        if (arr == null || arr.length == 0){
            return;
        }
        if (low >= high){
            return;
        }
        // pick the pivot
        int middle = low + (high-low)/2;
        Edge pivot = arr[middle];
        //make low < pivot and high > pivot
        int i = low, j = high;
        while (i <= j) {
            while (i <= j && arr[i].weightXY < pivot.weightXY) {
                i++;
            }
            while (i <= j && arr[j].weightXY > pivot.weightXY) {
                j--;
            }
            if (i <= j) {
                Edge temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // recursively sort two sub parts
        if (low < j){
            sort(arr, low, j);
        }
        if (high > i){
            sort(arr, i, high);
        }
    }

    /******************* Help function about DisJoinSet *******************/
    // A utility function to find the subset of an element i
    private int find(int i) {
        if (id[i] != i ){
            id[i] = find(id[i]);
        }
        return id[i];
    }

    // A utility function to do union of two subsets
    private double union(Edge edge) {
        int x = find(edge.pointX);
        int y = find(edge.pointY);

        if (x != y) {
            id[x] = y;
            return edge.weightXY;
        }
        return 0;
        // 0 is false, 1 is true
    }
    /* Generate the random connected graph for n vertices and from n to n*(n-1)/2 edges with random weight */
    private void generateConnectedG(int n){
        graph = new double [n] [n];
        Random r = new Random();
        int low = 1;
        int high = n;
        countJ = r.nextInt(high-low) + low;
        // countJ will be from 1 to n where n is the number of vertices
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < countJ; j++) {
                double x1 = points.get(i).get(0);
                double x2 = points.get(i).get(1);
                double y1 = points.get(j).get(0);
                double y2 = points.get(j).get(1);
                // use euclidean find distance between 2 points
                double distance = Math.sqrt(Math.pow(x1-y1,2)+Math.pow(x2-y2,2));
                graph[i][j] =  distance;
                graph[j][i] = graph[i][j];
                countE += 1;
            }
        }
    }
    /******************* prim *******************/
    //pE means edges in prim
    private Edge pE[];
    private double prim() {
        double pSet = 0;
        pE = new Edge[graph.length];
        double array[] = new double[graph.length];
        Integer check[] = new Integer [graph.length];

        for(int i = 0; i < graph.length; i++) {
            pE[i] = new Edge();
            array[i] = Double.MAX_VALUE;
            check[i] = 0;
        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < countJ; j++) {
                if (i == j) {
                    continue;
                }
                else {
                    addEdge(i, j, graph[i][j]);
                }
            }
        }

        //create the minimum priority queue Q
        PriorityQueue<Edge> Q = new PriorityQueue<Edge>();

        Edge e = pE[0].next;
        while(e != null){
            Q.add(e);
            e = e.next;
        }
        check[0] = 1;
        // 0 is false, 1 is true

        while(Q.size()!= 0) {
            Edge top = Q.poll();
            if(check[top.pointY] == 0){
                check[top.pointY] = 1;
                pSet += top.weightXY;
                e = pE[top.pointY].next;
            }
            while(e != null){
                if (check[e.pointY] == 0) {
                    Q.add(e);
                }
                e = e.next;
            }
        }
        return pSet;
    }

    /******************* help function for adding edge *******************/
    private void addEdge(int pointX, int pointY, double weightXY) {
        Edge edge = new Edge();
        edge.pointX = pointX;
        edge.pointY = pointY;
        edge.weightXY = weightXY;
        edge.next = pE[pointX].next;
        pE[pointX].next = edge;
    }


    /******************* All Output *******************/
    public static void main(String[] args){
        int n[] = new int[]{100, 500, 1000};
        int p = 50;

        /******************* Output for Q1 (i) *******************/

        System.out.println("For generated complete graph:");
        for (int i = 0; i < n.length; i++) {
            mst mst = new mst();
            points = generatePoints(n[i]);
            mst.generateCompleteG(n[i]);
            //the running time reference:https://stackoverflow.com/questions/5204051/how-to-calculate-the-running-time-of-my-program
            double mstWeight = 0;
            for (int j = 0; j < p; j++) {
                mstWeight += mst.kruskal();
            };
            countE = 0;
            System.out.println(
                    "By kruskal, when n = " + n[i] +
                            "; average weight : " + mstWeight / p);
        }
        /******************* Output for Q1 (iii) *******************/

        System.out.println("For random connected graph:");
        for (int i = 0; i < n.length; i++) {
            mst mst = new mst();
            points = generatePoints(n[i]);
            mst.generateConnectedG(n[i]);
            double mstWeight = 0;
            long totalTime = 0;
            for (int j = 0; j < p; j++) {
                long startTime = System.nanoTime();
                mstWeight = mstWeight + mst.kruskal();
                long endTime = System.nanoTime();
                totalTime += (endTime - startTime);
            }
            //System.out.println(countE);
            //System.out.println(countJ);
            //reset the value of countE
            countE = 0;

            System.out.println(
                    "By kruskal, when n = " + n[i] +
                            "; average time : " + (totalTime / p) +
                            " ns ; average weight : " + mstWeight / p);
            mstWeight = 0;
            totalTime = 0;
            for (int j = 0; j < p; j++) {
                long startTime = System.nanoTime();
                mstWeight = mstWeight + mst.prim();
                long endTime = System.nanoTime();
                totalTime += (endTime - startTime);
            }
            System.out.println(
                    "By Prim, when n = " + n[i] +
                            "; average time : " + (totalTime/p) +
                            " ns ; average weight : " + mstWeight/p);
         }
    }
}

