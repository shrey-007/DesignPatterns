package factory.operatingSystems;

public abstract class OperatingSystem {
    private String  version;
    private String architecture;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public OperatingSystem(String version, String architecture) {
        this.version = version;
        this.architecture = architecture;
    }

    // The implementation of these two methods will we different for different OS, thats why they are abstract so that
    // OS can implement them as per their commands.

    public abstract void changeDir(String dir);
    public abstract void removeDir(String dir);
}
