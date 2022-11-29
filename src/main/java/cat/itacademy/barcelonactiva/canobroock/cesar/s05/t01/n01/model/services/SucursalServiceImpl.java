package cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.services;

import cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SucursalServiceImpl implements SucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    @Override
    public List<Sucursal> getAllSucursales() {
        return sucursalRepository.findAll();
    }

    @Override
    public void saveSucursal(Sucursal sucursal) {
        this.sucursalRepository.save(sucursal);
    }

    @Override
    public Sucursal getSucursalById(long id) {
        Optional<Sucursal> optional = sucursalRepository.findById(id);
        Sucursal sucursal = null;
        if (optional.isPresent()) {
            sucursal = optional.get();
        } else {
            throw new RuntimeException(" Sucursal not found for id :: " + id);
        }
        return sucursal;
    }

    @Override
    public void deleteSucursalById(long id) {
        this.sucursalRepository.deleteById(id);
    }
}
