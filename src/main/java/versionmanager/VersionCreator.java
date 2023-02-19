package versionmanager;

import static versionmanager.VersionValidator.validatedVersion;

public class VersionCreator {

    public String newVersion(String version) {
        String[] versionAsArray = version.split("");
        return createNewVersion(versionAsArray);
    }

    private String createNewVersion(String[] versionAsArray) {
        StringBuilder newVersion = new StringBuilder();
        for (int i = 0; i < versionAsArray.length; i++) {
            if (versionAsArray[i].matches("[\\d.]")) {
                newVersion.append(versionAsArray[i]);
            }
            if (newVersion.length() == 5) {
                break;
            }
        }
        return validatedVersion(newVersion);
    }

}
