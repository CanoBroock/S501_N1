package cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.services;

import cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.domain.Sucursal;

import java.util.List;

public interface SucursalService {
    List<Sucursal> getAllSucursales();
    void saveSucursal(Sucursal sucursal);
    Sucursal getSucursalById(long id);
    void deleteSucursalById(long id);
}
