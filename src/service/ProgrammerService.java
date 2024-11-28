package service;

import models.Programmer;

import java.util.List;

public interface ProgrammerService {
    void addProgrammer(Programmer programmer);
    List<Programmer> getAllProgrammers();
    Programmer getByIdProgrammer(Long id);
    List<Programmer> getJavaProgrammers();
    int getCountProgrammers();
    List<Programmer> sortProgrammerBySalary();
    List<Programmer> skip2Programmer();
    List<Programmer> getProgrammer();
    Programmer getMaxSalaryProgrammer();

}
