package com.daicent.main;

import com.daicent.model.*;
import com.daicent.model.Class;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Class, Set<Student>> classSetMap = new HashMap<>();

        Map<Grade, Set<Class>> gradeSetMap = new HashMap<>();

        Map<School, Set<Grade>> schoolSetMap = new HashMap<>();

        Map<School, List<Student>> setMap = new HashMap<School, List<Student>>();

        Map<Grade, List<Student>>listMap=new HashMap<>();

        List<Grade>grades=new ArrayList<>();

        List<School> schools = new ArrayList<>();

        List<Subject> subjects = new ArrayList<>();

        List<Student> students = new ArrayList<>();

        Student student1 = new Student(1, "Trần Văn Hưng", 3);
        Student student2 = new Student(2, "Trần Văn Hoa", 6);
        Student student3 = new Student(3, "Trần Văn Béo", 8);
        Student student4 = new Student(4, "Trần Văn Ham", 7);
        Student student5 = new Student(5, "Trần Văn Ha", 9);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        School school1 = new School(1, "Daicent");
        School school2 = new School(3, "Usol");

        Grade grade1=new Grade(1,"khối A");
        Grade grade2=new Grade(2,"khối B");

        grades.add(grade1);
        grades.add(grade2);


        List<Student>students1= Arrays.asList(student3,student1);// tạo đối tượng value

        listMap.put(grade1,students1);//put value vào grade
        System.out.println(listMap);

        schools.add(school1);
        schools.add(school2);
        setMap.put(school1, students);
        System.out.println(setMap.values());// số học sinh của trường;

        ComparatorPoint comparatorPoint = new ComparatorPoint();
        Collections.sort(students, comparatorPoint);
        for (Student sd : students) {
            System.out.println(sd.toString());
        }

        System.out.println( "người giỏi nhất trường " + students.get(0));

// điểm trung bình toàn trường
        double sumSchool = 0;
        double avgSchool = 0;
        for (Map.Entry<School,List<Student>>listEntry:setMap.entrySet()
        ) {
            for (Student st :listEntry.getValue()
                 ) {
                sumSchool +=st.getPoint();
                avgSchool = sumSchool/listEntry.getValue().size();

            }
            System.out.println("điểm trung bình toàn trường " + avgSchool);
        }

    // điểm trung bình khối
        double sumGrade=0;
        double avgGrade=0;
       for (Map.Entry<Grade,List<Student>> entry: listMap.entrySet()){
           for (Student st: entry.getValue()
                ) {
               sumGrade +=st.getPoint();
               avgGrade = sumGrade/entry.getValue().size();
           }

       }
        System.out.println(" điểm trung bình khối " + avgGrade);
    }
}
