package codility.lesson.lesson2;

import java.util.Arrays;

public class OddOccurrencesInArray {
	
	public int solution(int A[])
	{
		int[] a = A;
		int last_num = 0, current_cnt = 0;

		Arrays.sort(a);
		last_num=a[a.length-1];
		
		while(a.length>current_cnt+1) {
			if(a.length==1 || a[current_cnt]!=a[current_cnt+1]) {
				last_num=a[current_cnt];
				break;
			}
			current_cnt = current_cnt+2;
		}

		return last_num; 
		
	}

}
