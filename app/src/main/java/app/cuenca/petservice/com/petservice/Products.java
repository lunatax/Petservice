package app.cuenca.petservice.com.petservice;

import java.util.ArrayList;

/**
 * Created by carlosluna on 28/8/17.
 */

public class Products {
    public static ArrayList<Object> listaPerro = new ArrayList<Object>();
    //public static ArrayList<Object> listaPerro = new ArrayList<Object>();
    //public static ArrayList<Object> listaGato = new ArrayList<Object>();


    public static void cargar(){
        //################# PERROS
        //vacunas
        listaPerro.add(new ItemFull ("per_vac_puppy",   "PERRO", "VACUNA", "puppy",   "description", 15, 1, 15));
        listaPerro.add(new ItemFull ("per_vac_canigen", "PERRO", "VACUNA", "canigen", "description", 16, 1, 16));
        listaPerro.add(new ItemFull ("per_vac_traque",  "PERRO", "VACUNA", "traque",  "description", 17, 1, 17));
        listaPerro.add(new ItemFull ("per_vac_felingen","PERRO", "VACUNA", "felingen","description", 18, 1, 18));
        listaPerro.add(new ItemFull ("per_vac_rabia",   "PERRO", "VACUNA", "rabia",   "description", 19, 1, 19));

        //desparacitacion
        listaPerro.add(new ItemFull ("per_des_h5",  "PERRO", "DESPARACITACION", "hasta5",  "description", 15, 1, 15));
        listaPerro.add(new ItemFull ("per_des_h10", "PERRO", "DESPARACITACION", "hasta10", "description", 16, 1, 16));
        listaPerro.add(new ItemFull ("per_des_h15", "PERRO", "DESPARACITACION", "hasta15", "description", 17, 1, 17));
        listaPerro.add(new ItemFull ("per_des_h20", "PERRO", "DESPARACITACION", "hasta20", "description", 18, 1, 18));
        listaPerro.add(new ItemFull ("per_des_h25", "PERRO", "DESPARACITACION", "hasta25", "description", 19, 1, 19));
        listaPerro.add(new ItemFull ("per_des_h30", "PERRO", "DESPARACITACION", "hasta30", "description", 18, 1, 18));
        listaPerro.add(new ItemFull ("per_des_m30", "PERRO", "DESPARACITACION", "mas30",   "description", 19, 1, 19));

        //antipulgas
        listaPerro.add(new ItemFull ("per_ant_m1_h10", "PERRO", "ANTIPULGAS", "meses1", "hasta10","description", 15, 1, 15));
        listaPerro.add(new ItemFull ("per_ant_m1_h20", "PERRO", "ANTIPULGAS", "meses1", "hasta20","description", 16, 1, 16));
        listaPerro.add(new ItemFull ("per_ant_m1_h30", "PERRO", "ANTIPULGAS", "meses1", "hasta30","description", 17, 1, 17));
        listaPerro.add(new ItemFull ("per_ant_m1_m30", "PERRO", "ANTIPULGAS", "meses1", "mas30",  "description", 18, 1, 18));

        listaPerro.add(new ItemFull ("per_ant_m2_h10", "PERRO", "ANTIPULGAS", "meses3", "hasta10","description", 19, 1, 19));
        listaPerro.add(new ItemFull ("per_ant_m2_h20", "PERRO", "ANTIPULGAS", "meses3", "hasta20","description", 18, 1, 18));
        listaPerro.add(new ItemFull ("per_ant_m2_m30", "PERRO", "ANTIPULGAS", "meses3", "hasta30","description", 19, 1, 19));
        listaPerro.add(new ItemFull ("per_ant_m2_m30", "PERRO", "ANTIPULGAS", "meses3", "mas10",  "description", 16, 1, 16));

        //aseo
        listaPerro.add(new ItemFull ("per_ase_h5",  "PERRO", "ASEO", "hasta5",  "description", 15, 1, 15));
        listaPerro.add(new ItemFull ("per_ase_h10", "PERRO", "ASEO", "hasta10", "description", 16, 1, 16));
        listaPerro.add(new ItemFull ("per_ase_h15", "PERRO", "ASEO", "hasta15", "description", 17, 1, 17));
        listaPerro.add(new ItemFull ("per_ase_h20", "PERRO", "ASEO", "hasta20", "description", 18, 1, 18));
        listaPerro.add(new ItemFull ("per_ase_h25", "PERRO", "ASEO", "hasta25", "description", 19, 1, 19));
        listaPerro.add(new ItemFull ("per_ase_h30", "PERRO", "ASEO", "hasta30", "description", 18, 1, 18));
        listaPerro.add(new ItemFull ("per_ase_m30", "PERRO", "ASEO", "mas30",   "description", 19, 1, 19));

        //consulta
        listaPerro.add(new ItemFull ("per_con_0", "PERRO", "CONSULTA", "cons_tit", "description", 19, 1, 19));
        //################# GATOS
        //vacunas
        listaPerro.add(new ItemFull ("gat_vac_puppy",   "GATO", "VACUNA", "puppy",   "description", 15, 1, 15));
        listaPerro.add(new ItemFull ("gat_vac_canigen", "GATO", "VACUNA", "canigen", "description", 16, 1, 16));
        listaPerro.add(new ItemFull ("gat_vac_traque",  "GATO", "VACUNA", "traque",  "description", 17, 1, 17));
        listaPerro.add(new ItemFull ("gat_vac_felingen","GATO", "VACUNA", "felingen","description", 18, 1, 18));
        listaPerro.add(new ItemFull ("gat_vac_rabia",   "GATO", "VACUNA", "rabia",   "description", 19, 1, 19));

        //desparacitacion
        listaPerro.add(new ItemFull ("gat_des_h5",  "GATO", "DESPARACITACION", "hasta5",  "description", 15, 1, 15));
        listaPerro.add(new ItemFull ("gat_des_h10", "GATO", "DESPARACITACION", "hasta10", "description", 16, 1, 16));
        listaPerro.add(new ItemFull ("gat_des_h15", "GATO", "DESPARACITACION", "hasta15", "description", 17, 1, 17));
        listaPerro.add(new ItemFull ("gat_des_h20", "GATO", "DESPARACITACION", "hasta20", "description", 18, 1, 18));
        listaPerro.add(new ItemFull ("gat_des_h25", "GATO", "DESPARACITACION", "hasta25", "description", 19, 1, 19));
        listaPerro.add(new ItemFull ("gat_des_h30", "GATO", "DESPARACITACION", "hasta30", "description", 18, 1, 18));
        listaPerro.add(new ItemFull ("gat_des_m30", "GATO", "DESPARACITACION", "mas30",   "description", 19, 1, 19));

        //antipulgas
        listaPerro.add(new ItemFull ("gat_ant_m1_h10", "GATO", "ANTIPULGAS", "meses1", "hasta10","description", 15, 1, 15));
        listaPerro.add(new ItemFull ("gat_ant_m1_h20", "GATO", "ANTIPULGAS", "meses1", "hasta20","description", 16, 1, 16));
        listaPerro.add(new ItemFull ("gat_ant_m1_h30", "GATO", "ANTIPULGAS", "meses1", "hasta30","description", 17, 1, 17));
        listaPerro.add(new ItemFull ("gat_ant_m1_m30", "GATO", "ANTIPULGAS", "meses1", "mas30",  "description", 18, 1, 18));

        listaPerro.add(new ItemFull ("gat_ant_m2_h10", "GATO", "ANTIPULGAS", "meses3", "hasta10","description", 19, 1, 19));
        listaPerro.add(new ItemFull ("gat_ant_m2_h20", "GATO", "ANTIPULGAS", "meses3", "hasta20","description", 18, 1, 18));
        listaPerro.add(new ItemFull ("gat_ant_m2_m30", "GATO", "ANTIPULGAS", "meses3", "hasta30","description", 19, 1, 19));
        listaPerro.add(new ItemFull ("gat_ant_m2_m30", "GATO", "ANTIPULGAS", "meses3", "mas10",  "description", 16, 1, 16));

        //aseo
        listaPerro.add(new ItemFull ("gat_ase_h5",  "GATO", "ASEO", "hasta5",  "description", 15, 1, 15));
        listaPerro.add(new ItemFull ("gat_ase_h10", "GATO", "ASEO", "hasta10", "description", 16, 1, 16));
        listaPerro.add(new ItemFull ("gat_ase_h15", "GATO", "ASEO", "hasta15", "description", 17, 1, 17));
        listaPerro.add(new ItemFull ("gat_ase_h20", "GATO", "ASEO", "hasta20", "description", 18, 1, 18));
        listaPerro.add(new ItemFull ("gat_ase_h25", "GATO", "ASEO", "hasta25", "description", 19, 1, 19));
        listaPerro.add(new ItemFull ("gat_ase_h30", "GATO", "ASEO", "hasta30", "description", 18, 1, 18));
        listaPerro.add(new ItemFull ("gat_ase_m30", "GATO", "ASEO", "mas30",   "description", 19, 1, 19));

        //consulta
        listaPerro.add(new ItemFull ("gat_con_0", "PERRO", "CONSULTA", "cons_tit", "description", 19, 1, 19));
    }




}
