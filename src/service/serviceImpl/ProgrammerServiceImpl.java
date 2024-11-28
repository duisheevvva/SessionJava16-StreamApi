package service.serviceImpl;

import dao.ProgrammerDao;
import dao.daoImpl.ProgrammerDaoImpl;
import models.Programmer;
import service.ProgrammerService;

import java.util.List;

public class ProgrammerServiceImpl implements ProgrammerService {
    private ProgrammerDao  programmerDao = new ProgrammerDaoImpl();
    @Override
    public void addProgrammer(Programmer programmer) {
        programmerDao.addProgrammer(programmer);
    }

    @Override
    public List<Programmer> getAllProgrammers() {
        return programmerDao.getAllProgrammers();
    }

    @Override
    public Programmer getByIdProgrammer(Long id) {
        return programmerDao.getByIdProgrammer(id);
    }

    @Override
    public List<Programmer> getJavaProgrammers() {
        return programmerDao.getJavaProgrammers();
    }

    @Override
    public int getCountProgrammers() {
        return programmerDao.getCountProgrammers();
    }

    @Override
    public List<Programmer> sortProgrammerBySalary() {
        return programmerDao.sortProgrammerBySalary();
    }

    @Override
    public List<Programmer> skip2Programmer() {
        return programmerDao.skip2Programmer();
    }

    @Override
    public List<Programmer> getProgrammer() {
        return null;
    }

    @Override
    public Programmer getMaxSalaryProgrammer() {
        return programmerDao.getMaxSalaryProgrammer();
    }
}
