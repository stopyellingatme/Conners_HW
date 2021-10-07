public class RandomRepitition {

        public static void main(String[] args) {
                // declare an array to hold random numbers of 10
                int[] array = new int[10];
                // Generate random integers in range 0 to 10
                int min = 0, max = 10;
                // iterate through the array and store the value in index
                for (int index = 0; index < array.length; index++) {
                        array[index] = (int) (Math.random() * ((max - min) + 1)) + min;
                }
                // Print the array
                System.out.println("Generated array:");
                for (int index = 0; index < array.length; index++) {
                        System.out.print(array[index] + " ");
                }
                System.out.println("\nOccurrences");
                // call the occurrences and pass the input to it

                int[] occurrence = occurrences(array);
                //testing(occurrence); (FOR TESTING PURPOSES)
                
                // print the index and the number of occurrences
                for (int index = 0; index < occurrence.length; index++) {
                        System.out.print(index + "=" + occurrence[index] + ",");
                }
                System.out.println();
                // Print success if the game result is true else print failed
                System.out.println(gameResult(occurrence) ? "success" : "failed");
        }

        /**
         * Method to find the number of occurrences of each random number
         * 
         * @param input
         * @return the array with number of occurrences
         */
        public static int[] occurrences(int[] input) {
                int[] occurrenceArray = new int[11];
                // iterate through the array
                for (int index = 0; index < input.length; index++) {
                        // increment the index of the resulting array
                        occurrenceArray[input[index]]++;
                }
                // return the output array
                return occurrenceArray;

        }

        /**
         * @param occurences
         * @return true if every number was chosen at least once
         */
        public static boolean gameResult(int[] occurences) {
                boolean result = true;
                // iterate through the array
                for (int index = 0; index < occurences.length; index++) {
                        // check if the numbers are repeated
                        if (occurences[index] == 0) {
                                result = false;
                        }
                }
                // if all numbers are not selected at least once
                return result;

        }
/*
        * @param occurences
        * @return true if every number was chosen at least once
        */
       public static void testing(int[] occurences) {
               
               // iterate through the array
               for (int index = 0; index < occurences.length; index++) {
                       // check if the numbers are repeated
                       occurences[index] = 1;
               }
       }

}