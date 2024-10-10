//----------------------------------------------------------------------------------------------

// Java code for linearly search x in arr[]. If x

// is present then return its location, otherwise

// return -1

// Rayouf al jubiri
// 444008745

class LinearSearch {

            // This function returns index of element u in arr[]

            static int search(int arr[], int n, int u)

            {

                        for (int R = 0; R < n; R++) {

                                // Return the index of the element if the element

                                    // is found

                                    if (arr[R] == u)

                                                return R;

                        }

 

                        // return -1 if the element is not found

                        return -1;

            }

 

            public static void main(String[] args)

            {

                        int[] arr = { 1, 6, 4, 9, 3 };

                        int n = arr.length;

                        int u = 4;

                        int index = search(arr, n, u);

                        if (index == -1)

                          System.out.println("Element is not present in the array");

                        else

                          System.out.println("Element found at position " + index);

            }

}

//------------------------------------------------------------------------------------------------------