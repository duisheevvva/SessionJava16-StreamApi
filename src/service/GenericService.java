package service;

public interface GenericService <T>{
    void update(Long id ,T t);
    void delete(Long id);
}
