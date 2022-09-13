package Inheritance;

public class SchoolUniversity {
    public static void main(String[] args) {
        School school = new School("Kendriya vidyalaya", 900);
        University university = new University("TilkaManjhi University", 1000, true);

        System.out.println(school.getName() + " " + school.getNumStudents());

        System.out.println(university.getName() + " " + university.getNumStudents() + " " + university.getIsPublic());
    }
}

class School {
    private String name;
    private int numStudents;

    public School(String name, int numStudents) {
        this.name = name;
        this.numStudents = numStudents;
    }

    public String getName() {
        return this.name;
    }

    public int getNumStudents() {
        return this.numStudents;
    }
}


class University extends School {
    private final String type = "University";
    private boolean isPublic;

    public University(String name, int numStudents, boolean isPublic) {
        super(name, numStudents);
        this.isPublic = isPublic;
    }

    public boolean getIsPublic() {
        return this.isPublic;
    }
}
