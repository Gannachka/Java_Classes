package main.java;

public class Student {

    private  int id;
    private final String name;
    private final String surname;
    private final String patronymic;
    private final String birthday;
    private final String address;
    private final String phoneNumber;
    private final String faculty;
    private final int course;
    private final int group;

    public Student(){
        this.id=0;
        this.name="";
        this.surname="";
        this.patronymic="";
        this.birthday="";
        this.address="";
        this.phoneNumber="";
        this.faculty="";
        this.course=0;
        this.group=0;
    }

    public Student(int id){
        this.id=id;
        this.name="";
        this.surname="";
        this.patronymic="";
        this.birthday="";
        this.address="";
        this.phoneNumber="";
        this.faculty="";
        this.course=0;
        this.group=0;
    }
    public Student(int id,String name, String surname, String patronymic, String birthday, String address, String phoneNumber,String faculty,int course,int group){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.patronymic=patronymic;
        this.birthday=birthday;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.faculty=faculty;
        this.course=course;
        this.group=group;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }
    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public int hashCode() {
        return id + name.length() + surname.length() + patronymic.length()  + address.length()+ phoneNumber.length()+ faculty.length()+
                course+group;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student stud = (Student) obj;
            return  id == stud.id &&
                    surname.equals(stud.surname) &&
                    name.equals(stud.name) &&
                    patronymic.equals(stud.patronymic) &&
                    birthday.equals(stud.birthday)&&
                    address.equals(stud.address) &&
                    phoneNumber.equals(stud.phoneNumber)&&
                    faculty.equals(stud.phoneNumber)&&
                    course== stud.course&&
                    group== stud.group
                    ;

        }
        return false;
    }

    @Override
    public String toString() {
        return "Student name: "+name+" "+surname+" "+patronymic+"\nBirthday: "+ birthday+
                "\nFaculty "+faculty+" Course "+course+" Group "+group;
    }
}
