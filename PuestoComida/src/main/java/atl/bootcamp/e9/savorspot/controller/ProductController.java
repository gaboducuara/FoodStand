package atl.bootcamp.e9.savorspot.controller;

import atl.bootcamp.e9.savorspot.model.ProductoModel;
import atl.bootcamp.e9.savorspot.service.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ArrayList<ProductoModel> getProduct(){
        return productService.getProduct();
    }
    @GetMapping("{id}")
    public java.util.Optional <ProductoModel> getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @PostMapping
    public ProductoModel CreateProduct (@RequestBody ProductoModel productoModel) {
        return productService.CreateProduct(productoModel);
    }

//    @PutMapping
    @PutMapping("{id}")
    public ProductoModel UpdateProduct (@RequestBody ProductoModel productoModel ){
    return productService.UpdateProduct(productoModel);
    }
    @DeleteMapping("{id}")
    public ProductoModel DeleteProduct (@RequestBody Long id ){
        return productService.delete(id);

    }
}
