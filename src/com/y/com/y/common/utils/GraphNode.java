package com.y.com.y.common.utils;

import java.util.ArrayList;
import java.util.List;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by akasha on 3/6/16.
 */
public class GraphNode {

    int data;
    List<GraphNode> neighbours;

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    boolean isVisited;

    public GraphNode(int data){
        this.data = data;
        this.neighbours = new ArrayList<GraphNode>();
    }

    public void setNeighbours(List<GraphNode> neighbours){
        this.neighbours.addAll(neighbours);
    }

    public void addNeighbour(GraphNode neighbour){
        this.neighbours.add(neighbour);
    }


    public List<GraphNode> getNeighbours(){
        return this.neighbours;
    }

    public int getData(){
        return this.data;
    }

    public void printGraph(){
        Queue<GraphNode> q = new LinkedList();
        q.add(this);
        this.isVisited = true;
        while(!q.isEmpty()){
            GraphNode curr = q.remove();
            System.out.printf("->" + curr.data);
            for(GraphNode neighbour: curr.getNeighbours()){
                if(!neighbour.isVisited)
                    q.add(neighbour);
                neighbour.isVisited = true;
            }
            System.out.println();
        }
    }
}
