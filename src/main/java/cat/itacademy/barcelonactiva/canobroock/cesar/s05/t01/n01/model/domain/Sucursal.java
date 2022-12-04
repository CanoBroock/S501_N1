package cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.domain;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "sucursales")
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk_SucursalID;

    @Column(name = "nombre_sucursal")
    private String nomSucursal;

    @Column(name = "pais_sucursal")
    private String paisSucursal;

}
