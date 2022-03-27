package edu.eci.cvds.samples.services;

public class ExcepcionServiciosAlquiler extends Exception {

    public static final String NO_CLIENT_REGISTRED = "El cliente que se esta buscando no se encuentra registrado";

    public static final String DIAS_NO_VALIDOS= "El valor de días ingresados debe ser mayor o igual a cero";

    public static final  String TARIFA_NO_VALIDA = "La tarifa debe ser mayor o igual a cero.";

    public static final String TIPO_ITEM_INVALIDO = "No se encontro un item con ese id .";
    public static final String NO_ITEM_ALQUILER = "No se encuentra en alquiler";

    public ExcepcionServiciosAlquiler (String message){
        super(message);
    }

    public  ExcepcionServiciosAlquiler(String message, Exception e){
        super(message, e);
    }

}
