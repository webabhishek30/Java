package Main;

import java.util.*;

class Source {
    public static void main(String args[]) {
        int[] votes = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
        int userWithMostVotes = mostVotes(votes);
        System.out.println("User with the most votes is User: " + userWithMostVotes);
    }

    // write the function mostVotes() here.
    public static int mostVotes(int[] votes){
        int maxVal = findMax(votes);
        return findIndex(votes, maxVal);
    }


    // Find max value from an array element
    public static int findMax(int[] arr){
        int maxValue = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    maxValue = arr[i];
                    arr[i] = arr[j];
                    arr[j] = maxValue;
                }
            }
        }

        return maxValue;
    }


    // Find the index value of an array element
    public static int findIndex(int[] arr, int number){
        int arrLength = arr.length;
        int index = 0;

        while(index < arrLength){
            if(arr[index] == number){
                return index;
            }else{
                index = index + 1;
            }
        }
        return index;
    }
}
