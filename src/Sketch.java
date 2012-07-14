
public class Sketch
{
	/**
	 * @author Drew Spencer
	 */
	public static void main(String[] args)
	{
		// create new array of given size
		Integer[] result = func(new Integer[8]);
		Integer[] result2 = func(new Integer[9]);
		Integer[] result3 = func(new Integer[10]);
		Integer[] result4 = func(new Integer[11]);
		Integer[] result5 = func(new Integer[12]);
		Integer[] result6 = func(new Integer[13]);
		Integer[] result7 = func(new Integer[13]);

		
		printArray(result);
		System.out.println("");
		printArray(result2);
		System.out.println("");
		printArray(result3);
		System.out.println("");
		printArray(result4);
		System.out.println("");
		printArray(result5);
		System.out.println("");
		printArray(result6);
		System.out.println("");
		printArray(result7);

	}
	
	private static Integer[] func(Integer[] firstArray)
	{
		// first check if this is the last pair
		if(firstArray.length == 2)
		{
			Integer[] arrayToReturn =  new Integer[2];
			arrayToReturn[0] = 1;
			arrayToReturn[1] = 1;
			
			return arrayToReturn;
		}
		
		// num is for first two columns
		int num = firstArray.length-1;
		
		// set first column
		firstArray[0] = num;
		
		// start loop to go over each item
		for(int i = 1; i < firstArray.length; i++)
		{
			firstArray[i] = num;
			num--;
		}
		
		// second array which will be placed into this one
		Integer[] newArray = func(new Integer[firstArray.length-1]);
		
		// now loop the new array but shift index one to the right
		for(int t = 0; t < newArray.length; t++)
		{
			firstArray[t+1] += newArray[t];
		}
		
		return firstArray;
	}

	
	// the wonder of java
	static void printArray(Integer[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("Index: " + array[i]);
		}
	}

}
