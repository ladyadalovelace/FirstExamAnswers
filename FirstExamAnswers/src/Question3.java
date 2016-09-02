import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = new double[20];
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = Math.random()*100;
		}
		
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
