/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConverterGUI;
/**
 *
 * @author MrSavage
 */
public class GSConverter {

    private float segundos;
    private float minutos;
    private float horas;
    private float dias;
    private float semanas;
    private float meses;
    private float años;
    private double producto;
        
    public void setSeconds(float segundos){
            this.segundos = segundos;
                    }
    public float getSeconds(){
        return segundos;
    }
    public void setMinutes(float minutos){
        this.minutos = minutos;
    }
    public float getMinutes(){
        return minutos;
    }
    public void setHours(float horas){
            this.horas = horas;
    }
    public float getHours(){
        return horas;
    }
    public void setDays(float dias){
            this.dias = dias;
    }
    public float getDays(){
        return dias;
    }
    public void setWeeks(float semanas){
            this.semanas = semanas;
    }
    public float getWeeks(){
        return semanas;
    }
    public void setMonths(float meses){
            this.meses = meses;
    }
    public float getMonths(){
        return meses;
    }
    public void setYears(float años){
            this.años = años;
    }
    public float getYears(){
        return años;
    }
    public double getProducto()
    {
        return producto;
    }
    public void setProducto(double producto)
    {
        this.producto = producto;
    }
}
