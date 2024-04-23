/**
 * Interview question of the week
Last week, I had you find specific substrings. There were some tricky answers! Great job Gu, Jeroen, Amine, John, The Math Jester, Mazen, Saad, Nathael, Ryan, Kyle, Ten, and Pozorvlak!

This week's question:
Given a direction and a number, write a function that outputs an arrow of asterisks with the height of that number! See the pattern below.

Example:

$ printArrow('right', 3)
*
 *
  *
 *
*

$ printArrow('left', 5)
    *
   *
  *
 *
*
 *
  *
   *
    *

$ printArrow('up', 2)
  *
 * *
  
  
 */

public class ArrowPrinter {
    public static void main(String[] args) {
        System.out.println("-- UP --");
        printTheArrow("up", 3);
        System.out.println("-- DOWN --");
        printTheArrow("down", 9);
    }

    public static void printTheArrow(String direction, int size) {
        switch (direction) {
            case "left":
            case "right":
            case "up":
                System.out.println(getUpArrow(size));
                break;
            case "down":
                System.out.println(getDownArrow(size));
                break;
            default:
        }
    }

    /**
     * getDownArrow
     * @param size
     * @return
     */
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

    /**
     * getUpArrow
     * @param size
     * @return
     */
    public static String getUpArrow(int size) {
        StringBuilder sb = new StringBuilder();
        int spacing = 0;
        for(int i = 0; i < size; i++) {
            if (i == 0) {
                sb.append(getOffset(size));
                sb.append("*");
            } else {
                sb.append(getOffset(size-i));
                sb.append("*");
                sb.append(getOffset(spacing+i));
                sb.append("*");
                spacing++;
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