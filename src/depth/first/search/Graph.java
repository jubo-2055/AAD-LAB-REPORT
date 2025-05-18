
package depth.first.search;

import java.util.*;

// Node class
class Node {
    String name;
    List<Node> neighbors = new ArrayList<>();

    Node(String name) {
        this.name = name;
    }

    void addNeighbor(Node node) {
        neighbors.add(node);
    }
}

// Graph class
class Graph {
    Map<String, Node> nodeMap = new HashMap<>();

    void addNode(String name) {
        nodeMap.put(name, new Node(name));
    }

    void addEdge(String from, String to) {
        Node a = nodeMap.get(from);
        Node b = nodeMap.get(to);
        if (a != null && b != null) {
            a.addNeighbor(b);
            b.addNeighbor(a); // For undirected graph
        }
    }

    void dfs(String startName) {
        Set<String> visited = new HashSet<>();
        Node start = nodeMap.get(startName);
        System.out.print("DFS: ");
        dfsHelper(start, visited);
        System.out.println();
    }

    void dfsHelper(Node node, Set<String> visited) {
        if (node == null || visited.contains(node.name)) return;
        visited.add(node.name);
        System.out.print(node.name + " ");
        for (Node neighbor : node.neighbors) {
            dfsHelper(neighbor, visited);
        }
    }
}
