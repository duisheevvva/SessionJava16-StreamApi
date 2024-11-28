package dao.daoImpl;

import dao.GenericDao;
import dao.ProgrammerDao;
import database.Database;
import enums.Language;
import models.Programmer;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProgrammerDaoImpl implements ProgrammerDao, GenericDao<Programmer> {

    @Override
    public void addProgrammer(Programmer programmer) {
        Database.programmers.add(programmer);
    }

    @Override
    public List<Programmer> getAllProgrammers() {
        return Database.programmers;
    }

    @Override
    public List<Programmer> getJavaProgrammers() {
        // stream
        return Database.programmers.stream().
                filter(programmer -> programmer.getLanguage() == Language.JAVA)
                .collect(Collectors.toList());
        // for
//        List<Programmer> javaProgrammer = new ArrayList<>();
//        for (Programmer programmer: Database.programmers) {
//            if (programmer.getLanguage() == Language.JAVA){
//                 javaProgrammer.add(programmer);
//            }
//        }
//
//        return javaProgrammer;
    }

    @Override
    public Programmer getByIdProgrammer(Long id) {
        return Database.programmers.stream()
                .filter(programmer -> programmer.getId() == id)
                .findFirst().get();
    }

    @Override
    public int getCountProgrammers() {
        return (int) Database.programmers.stream().count();
    }

    @Override
    public List<Programmer> sortProgrammerBySalary() {
        return Database.programmers.stream()
                .sorted(Comparator.comparingDouble(Programmer::getSalary))
                .collect(Collectors.toList());
    }

    @Override
    public List<Programmer> skip2Programmer() {
        return Database.programmers.stream().skip(2)
                .toList();
    }

    @Override
    public List<Programmer> getProgrammer() {
        return null;
    }

    @Override
    public Programmer getMaxSalaryProgrammer() {
        Programmer programmer = Database.programmers.stream()
                .max(Comparator.comparingDouble(Programmer::getSalary)).get();
        return programmer;

    }


    @Override
    public void update(Long id, Programmer programmer) {

    }

    @Override
    public void delete(Long id) {

    }
}
