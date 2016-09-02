import java.util.ArrayList;

public class SlidingPuzzle {
	
	private int side;
	private int[][] values;
	
	public SlidingPuzzle(int sideLength)
	{
		side = sideLength;
		values = new int[side][side];
		initialize();
		
	}
	
	public boolean isDone(){
		int prev = 0;
		for(int r = 0; r < side; r++)
		{
			for(int c = 0; c < side; c++)
			{
				if(values[r][c] < prev && values[r][c] !=0)
				{
					return false;
				}
				if(values[r][c]!= 0)
				{
				prev = values[r][c];
				}
			}
		}
		return true;
	}
	
	public void initialize(){
		
		ArrayList<Integer> vals = new ArrayList<Integer>();
		for(int i = 0; i < Math.pow(side, 2) ; i++)
		{
			vals.add(i);
		}
		
		for(int r = 0; r < side; r++)
		{
			for(int c = 0; c < side; c++)
			{
				values[r][c] = vals.remove((int)(Math.random()*vals.size()));
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SlidingPuzzle newPuzzle = new SlidingPuzzle(4);
		

	}

}
