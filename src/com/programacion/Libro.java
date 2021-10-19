package com.programacion;

public class Libro {

//atributos: título, autor, ano, numero de páginas e valoración

    //titulo
    private String titulo;

    //autor
    private String autor;

    //ano
    private int ano;

    //numPaginas
    private short numPaginas;

    //valoracion
    private float valoracion;

    //ahora realizamos los constructores

    //primero el constructor por defecto
    public Libro(){

    }

    //constructor parametrizado
    public Libro (String titulo, String autor, int ano, short numPaginas, float valoracion){
        titulo= titulo;
        autor= autor;
        ano= ano;
        numPaginas= numPaginas;
        valoracion= valoracion;
    }

    //metodos de acceso---> getters y setters

    public void setTitulo (String titulo){
        titulo= titulo;
    }

    public String getTitulo (){
        return titulo;
    }

    public void setAutor (String autor){
        autor= autor;
    }

    public String getAutor(){
        return autor;
    }

    public void setAno (int ano){
        ano= ano;
    }

    public int getAno(){
        return ano;
    }

    public void setNumPaginas (short numPaginas){
        numPaginas= numPaginas;
    }

    public int NumPaginas(){
        return numPaginas;
    }

    public void setValoracion(float valoracion){
        valoracion= valoracion;
    }

    public double valoracion(){
        return valoracion;
    }

    // método amosar que non devolve nada e visualiza todas as características do libro

    public void caracteristicasDelLibro(String titulo, String autor, int ano, short numPaginas, float valoracion){


        System.out.println(" las características del libro son: "+titulo, autor, ano, numPaginas, valoracion);

    }






















































}
