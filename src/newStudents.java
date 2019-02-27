import java.util.ArrayList;
import java.util.Iterator;

public class newStudents {
    private ArrayList<abiturient> abiturients;
    private int count;
    private int registration_number;
    newStudents(){
        registration_number=1;
        abiturients = new ArrayList<abiturient>();
    }
    void create(String first_name, String second_name,
                String third_name, int birth_year,
                int certificate_average_mark,
                int exam_first_rating,
                int exam_second_rating,
                int exam_third_rating){
        abiturients.add(
                        new abiturient(
                                        first_name, second_name,
                                        third_name, birth_year,
                                        registration_number,
                                        certificate_average_mark,
                                        exam_first_rating,
                                        exam_second_rating,
                                        exam_third_rating));
        count++;
        registration_number++;
    }
    void delete(int registration_number){
        boolean is_exist = false;
        for (abiturient item : abiturients){
            if(item.get_registration_number()==registration_number){
                count--;
                is_exist=true;
                abiturients.remove(abiturients.indexOf(item));
                break;
            }
        }
        if(is_exist)System.out.println("Запись успешно удалена.");
        else System.out.println("Нет записи с таким номером.");
    }
    void delete_all(){
        count=0;
        registration_number=1;
        abiturients.clear();
        System.out.println("Все записи удалены.");
    }
    void get_by_name(String second_name){
        boolean is_exist=false;
        for (abiturient item : abiturients){
            if(item.get_second_name()==second_name){
                is_exist=true;
                abiturients.get(abiturients.indexOf(item)).output_to_console();
            }
        }
        if(is_exist==false) System.out.println("Нет записей с такой фамилией.");
    }
    void create_after(int number, String first_name, String second_name,
                      String third_name, int birth_year,
                      int certificate_average_mark,
                      int exam_first_rating,
                      int exam_second_rating,
                      int exam_third_rating){
        abiturients.add(number,
                        new abiturient(
                                        first_name, second_name,
                                        third_name, birth_year,
                                        registration_number,
                                        certificate_average_mark,
                                        exam_first_rating,
                                        exam_second_rating,
                                        exam_third_rating));
        count++;
        registration_number++;
    }
    void delete_by_average_mark(int average_mark){
        for (int i = 0; i < count; i++){
            if(abiturients.get(i).get_certificate_average_mark()<average_mark){
                abiturients.remove(i);
                count--;
                i--;
            }
        }
        System.out.println("Записи удалены.");
    }
    void get_all(){
        boolean is_exist=false;
        for (abiturient item : abiturients){
            is_exist=true;
            item.output_to_console();
        }
        if(is_exist==false) System.out.println("Нет записей.");
    }
}
