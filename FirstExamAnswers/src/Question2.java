import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] values = { 1, 20, 35, 15, 10, 20, 50 };
		
		double curr, prev, next;
		
		curr = values[0];
		prev = values[0];
		next = values[1];
		
		values[0] = (next + curr)/2;
		
		for (int i = 1; i < values.length-1; i ++)
		{
			double temp = values[i];
			curr = values[i];
			next = values[i+1];
			
			values[i] = (curr + next + prev) / 3;
			
			prev = temp;
		}
		
		values[values.length-1] = (prev + values[values.length-1])/2;
		
		System.out.println(Arrays.toString(values));
	}

}
