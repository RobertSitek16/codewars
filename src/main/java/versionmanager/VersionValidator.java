package versionmanager;

public class VersionValidator {

    public static String validatedVersion(StringBuilder newVersion) {
        if (newVersion.isEmpty()) {
            return defaultVersion();
        }
        return hasValidLength(newVersion.length()) ? newVersion.toString() : addValidEndVersion(newVersion).toString();
    }

    private static String defaultVersion() {
        return "0.0.1";
    }

    private static boolean hasValidLength(int length) {
        return length == 5;
    }

    private static StringBuilder addValidEndVersion(StringBuilder newVersion) {
        return switch (newVersion.length()) {
            case 1:
                yield newVersion.append(".0.0");
            case 2:
                yield newVersion.append("0.0");
            case 3:
                yield newVersion.append(".0");
            case 4:
                yield newVersion.append("0");
            default:
                yield newVersion;
        };
    }

}
