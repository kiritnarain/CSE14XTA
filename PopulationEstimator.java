//Prints the estimated number of males, females and children in 2 towns with
//populations 100 and 2300.
public class PopulationEstimator {
    public static void main(String[] args){
        printEstimates(100); //Calls printEstimates, assigning population the value 100
        printEstimates(2300); //Calls printEstimates, assigning population the value 2300
    }

    //Prints to console the estimated number of males, females and children
    //in a town with give population using national average statistics.
    public static void printEstimates(int population){
        //int population = 100 --> don't need this anymore,
        //population is assigned a value when the method is called
        int male = (int) (population*0.494); //49.4% of population is male
        int female = (int) (population*0.506); //50.6% of population is female
        int children = (int) (population*0.223); //22.3% of population are children
        System.out.println("Male: "+male);
        System.out.println("Female: "+female);
        System.out.println("Children: "+children);
    }
}
