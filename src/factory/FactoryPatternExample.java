package factory;

public class FactoryPatternExample {
    public static void main(String[] args) {
        SoftwareDeveloperCompany softwareDeveloperCompany = new SoftwareDeveloperCompany();

        Developer backendDev = softwareDeveloperCompany.getDeveloper("Backend");
        backendDev.jobDescription();

        Developer frontDev = softwareDeveloperCompany.getDeveloper("FrontEnd");
        frontDev.jobDescription();
    }
}
