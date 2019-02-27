public class abiturient {
    private String first_name;
    private String second_name;
    private String third_name;
    private short birth_year;
    private short registration_number;
    private byte certificate_average_mark;
    private byte exam_first_rating;
    private byte exam_second_rating;
    private byte exam_third_rating;
    abiturient(int registration_number){
        this.first_name="";
        this.second_name="";
        this.third_name="";
        this.birth_year=0;
        this.registration_number = (short) registration_number;
        this.certificate_average_mark=0;
        this.exam_first_rating=0;
        this.exam_second_rating=0;
        this.exam_third_rating=0;
    }
    abiturient(String first_name,
               String second_name,
               String third_name,
               int birth_year,
               int registration_number,
               int certificate_average_mark,
               int exam_first_rating,
               int exam_second_rating,
               int exam_third_rating){
        this.first_name=first_name;
        this.second_name=second_name;
        this.third_name=third_name;
        this.birth_year=(short) birth_year;
        this.registration_number=(short)registration_number;
        this.certificate_average_mark=(byte)certificate_average_mark;
        this.exam_first_rating=(byte)exam_first_rating;
        this.exam_second_rating=(byte)exam_second_rating;
        this.exam_third_rating=(byte)exam_third_rating;
    }
//----------
    public void set_first_name(String name) {
    this.first_name = name;
}
    public void set_second_name(String name){
        this.second_name = name;
    }
    public void set_third_name(String name){
        this.third_name = name;
    }
    public void set_birth_year(int number){
        this.birth_year=(short)number;
    }
    public void set_registration_number (int number){
        this.registration_number=(short)number;
    }
    public void set_certificate_average_mark(int number){
        this.certificate_average_mark=(byte) number;
    }
    public void set_exam_first_rating(int number){
        this.exam_first_rating=(byte) number;
    }
    public void set_exam_second_rating(int number){
        this.exam_second_rating=(byte) number;
    }
    public void set_exam_third_rating(int number){
        this.exam_third_rating=(byte) number;
    }
//----------
    public void set_first_name() {
        this.first_name = new correctInput().correct_name("Имя", "имени");
    }
    public void set_second_name(){
        this.second_name = new correctInput().correct_name("Фамилию", "фамилии");
    }
    public void set_third_name(){
        this.third_name = new correctInput().correct_name(
                "Отчество", "отчества");
    }
    public void set_birth_year(){
        this.birth_year=new correctInput().correct_number(
                finals.birth_year_min, finals.birth_year_max, "Год рождения");
    }
    public void set_registration_number (){
        this.registration_number=new correctInput().correct_number(
                finals.registration_number_min, finals.registration_number_max, "Регистрационный номер");
    }
    public void set_certificate_average_mark(){
        this.certificate_average_mark=new correctInput().correct_number(
                finals.mark_min, finals.mark_max, "Средний балл атестата");
    }
    public void set_exam_first_rating(){
        this.exam_first_rating=new correctInput().correct_number(
                finals.mark_min, finals.mark_max, "Результаты первого экзамена");
    }
    public void set_exam_second_rating(){
        this.exam_second_rating=new correctInput().correct_number(
                finals.mark_min, finals.mark_max, "Результаты второго экзамена");
    }
    public void set_exam_third_rating(){
        this.exam_third_rating=new correctInput().correct_number(
                finals.mark_min, finals.mark_max, "Результаты третьего экзамена");
    }
//---------
    public String get_first_name(){
        return first_name;
    }
    public String get_second_name(){
        return second_name;
    }
    public String get_third_name(){
        return third_name;
    }
    public short get_birth_year(){
        return birth_year;
    }
    public short get_registration_number (){
        return registration_number;
    }
    public byte get_certificate_average_mark(){
        return certificate_average_mark;
    }
    public byte get_exam_first_rating(){
        return exam_first_rating;
    }
    public byte get_exam_second_rating(){
        return exam_second_rating;
    }
    public byte get_exam_third_rating(){
        return exam_third_rating;
    }
//---------
    public void output_to_console(){
        try{
            System.out.println("\n\tАбитуриент №"+ registration_number+"\n\nФИО: "+
                               second_name + " " + first_name+ " " + third_name +
                               "\n" +"\t\t\tСредний балл атестата\t\tПервый экзамен"+
                               "\t\tВторой экзамен\t\tТретий экзамен\n" + "Рэйтинг:\t\t\t" +
                               certificate_average_mark + "\t\t\t\t|\t\t" + exam_first_rating +
                               "\t\t\t|\t\t"+ exam_second_rating+"\t\t\t|\t\t"+exam_third_rating+ "\n");
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
