package enums;

public enum Direction {

    EAST('E', -2),

    SOUTH('S', -1),

    WEST('W', 2),

    NORTH('N', 1),

    ;
    
    private char code;

    private int val;

    private Direction(char code, int val) {
        this.code = code;
        this.val= val;
    }

    public char getCode() {
        return this.code;
    }

    public int getVal() {
       return this.val;
    }

    public boolean isOpposite(Direction direction) {
        return this.val * -1 == direction.getVal();
    }

    public static void main(String[] args) {
        System.out.println(Direction.SOUTH.isOpposite(Direction.NORTH)); // TRUE
        System.out.println(Direction.SOUTH.isOpposite(Direction.SOUTH)); // FALSE
        System.out.println(Direction.SOUTH.isOpposite(Direction.EAST)); // FALSE
        System.out.println(Direction.SOUTH.isOpposite(Direction.WEST)); // FALSE
    }

}
