package datatypesandoperatiors;

public class If_switch {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        if (x % 2 == 0)  {
            if (y % 2 == 0) {
                System.out.println("Удачное совпадение");
            }
        } else {
            if (x % 2 != 0)  {
                if (y % 2 != 0) {
                    System.out.println("Удачное совпадение");
                }
            }
        }
    }
}
