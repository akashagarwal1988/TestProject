package com.y.epi.ch19;

import com.y.com.y.common.utils.GraphNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Created by akasha on 3/6/16.
 */
public class FiveCloneAGraph {

    public static GraphNode cloneGraph(GraphNode g){
        Map<GraphNode, GraphNode> map = new HashMap();
        Queue<GraphNode> q = new LinkedList();
        q.add(g);
        map.put(g, new GraphNode(g.getData()));
        while(!q.isEmpty()){
            GraphNode curr = q.remove();
            for(GraphNode neighbour: curr.getNeighbours()){
                if(!map.containsKey(neighbour)){
                    GraphNode cloneNeighbour = new GraphNode(neighbour.getData());
                    map.put(neighbour, cloneNeighbour);
                    q.add(neighbour);
                }
                map.get(curr).addNeighbour(map.get(neighbour));
            }
        }
        return map.get(g);
    }
}
