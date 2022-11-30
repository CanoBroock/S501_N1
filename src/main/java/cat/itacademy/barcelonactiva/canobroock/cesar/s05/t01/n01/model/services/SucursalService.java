package cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.services;

import cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.DTO.SucursalDTO;
import cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.domain.Sucursal;

import java.util.List;

public interface SucursalService {
    public List<SucursalDTO> getAllSucursales();
    public void saveSucursal(Sucursal sucursal);
    public Sucursal getSucursalById(long id);
    public void deleteSucursalById(long id);
}
