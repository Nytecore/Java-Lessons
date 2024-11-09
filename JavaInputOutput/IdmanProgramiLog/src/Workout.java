public class Workout {

    private int NumberofPushup;
    private int NumberofPlank;
    private int NumberofBenchpress;
    private int NumberofLegpress;

    public Workout(int numberofPushup, int numberofPlank, int numberofBenchpress, int numberofLegpress) {

        NumberofPushup = numberofPushup;
        NumberofPlank = numberofPlank;
        NumberofBenchpress = numberofBenchpress;
        NumberofLegpress = numberofLegpress;
    }

            // Getter & Setters
    public int getNumberofPushup() {
        return NumberofPushup;
    }

    public void setNumberofPushup(int numberofPushup) {
        NumberofPushup = numberofPushup;
    }

    public int getNumberofPlank() {
        return NumberofPlank;
    }

    public void setNumberofPlank(int numberofPlank) {
        NumberofPlank = numberofPlank;
    }

    public int getNumberofBenchpress() {
        return NumberofBenchpress;
    }

    public void setNumberofBenchpress(int numberofBenchpress) {
        NumberofBenchpress = numberofBenchpress;
    }

    public int getNumberofLegpress() {
        return NumberofLegpress;
    }

    public void setNumberofLegpress(int numberofLegpress) {
        NumberofLegpress = numberofLegpress;
    }

    public void MakeaMove (String movementType, int movementNumber) {

        if (movementType.equals("Pushup")) {
            doPushup(movementNumber);

        } else if (movementType.equals("Plank")) {
            doPlank(movementNumber);

        } else if (movementType.equals("Bench Press")) {
            doBenchpress(movementNumber);

        } else if (movementType.equals("Leg Press")) {
            doLegpress(movementNumber);

        } else {

            System.out.println("Invalid..!");

        }
    }

    public void doPushup (int number){

        if (NumberofPushup == 0) {
            System.out.println("No more push-ups");

        } if (NumberofPushup - number < 0) {
            System.out.println("\nCongratulations. You exceeded the number of push-ups!");
            NumberofPushup = 0;
            System.out.println("Push-up remaining : " + NumberofPushup);

        } else {

            NumberofPushup -= number;
            System.out.println("Push-up remaining " + NumberofPushup);
        }
    }

    public void doPlank (int number){

        if (NumberofPlank == 0) {
            System.out.println("No more plank");

        } if (NumberofPlank - number < 0) {
            System.out.println("\nCongratulations. You exceeded the number of plank!");
            NumberofPlank = 0;
            System.out.println("Plank remaining : " + NumberofPlank);

        } else {

            NumberofPlank -= number;
            System.out.println("Plank remaining " + NumberofPlank);
        }
    }

    public void doBenchpress (int number){

        if (NumberofBenchpress == 0) {
            System.out.println("No more bench press");

        } if (NumberofBenchpress - number < 0) {
            System.out.println("\nCongratulations. You exceeded the number of bench press!");
            NumberofBenchpress = 0;
            System.out.println("Bench press remaining : " + NumberofBenchpress);

        } else {

            NumberofBenchpress -= number;
            System.out.println("Bench press remaining " + NumberofBenchpress);
        }
    }

    public void doLegpress (int number){

        if (NumberofLegpress == 0) {
            System.out.println("No more leg press.");

        } if (NumberofLegpress - number < 0) {
            System.out.println("\nCongratulations. You exceeded the number of leg press!");
            NumberofLegpress = 0;
            System.out.println("Leg press remaining : " + NumberofLegpress);

        } else {

            NumberofLegpress -= number;
            System.out.println("Leg press remaining " + NumberofLegpress);
        }
    }

    public boolean WorkoutIsOver () {

        return ( NumberofPushup == 0 ) && ( NumberofPlank == 0 ) && ( NumberofBenchpress == 0 ) && ( NumberofLegpress == 0 );
    }


}
