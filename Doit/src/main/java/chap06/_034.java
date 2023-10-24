//package chap06;
//
//import java.util.Comparator;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//public class _034 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        PriorityQueue<Integer> queuePositive = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        PriorityQueue<Integer> queueNegative = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });
//        int zeroCount = 0; // 0 인 경우 count
//
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            int num = sc.nextInt();
//            if (num == 0) {
//                zeroCount++;
//            } else if (num > 0) {
//                queuePositive.add(num);
//            } else {
//                queueNegative.add(num);
//            }
//        }
//        int sum = 0;
//        if (zeroCount == 0) {
//            while (queuePositive.size() > 1) {
//                sum += queuePositive.poll() * queuePositive.poll();
//            }
//            while (queueNegative.size() > 1) {
//                sum += queueNegative.poll() * queueNegative.poll();
//            }
//            if (!queuePositive.isEmpty()) {
//                sum += queuePositive.poll();
//            }
//            if (!queueNegative.isEmpty()) {
//                sum += queueNegative.poll();
//            }
//        } else {
//            while (queuePositive.size() > 1) {
//                sum += queuePositive.poll() * queuePositive.poll();
//            }
//            if (!queuePositive.isEmpty()) {
//                sum += queuePositive.poll();
//            }
//            int length = queueNegative.size() - zeroCount;
//            if (length > 0) {
//                if (length % 2 == 0) {
//                    for (int i = 0; i < length / 2; i++) {
//                        sum += queueNegative.poll() * queueNegative.poll();
//                    }
//                } else {
//                    for (int i = 0; i < length / 2; i++) {
//                        sum += queueNegative.poll() * queueNegative.poll();
//                    }
//                    while (queueNegative.size() > 1) {
//                        queueNegative.poll();
//                    }
//                    sum += queueNegative.poll();
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//}
//
///* 길이가 N인 수열이 주어 졌을 때
// * 그 수열의 합
// * 모두 더해서 구하는게 아니라
// * 수열의 두 수를 묶으려고 한다.
// * 위치에 상관없이 묶을 수 있고. 다만 같은 위치는 못 묶음.
// *
// * 수열의 합을 구할 때는
// * 묶은 수는 서로 곱하면서 더함. ProductSum
// * 예를 들어
// * 0+1 + (2*3) + (4*5) = 27 로 된다.
// * 0 1 을 안 묶는 경우 가 더 크다.
// * 0은 그냥 냅두고 나머지에 대해서 생각하는 것
// * 정답은 2^31 보다 작으므로 그냥 int로 하자*/
///* 우선순위 큐에 넣은다음에
// * 경우의 수를 따져본다.
// * - - -> 곱한다.
// * - 0 -> 곱한다.
// * 0 0 -> 곱하지 않는다.
// * 0 + -> 곱하지 않는다.
// * + + -> 곱한다.*/
