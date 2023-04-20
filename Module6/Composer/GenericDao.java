package SK_CIS_505.Module6.Composer;

import java.util.List;

public interface GenericDao<E, K> {

    List<E> findAll();

    E findBy(K key);

    void insert(E entity);


    
}
