//package chap05;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class _029 {
//    public static void main(String[] args) {
//        ArrayList<Long> list = new ArrayList<>();
//        ArrayList<Node> findList = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            list.add(sc.nextLong());
//        }
//        Collections.sort(list);
//
//        int m = sc.nextInt();
//        for (int i = 0; i < m; i++) {
//            findList.add(new Node(sc.nextLong(), i));
//        }
//        Collections.sort(findList, new Comparator<Node>() {
//            @Override
//            public int compare(Node o1, Node o2) {
//                if (o1.value < o2.value) {
//                    return -1;
//                } else if (o1.value > o2.value) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        int[] arr = new int[m];
//
//        int i = 0;
//        int j = 0;
//        while (i < n && j < m) {
//            if (list.get(i) == findList.get(j).value) {
//                arr[findList.get(j).index] = 1;
//                i++;
//                j++;
//            } else if (list.get(i) > findList.get(j).value) {
//                arr[findList.get(j).index] = 0;
//                j++;
//            } else {
//                i++;
//            }
//        }
//        while (j < m) {
//            arr[findList.get(j).index] = 0;
//            j++;
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int k = 0; k < m; k++) {
//            sb.append(arr[k] + "\n");
//        }
//        System.out.println(sb);
//    }
//}
//
//class Node {
//    long value;
//    int index;
//
//    public Node(long value, int index) {
//        this.value = value;
//        this.index = index;
//    }
//}
///* 1 2 3 4 5
// * 1 3 5 7 9*/
