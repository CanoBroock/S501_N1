package cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.DTO;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class SucursalDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<String> paisesUE = new ArrayList<>(Arrays.asList("Alemania", "Belgica", "Croacia", "España", "Francia", "Irlanda",
            "Letonia", "Luxemburgo", "Paises Bajos", "Suecia", "Bulgaria", "Eslovaquia", "Estonia", "Grecia", "Malta",
            "Polonia", "Republica Checa", "Austria", "Chipre", "Eslovenia", "Finlandia", "Hungria", "Italia",
            "Lituania", "Portugal", "Rumania"));

    private int pk_SucursalID;
    private String nomSucursal;
    private String paisSucursal;
    private String tipoSucursal;

    public SucursalDTO(int pk_SucursalID, String nomSucursal, String paisSucursal, String tipoSucursal) {
        this.pk_SucursalID = pk_SucursalID;
        this.nomSucursal = nomSucursal;
        this.paisSucursal = paisSucursal;
        this.tipoSucursal = tipoSucursal(paisSucursal);
    }

    public String tipoSucursal(String paisSucursal) {
        boolean controlador = false;
        int i = 0;

        while (i < paisesUE.size() && controlador == false) {
            if (paisSucursal.equalsIgnoreCase(paisesUE.get(i))) {
                tipoSucursal = "Dentro de la UE";
                controlador = true;
            }
            i++;
        }
        if (controlador == false) {
            tipoSucursal = "Fuera de la UE";
        }
        return tipoSucursal;
    }

}
