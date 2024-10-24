public class Contractor extends Object {
    private double contractAmount;
    private String jobDescription;
    private String name;
    private static int accidents = 0;

    public Contractor() {
        /*
        default values of a contractor
        i can create a contractor with no job
         */
        contractAmount = 0;
        jobDescription = "Looking for work...";

        System.out.println("A contractor with no job was created!");

    }

    public static void accidentReport() {
        accidents++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(double contractAmount) {
        if (contractAmount > 0) {
            this.contractAmount = contractAmount;
        }

    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    @Override
    public boolean equals(Object other) {
//        if (this.contractAmount == ((Contractor)(other)).contractAmount) {
//            return true;
//        } else {
//            return false;
//        }
        return false;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Contract: $" + contractAmount;
    }
}
