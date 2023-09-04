/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canal.de.yutube;

/**
 *
 * @author vina
 */
public class canal {
    private int subcristores,vi_subidos,mg_canal,nomg_canal,comen_canal;
    private String nombre_canal,des_canal;

    public canal() {
    }

    public canal(int subcristores, int vi_subidos, int mg_canal, int nomg_canal, int comen_canal, String nombre_canal, String des_canal) {
        this.subcristores = subcristores;
        this.vi_subidos = vi_subidos;
        this.mg_canal = mg_canal;
        this.nomg_canal = nomg_canal;
        this.comen_canal = comen_canal;
        this.nombre_canal = nombre_canal;
        this.des_canal = des_canal;
    }

    public int getSubcristores() {
        return subcristores;
    }

    public void setSubcristores(int subcristores) {
        this.subcristores = subcristores;
    }

    public int getVi_subidos() {
        return vi_subidos;
    }

    public void setVi_subidos(int vi_subidos) {
        this.vi_subidos = vi_subidos;
    }

    public int getMg_canal() {
        return mg_canal;
    }

    public void setMg_canal(int mg_canal) {
        this.mg_canal = mg_canal;
    }

    public int getNomg_canal() {
        return nomg_canal;
    }

    public void setNomg_canal(int nomg_canal) {
        this.nomg_canal = nomg_canal;
    }

    public int getComen_canal() {
        return comen_canal;
    }

    public void setComen_canal(int comen_canal) {
        this.comen_canal = comen_canal;
    }

    public String getNombre_canal() {
        return nombre_canal;
    }

    public void setNombre_canal(String nombre_canal) {
        this.nombre_canal = nombre_canal;
    }

    public String getDes_canal() {
        return des_canal;
    }

    public void setDes_canal(String des_canal) {
        this.des_canal = des_canal;
    }
    
    
    
}
