package Arrays;


	//Quicksort
	/*
	invented by C.A.R.Hoare
	it relies on recursion
	built on the idea of partitions: select a value, called the comparand, and then to partition the array into to sections
	All elements greater than or equal to the comparand are put on one side, and those less than the comparand are put on th other.
	This process is then repeated for each remaining section until the array is sorted.
	On the left and on the right of the comparand the process will be repeated.

	*/

	class Quicksort{
				//setup a ca to the actual quicksort method
		static void qsort(char[] items){		// qsort method sets up the a call to the actual quicksort method, qs().
						qs(items, 0, items.length-1);
			}
			
				//a recursive version of quicksort for characters
		private static void qs(char[] items, int left, int right){
			int i,j;
			char x,y;
			
			i = left; j = right;
			x = items[(left+right)/2];
			do{
				while ((items[i] < x) && (i<right)) i++;
				while ((x < items[j]) && (j>left)) j++;
				
				if (i <=j){
				y = items[i];
				items [i] = items[j];
				items[j] = y;
				i++; j--;
				}
			} while (i <=j);
			
			if (left < j) qs (items, left, j);
			if (i< right) qs (items, i, right);
			
			}
	}

	/* to use Quicksort, simply call Quickksort.qsort(). 
	Since qsort() is specified as static, it cn be called through its class rather than on an object. 
	*/

	class QSDemo{
		public static void main (String[] args){
		char[] a = {'d', 'x', 'a', 'r', 'p', 'j', 'i' };
		int i;
		
		System.out.print ("Original array: ");
		for(i = 0; i < a.length; i++)
			System.out.println();
			
			//now sort
			Quicksort.qsort(a);
			System.out.print ("Sorted array: ");
			for(i = 0; i < a.length; i++)
			System.out.println(a[i]);
			
		}
	}

