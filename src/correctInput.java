import java.util.Scanner;

public class correctInput {
    private Scanner scin= new Scanner(System.in);
    public String correct_name(String name_type, String name_genitive){
        String name="none";
        try {
            do {
                System.out.print("Введите " + name_type + ": ");
                name = scin.nextLine();
                System.out.print("\n");
                if (name.length() > finals.name_length_max)
                    System.out.println("Длина " + name_genitive + " должна быть меньше 30.");
                else if (name.length() < finals.name_length_min)
                    System.out.println("Длина " + name_genitive + " должна быть больше 0.");
                else if (name.indexOf(" ") != -1)
                    System.out.println("В " + name_genitive + " не должно быть пробелов.");
            } while (name.length() > finals.name_length_max ||
                    name.length() < finals.name_length_min ||
                    name.indexOf(" ") != -1);
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return name;
    }
    public short correct_number(short number_min, short number_max, String number_type){
        String error;
        int number=0;
        do{
            error="";
            try {
                System.out.println("Введите " + number_type + ": ");
                number = scin.nextInt();
                if(number>(int)number_max){
                    System.out.println("Максимальное вводимое число - "+number_max);
                }
                else if(number<(int)number_min){
                    System.out.println("Минимальное вводиное число - "+number_min);
                }
            } catch (Exception err) {
                scin.nextLine();
                System.out.println("Ввидите число.");
                error = err.toString();
            }
        }while (error.equals("java.util.InputMismatchException")||
                number<(int)number_min||number>(int)number_max);
        return (short)number;
    }
    public byte correct_number(byte number_min, byte number_max, String number_type){
        String error;
        int number=0;
        do{
            error="";
            try {
                System.out.println("Введите " + number_type + ": ");
                number = scin.nextInt();
                if(number>(int)number_max){
                    System.out.println("Максимальное вводимое число - "+number_max);
                }
                else if(number<(int)number_min){
                    System.out.println("Минимальное вводиное число - "+number_min);
                }
            } catch (Exception err) {
                scin.nextLine();
                System.out.println("Ввидите число.");
                error = err.toString();
            }
        }while (error.equals("java.util.InputMismatchException")||
                number<(int)number_min||number>(int)number_max);
        return (byte)number;
    }
}
