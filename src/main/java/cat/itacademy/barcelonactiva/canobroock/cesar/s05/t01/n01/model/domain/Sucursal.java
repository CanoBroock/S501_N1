package cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.domain;

import jakarta.persistence.*;

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

    public long getPk_SucursalID() {
        return pk_SucursalID;
    }
    public void setPk_SucursalID(long pk_SucursalID) {
        this.pk_SucursalID = pk_SucursalID;
    }
    public String getNomSucursal() {
        return nomSucursal;
    }
    public void setNomSucursal(String nomSucursal) {
        this.nomSucursal = nomSucursal;
    }
    public String getPaisSucursal() {
        return paisSucursal;
    }
    public void setPaisSucursal(String paisSucursal) {
        this.paisSucursal = paisSucursal;
    }
}
