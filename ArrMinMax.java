package NText;

public class ArrMinMax {
	

		    public int[] minMax(int arr[]) {
		    	int max = arr[0], min = arr[0];
		    	for(int i = 0; i < arr.length; i++) {
		    		if(arr[i] > max) max = arr[i];
		    		if(arr[i] < min) min = arr[i];
		    	}
		    	int[] result = {max,min};
		    	return result;
		    }
		    

}