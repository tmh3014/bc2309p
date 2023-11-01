package enums;

// During the compile time, 
// JVM create 3 Color objects (White, Black, Blue) in memory
// We cannot new color object by ourselves
public enum Color {
    
    WHITE('W', "White"),
    BLACK('B', "Black"),
    BLUE('U', "Blue"),
    ;

    private char code;
    private String description;

    private Color(char code, String description) {
        this.code = code;
        this.description = description;
    }

    public char getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    // Method: Find enum by a code (values())
public static Color getColor(char code) {
    for (Color color : Color.values()) {
        if (color.getCode() == code) {
            return color;
        }
    }
    return null; // throw
}

public static String getMessage(Color color) {
    // switch
    switch (color) {
        case BLUE:
        return "This is Color.BLUE";
        case WHITE:
        return "This is Color.WHITE";
        case BLACK:
        return "This is Color.BLACK";
        default:
        return null;
    }
}

}
