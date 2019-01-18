package temp;

public class Main {


	
	public static void main(String[] args) {
		int[] heights = {32,10,91,40};
		int min = 10,max=50;
		int ans = Main.count(heights,min,max);
		System.out.println(ans);
	}


	private static int count(int[] heights, int min, int max) {
		int c = 0;
		for(int i=0;i<heights.length;i++) {
			if(heights[i]>=min && heights[i]<=max)
				c++;
	}
		return c;
	}

	}
