class Solution {


  // Solution One TC : O(nlogk)
  public int kthSmallest(int[][] matrix, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> (b - a));

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        pq.offer(matrix[i][j]);
        if (pq.size() > k) {
          pq.poll();
        }

      }
    }

    return pq.peek();
  }
}