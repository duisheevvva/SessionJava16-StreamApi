package dao;

import models.Programmer;

import java.util.List;

public interface ProgrammerDao {

    void addProgrammer(Programmer programmer);
    List<Programmer> getAllProgrammers();
    List<Programmer> getJavaProgrammers();
    Programmer getByIdProgrammer(Long id);

    int getCountProgrammers();
    List<Programmer> sortProgrammerBySalary();
    List<Programmer> skip2Programmer();
    List<Programmer> getProgrammer();
    Programmer getMaxSalaryProgrammer();

}
