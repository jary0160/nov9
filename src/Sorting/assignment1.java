/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import static Sorting.SortingNumbers.swap;

/**
 *
 * @author jary0160
 */
public class assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numbers myNumbers[] = new Numbers[5000];
        
        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = new Numbers
                        ("" + (i+1),
                        (int)(Math.random() * 0 + 5000),
                        (int)(Math.random() * 0 + 5000)
                        );
        
            System.out.println(myNumbers[i]);
        }
        }
        public static void bubbleSort(int[] myNumbers){
   	int k = 0;
   	boolean exchangeMade = true;
	// Make up to n - 1 passes through array, exit 
	//early if no exchanges are made on previous pass
  
 	while ((k < myNumbers.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < myNumbers.length - k; j++) { 
         		if (myNumbers[j] > [j + 1]){
            			swap(myNumbers, j, j + 1);		 
            			exchangeMade = true;
         		}//end if
		}//end for
	}//end while

}
public static void swap(int[] a, int x, int y){
   int temp = a[x];
   a[x] = a[y];
   a[y] = temp;
}
public static void selectionSort(int[] myNumbers){
   for (int i = 0; i < myNumbers.length - 1; i++){
      int minIndex = findMinimum(myNumbers, i);
      if (minIndex != i)
	//if lowest is not already in place
         swap(myNumbers, i, minIndex);
   } //end for
}  

//supporting findMinimum method

public static int findMinimum(int[] myNumbers, int first){
   //first=where to start looking from
   //assume first is also the smallest for now
   int minIndex = first; 
   for (int i = first + 1; i < myNumbers.length; i++)
      if (myNumbers[i] < myNumbers[minIndex])
         minIndex = i;
   return minIndex;
}

//supporting swap method (same as bubble sort swap)

public static void swap(int[] myNumbers, int x, int y){
   int temp = myNumbers[x];
   myNumbers[x] = myNumbers[y];
   myNumbers[y] = temp;
}

public static void insertionSort(int myNumbers[]){
	int itemToInsert, j;
	boolean stillLooking;

	//on the kth pass, pass item k upwards in list
	//and insert it in its proper place amoung the
	//first k entries in an array

	for (int k=1; k<myNumbers.length; k++){
	//move backwards through list, looking for
	//the right place to insert a[k];
		itemToInsert = myNumbers[k];
		j=k-1;
		stillLooking=true;
		while(j >=0 && stillLooking){
			if (itemToInsert < myNumbers[j]){
				//move item higher
				myNumbers[j+1] = myNumbers[j];
				j--;
			}else{
				//we have found new home for a[k];
				stillLooking=false;
			}//end else// j+1 is where the item goes
			myNumbers[j+1]=itemToInsert;
		}//end while
  	}//end for
}//end method
}
    

