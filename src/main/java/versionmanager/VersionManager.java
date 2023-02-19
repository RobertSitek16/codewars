package versionmanager;

public class VersionManager {

    private String version;

    public VersionManager() {
    }

    public VersionManager(String version) {
        this.version = version;
    }

    public VersionManager major() {

        return this;
    }

    public VersionManager minor() {

        return this;
    }

    public VersionManager patch() {

        return this;
    }

    public VersionManager rollback() {

        return this;
    }

    public String release() {
        VersionCreator validator = new VersionCreator();
        return validator.newVersion(version);
    }

}
