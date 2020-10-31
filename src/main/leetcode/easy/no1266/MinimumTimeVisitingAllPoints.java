package leetcode.easy.no1266;

public class MinimumTimeVisitingAllPoints {
	public int minTimeToVisitAllPoints(int[][] points) {
        int total_time = 0;
        int diff_width = 0;
        int diff_height = 0;
        for(int i=1; i<points.length; i++) {
            diff_width = Math.abs(points[i][0] - points[i-1][0]);
            diff_height = Math.abs(points[i][1] - points[i-1][1]);
            total_time = total_time + ((diff_width >= diff_height) ? diff_width : diff_height);
        }
        return total_time;
    }
}
