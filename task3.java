class public static Project3 {

        boolean mode;
        int numberOfTimesRun = 5;
        double startingNumber = 3;
        double finalNumber;

        /**
         * Project Instructions:
         * In this project, you will use condtionals and loops to achieve a task.
         * Check if the mode is true or false.
         * If the mode is true, multiply the startingNumber by itself as many times as specified by numberOfTimesRun
         * If the mode is false, divide the startingNumber by itself as many times as specifed by numberOfTimesRun
         * Note: You will not be able to run this file as the Java environment is not set up.
         * Once done, commit your changes and push to GitHub
         */

        public static void main(String[] args) {

          if(mode == true){
            for(int i = 1; i <= numberOfTimesRun;i++){
              startingNumber=startingNumber*startingNumber;
            }
          }
          else{
            for(int i = 1; i <= numberOfTimesRun;i++){
              startingNumber=startingNumber*startingNumber;
            }
          }
  
}
