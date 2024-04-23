/**
 * ArrowPrinter is a class that prints an arrow made of asterisks, 
 * with desired size and direction.
 * 
 * @author Ricardo Machado Poffo
 */
public class ArrowPrinter {
    public static void main(String[] args) {
        int size = 3;
        System.out.println("-- UP --");
        printTheArrow("up", size);
        System.out.println("-- DOWN --");
        printTheArrow("down", size);
        System.out.println("-- RIGHT --");
        printTheArrow("right", size);
        System.out.println("-- LEFT --");
        printTheArrow("left", size);
    }

    public static void printTheArrow(String direction, int size) {
        switch (direction) {
            case "left":
                System.out.println(getLeftArrow(size));
                break;
            case "right":
                System.out.println(getRightArrow(size));
                break;
            case "up":
                System.out.println(getUpArrow(size));
                break;
            case "down":
                System.out.println(getDownArrow(size));
                break;
            default:
                System.out.println("Select a valid direction: left, right, up, down");
        }
    }

    private static String getLeftArrow(int size) {
        StringBuilder sb = new StringBuilder();
        int spacing = size - 1;
        do {
            sb.append(getOffset(spacing));
            sb.append("*");
            sb.append("\n");
            spacing--;
        } while (spacing > 0);
        do {
            sb.append(getOffset(spacing));
            sb.append("*");
            sb.append("\n");
            spacing++;
        } while (spacing < size);
        return sb.toString();
    }

    private static String getRightArrow(int size) {
        StringBuilder sb = new StringBuilder();
        int spacing = 0;
        while (spacing < size-1) {
            sb.append(getOffset(spacing));
            sb.append("*");
            sb.append("\n");
            spacing++;
        }
        while (spacing >= 0) {
            sb.append(getOffset(spacing));
            sb.append("*");
            sb.append("\n");
            spacing--;
        }
        return sb.toString();
    }

    public static String getDownArrow(int size) {
        StringBuilder sb = new StringBuilder();
        int spacing = size-3;
        for(int i = size; i > 0; i--) {
            if (i == 1) {
                sb.append(getOffset(size-1));
                sb.append("*");
            } else {
                sb.append(getOffset(size-i));
                sb.append("*");
                sb.append(getOffset(spacing+i));
                sb.append("*");
                spacing--;
            }
            sb.append("\n");

        }
        return sb.toString();
    }

    public static String getUpArrow(int size) {
        StringBuilder sb = new StringBuilder();
        int spaceBefore = size - 1;
        int spaceBetween = 1;
        for(int i = 0; i < size; i++) {
            if (i == 0) {
                sb.append(getOffset(spaceBefore));
                sb.append("*");
                spaceBefore--;
            } else {
                sb.append(getOffset(spaceBefore));
                sb.append("*");
                sb.append(getOffset(spaceBetween));
                sb.append("*");
                spaceBefore--;
                spaceBetween+=2;
            }
            sb.append("\n");

        }
        return sb.toString();
    }

    public static String getOffset(int size){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= size; i++){
            sb.append(" ");
        }

        return sb.toString();
    }
}