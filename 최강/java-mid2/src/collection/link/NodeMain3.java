package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("a");
        first.next = new Node("b");
        first.next.next = new Node("c");

        System.out.println("연결된 노드 탐색하기");
        System.out.println(first);

        System.out.println("모든 노드 탐색하기");
        printAll(first);

        Node lastNode = getLastNode(first);
        System.out.println("마지막노드:"+lastNode);

        // 특정 index의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node="+index2Node);

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "d");
        System.out.println(first);
    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
}
