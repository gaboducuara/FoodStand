package atl.bootcamp.e9.savorspot.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String image; // Variable para almacenar la imagen como un arreglo de bytes
    private String food_drink;
    private String description;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_food_stand")
    private FoodStall food_stand;
}
