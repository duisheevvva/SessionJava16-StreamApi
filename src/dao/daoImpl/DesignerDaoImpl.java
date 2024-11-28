package dao.daoImpl;

import dao.DesignerDao;
import dao.GenericDao;
import database.Database;
import models.Designer;

import javax.xml.crypto.Data;

public class DesignerDaoImpl implements DesignerDao, GenericDao<Designer> {
    @Override
    public void addDesigner(Designer designer) {
        Database.designers.add(designer);
    }

    @Override
    public void update(Long id, Designer designer) {
        Designer designer1 = Database.designers.stream().filter(d -> d.getId() == id).findFirst().get();
        designer1.setName(designer.getName());
        designer1.setCountry(designer.getCountry());
    }

    @Override
    public void delete(Long id) {
        Designer designer1 = Database.designers.stream().filter(d -> d.getId() == id).findFirst().get();
        Database.designers.remove(designer1);

    }
}
