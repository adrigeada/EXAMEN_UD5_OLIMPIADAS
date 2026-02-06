package org.example.Olimpiadas;

import java.util.ArrayList;

public class Equipo {

    private String pais;
    private ArrayList<Deportista> listaDeportistas;



    public Equipo (String pais){
        this.pais = pais;
        listaDeportistas = new ArrayList<>();
    }

    public Equipo(){

    }

    public void inscribirDeportista(Deportista deportista){
        listaDeportistas.add(deportista);
        deportista.setEquipo(this);
    }

    public void borrarDeportista(Deportista deportista){
        listaDeportistas.remove(deportista);
    }

    public int medallasTotales(){
        int contadorMedallas = 0;
        for (Deportista deportista : listaDeportistas){
            contadorMedallas += deportista.getMedallas();
        }
        return contadorMedallas;
    }

    public void verMedallero(){
        System.out.println("Los deportistas que han ganado medallas y cuantas han ganado.");
        for (Deportista deportista : listaDeportistas){
            if (deportista.getMedallas()>0){
                System.out.println("El deportista "+ deportista.getNombre()+" ha ganado "+deportista.getMedallas()+" medallas");
            }
        }

    }

    public Deportista deportistaTop(){
        Deportista masMedallas = new Deportista();

        for (Deportista deportista : listaDeportistas){
            if (deportista.getMedallas() > masMedallas.getMedallas()){
                masMedallas = deportista;
            }
        }

        return masMedallas;

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Deportista> getListaDeportistas() {
        return listaDeportistas;
    }

    public void setListaDeportistas(ArrayList<Deportista> listaDeportistas) {
        this.listaDeportistas = listaDeportistas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ", listaDeportistas=" + listaDeportistas +
                '}';
    }
}
