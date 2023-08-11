package atl.bootcamp.e9.savorspot.repository;

import atl.bootcamp.e9.savorspot.model.ProductoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository <ProductoModel ,  Long> {
}
