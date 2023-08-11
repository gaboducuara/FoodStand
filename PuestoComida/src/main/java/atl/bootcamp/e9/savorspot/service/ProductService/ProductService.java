package atl.bootcamp.e9.savorspot.service.ProductService;

import atl.bootcamp.e9.savorspot.model.ProductoModel;
import atl.bootcamp.e9.savorspot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productoRepository;

    public ArrayList<ProductoModel> getProduct(){
        return (ArrayList<ProductoModel>)productoRepository.findAll();
    }

    public Optional <ProductoModel> getById(Long id){
        return productoRepository.findById(id) ;
    }

    public ProductoModel CreateProduct (ProductoModel productoModel) {
        return productoRepository.save(productoModel);
    }
    @Transactional
    public ProductoModel UpdateProduct (ProductoModel productoModel ){
        if(!productoRepository.existsById(productoModel.getId())){
            throw new RuntimeException("NO SE PUDO ACTUALIZAR EL PRODUCTO" + (productoModel.getId()));
        }
        return productoRepository.save(productoModel );
    }
    public ProductoModel delete (Long id) {
        if (!productoRepository.existsById(id)) {
            throw new RuntimeException("NO SE PUDO ELIMINAR EL PRODUCTO" + (id));
        }
        productoRepository.deleteById(id);
        return null;
    }
}