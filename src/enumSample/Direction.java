package enumSample;

public enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

     Direction(String s) {
        shortCode = s;
    }

    private final String shortCode;


    public String getShortCode() {
        return shortCode;
    }
}
