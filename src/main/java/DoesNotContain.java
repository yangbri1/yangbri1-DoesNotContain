
public class DoesNotContain {
    /**
     * The inverse of the contains value challenge: check if the array does *not* contain the value.
     * You should think critically about the logic that you write within the for loop.
     *
     * For a trickier problem like this, you should try explaining your thought process of working
     * through this problem with pencil and paper in plain English before attempting it in code.
     * For instance: for the contains problem, your code had to check every value to see if the value
     * matches the target, and if it matched the target, the array was sure to contain the target. Think
     * of a similar process here.
     *
     * @param arr the array we will be manipulating.
     * @param target the value we are searching for.
     * @return true if arr does not contain target. false otherwise.
     */
    public boolean arrayDoesNotContain(int[] arr, int target){
        
        // initialize variable 'notContain' w/ default value of true
        boolean notContain = true;
        // utilize for-each loop to iterate through each 'elem' in int array 'arr'
        for(int elem : arr){
            // if 'elem' does equals 'target' value ...
            if(elem == target){     // Note: '==' operator works here as we are comparing primitive types (not complex Object types)
                notContain = false;
            }
            // otherwise 'notContain' stays true
        }
        // return statement outside else errors
        return notContain;
        

        // nevermind this truncated way does NOT seem to work as java.util.Arrays.asList() here creates an List<int[]> --- aka a List w/ 1 elem of int array
        // https://www.geeksforgeeks.org/arrays-aslist-method-in-java-with-examples/
        // https://www.geeksforgeeks.org/list-contains-method-in-java-with-examples/
        // boolean aryContain = java.util.Arrays.asList(arr).contains(target);
        // return(!(aryContain));
    }
}
