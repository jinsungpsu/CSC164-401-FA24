public class Contractor {
    private double contractAmount;
    private String jobDescription;

    public Contractor() {
        /*
        default values of a contractor
        i can create a contractor with no job
         */
        contractAmount = 0;
        jobDescription = "Looking for work...";

        System.out.println("A contractor with no job was created!");

    }

    public double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
