
public class Main{
    public static void main(String[] args){
        String line = "\n---------------------------------------------------------------------\n";
        newStudents a = new newStudents();
        a.create("Костин","Леонард","Рудольфович",2010,50,80,50,90);
        a.create("Мясников","Альберт","Улебович",2003,100,66,55,38);
        a.create("Королёв","Трофим","Федотович",1990,80,70,60,56);
        a.create("Белов","Артем","Степанович",1950,58,65,99,90);
        a.create("Романов","Витольд","Якунович",1999,89,56,11,84);
        a.create_after(2,"Муравьёва","Ярослава","Авдеевна",2003,97,60,75,38);

        System.out.println(line+"Вывод всех записей.");
        a.get_all();
        System.out.println(line+"Удаление записей со средним балом ниже указанного.");

        a.delete_by_average_mark(60);

        System.out.println(line+"Вывод всех записей.");
        a.get_all();
        System.out.println(line+"Удаление второй записи.");

        a.delete(2);

        System.out.println(line+"Вывод всех записей.");
        a.get_all();

        System.out.println(line+"Вывод записи с указаным именем.");

        a.get_by_name("Ярослава");
        System.out.println(line+"Удаление всех записей.");

        a.delete_all();

        System.out.println(line+"Вывод всех записей.");
        a.get_all();
        System.out.println(line);

    }
}