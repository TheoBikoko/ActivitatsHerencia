package Part1.ex3.classes;

import java.util.HashSet;

public final class Teacher extends Person{
    HashSet<String> subjects;

    public Teacher(String name, String address) {
        super(name, address);
        subjects = new HashSet<>();
        System.out.println("Soc el constructor de la classe Teacher");
    }

    public boolean addSubject(String subject){
        if (!subjects.contains(subject)){
            subjects.add(subject);
            return true;
        }
        else {
            System.out.println("This teacher is already teaching this subject.");
            return false;
        }
    }

    public boolean removeSubject(String subject){
        for (String subj : subjects){
            if (subj.equals(subject)){
                subjects.remove(subj);
                return true;
            }
        }
        return false;
    }
}
