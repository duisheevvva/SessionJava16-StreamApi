import database.Database;
import enums.Language;
import models.Designer;
import models.Programmer;
import service.DesignerService;
import service.GenericService;
import service.ProgrammerService;
import service.serviceImpl.DesignerServiceImpl;
import service.serviceImpl.ProgrammerServiceImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProgrammerService programmerService = new ProgrammerServiceImpl();
        programmerService.addProgrammer(new Programmer(1L,"Azmar",2000000, Language.JAVA));
        programmerService.addProgrammer(new Programmer(2L,"Sanjar",20000000, Language.JS));
        programmerService.addProgrammer(new Programmer(3L,"Mirlan baike",500000, Language.JAVA));
        programmerService.addProgrammer(new Programmer(4L,"Rahmankul",4500000, Language.JS));
        programmerService.addProgrammer(new Programmer(5L,"Elaman",300000, Language.PYTHON));
        programmerService.addProgrammer(new Programmer(6L,"Gulnur eje",550000, Language.PHP));
        programmerService.addProgrammer(new Programmer(7L,"Fatima",320000, Language.JAVA));
        programmerService.addProgrammer(new Programmer(8L,"Nursultan",1200000, Language.PHP));
        programmerService.addProgrammer(new Programmer(9L,"Jyrgalbek",350000, Language.JAVA));
        programmerService.addProgrammer(new Programmer(10L,"Mamyrgul",450000, Language.PYTHON));
        programmerService.addProgrammer(new Programmer(11L,"Adilet",150000, Language.JS));


        DesignerService designerService = new DesignerServiceImpl();
        GenericService genericService = new DesignerServiceImpl();
        designerService.addDesigner(new Designer(1L,"Test1","KG"));
        designerService.addDesigner(new Designer(2L,"Test2","KG"));
        designerService.addDesigner(new Designer(3L,"Test3","KG"));
        designerService.addDesigner(new Designer(4L,"Test4","KG"));

        System.out.println(Database.designers);

        System.out.println("Update designer: ");
        genericService.update(2L,new Designer(2L,"NewName","newCountry"));
        System.out.println(Database.designers);

        genericService.delete(2L);
        System.out.println(Database.designers);




//        System.out.println("All programmers:  ");
//        System.out.println(programmerService.getAllProgrammers());
//
//
//        System.out.println("Get JAVA programmers: ");
//        System.out.println(programmerService.getJavaProgrammers());
//
//
//        System.out.println("Get count programmers: ");
//        System.out.println(programmerService.getCountProgrammers());
//
//        System.out.println("Sort Programmer by Salary");
//        System.out.println(programmerService.sortProgrammerBySalary());
//
//        System.out.println("Skip 2 programmers: ");
//        System.out.println(programmerService.skip2Programmer());
//
//        System.out.println("Get max Salary: ");
//        System.out.println(programmerService.getMaxSalaryProgrammer());
//
//        System.out.println("Get by id Programmer: ");
//        System.out.println(programmerService.getByIdProgrammer(9L));


    }
}