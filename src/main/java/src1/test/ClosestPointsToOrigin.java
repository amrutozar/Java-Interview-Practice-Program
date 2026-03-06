package src1.test;

import java.util.*;

public class ClosestPointsToOrigin {
    public static int[][] kClosest(int[][] points, int S) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );
        
        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > S) {
                maxHeap.poll();
            }
        }
        
        int[][] result = new int[S][2];
        for (int i = 0; i < S; i++) {
            result[i] = maxHeap.poll();
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[][] points = {
            {1, 2},
            {3, 5},
            {-1, 1},
            {7, 9}
        };
        
        int S = 2;
        int[][] closestPoints = kClosest(points, S);
        
        System.out.println("Closest Points:");
        for (int[] point : closestPoints) {
            System.out.println(Arrays.toString(point));
        }
    }
}

