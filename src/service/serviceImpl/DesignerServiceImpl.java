package service.serviceImpl;

import dao.DesignerDao;
import dao.GenericDao;
import dao.daoImpl.DesignerDaoImpl;
import models.Designer;
import service.DesignerService;
import service.GenericService;

public class DesignerServiceImpl implements DesignerService, GenericService<Designer> {
    DesignerDao designerDao = new DesignerDaoImpl();
    GenericDao genericDao = new DesignerDaoImpl();
    @Override
    public void addDesigner(Designer designer) {
        designerDao.addDesigner(designer);
    }

    @Override
    public void update(Long id, Designer designer) {
        genericDao.update(id,designer);
    }

    @Override
    public void delete(Long id) {
        genericDao.delete(id);
    }
}
