package factory;

public class SoftwareDeveloperCompany {
    public Developer getDeveloper(String typeOfDeveloper) {
        if (typeOfDeveloper == null) {
            return null;
        }
        if (typeOfDeveloper.equalsIgnoreCase("Backend")) {
            return new BackEndDeveloper();
        } else if (typeOfDeveloper.equalsIgnoreCase("FrontEnd")) {
            return new FrontEndDeveloper();
        }

        return null;
    }
}
