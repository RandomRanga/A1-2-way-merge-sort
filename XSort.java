public class XSort {
    public static void main(String[] args) {
        
        // Makes sure at least two arguments are provided, else exits with error status 
        if (args.length < 1) {
            System.err.println("Usage: java Xsort <linesPerRun> [mergeMode]");
            System.exit(1);
        }

        //Variables
        int linesPerRun = 0;
        Integer mergeMode = null; 

        //Checks the first arguent(linesPerRun) is provided and valid. 
        try {
            //Parse the first argument(linesPerRun) as an int.
            linesPerRun = Integer.parseInt(args[0]);

            // Ensures that linesPerRun is within the correct range, else exits with error status. 
            if (linesPerRun < 64 || linesPerRun > 1024){
                System.err.println("linesPerRun must be between 64 and 1024.");
                System.exit(1);
            }
        }
        // Uses numberFormatException as all other exceptions should already be handled. 
        catch (NumberFormatException ex) {
            //Handles cases where there is a non-interger value, exits with error status. 
            System.err.println("linesPerRun must be a valid interger between 64 and 1024");
            System.exit(1);
        }



        //Checks the second arguent (mergeMode) is provided and valid. 
        if (args.length >= 2){

            try {
                //Parse the second arguent (mergeMode) as an integer.
                mergeMode = Integer.parseInt(args[1]);

                // Ensures that mergeMode is 2, as doing solo so don't need to worry about 4, else exits with error status. 
                if (mergeMode != 2){
                    System.err.println("mergeMode must be 2, doing solo.");
                    System.exit(1);
                }
            }
            // Uses numberFormatException as all other exceptions should already be handled. 
            catch (NumberFormatException ex) {
                //Handles cases where there is a non-interger value, exits with error status. 
                System.err.println("mergeMode must be 2, as doing project solo.");
                System.exit(1);
            }

        }

        //using for debugging to ensure outputs are as expected. 
        System.out.println("Lines Per Run: " + linesPerRun);
        if (mergeMode != null){
            System.out.println("Merge Mode: " + mergeMode);
        }
        else {
            System.out.println("no merge mode specified, only generating intial runs.");
        }
        

    }
    
    
}