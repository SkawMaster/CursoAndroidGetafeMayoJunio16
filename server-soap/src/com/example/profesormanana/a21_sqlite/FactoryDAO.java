package com.example.profesormanana.a21_sqlite;


/**
 * Created by profesormanana on 21/6/16.
 */
public class FactoryDAO {
    private static IPeliculasDAO peliculasDAO;


    public static IPeliculasDAO getInstancePeliculasDAO(){
        if(peliculasDAO == null){
            peliculasDAO = new PeliculasMemoryDAO();
        }
        return peliculasDAO;
    }
    
}
