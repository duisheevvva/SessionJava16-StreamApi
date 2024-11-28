package dao;

public interface GenericDao <T>{
     void update(Long id ,T t);
     void delete(Long id);
}
