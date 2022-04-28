/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinaVendiing;

/**
 *
 * @author hinda
 */

public class Administrador {
    //atributos
    private String idAdmin;
    private Maquina maquina;
     
    
    //constrector

    public Administrador() {
    }

    public Administrador(String idAdmin, Maquina maquina) {
        this.idAdmin = idAdmin;
        this.maquina = maquina;
         
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
  
    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdmin=" + idAdmin + ", maquina=" + maquina + '}';
    }
    
    
    
    // Metodo que recibe el old codigo y el nuevo para cambiar el codigo de bandeja que queremos
    public void cambiarElCodigoBandeja(int codigOld,int codigoNew){
        if(maquina.getCodigoBandeja1()==codigOld){
           maquina.setCodigoBandeja1(codigoNew);
        }else if(codigOld==maquina.getCodigoBandeja2()){
             maquina.setCodigoBandeja2(codigoNew);
        }else if(codigOld==maquina.getCodigoBandeja3()){
            maquina.setCodigoBandeja3(codigoNew);
        }else if(codigOld==maquina.getCodigoBandeja4()){
              maquina.setCodigoBandeja4(codigoNew);
        }else if(codigOld==maquina.getCodigoBandeja5()){
             maquina.setCodigoBandeja5(codigoNew);
        }else if(codigOld==maquina.getCodigoBandeja6()){
            maquina.setCodigoBandeja6(codigoNew);
        }
        
    }
    
    // Metodo para cambiar los productos de cada bandeja
    public void cambiarProductoBandeja(int bandeja,String producto){
        if(maquina.getCodigoBandeja1()==bandeja){
           maquina.setTipoProductoBandeja1(producto);
        }else if(bandeja==maquina.getCodigoBandeja2()){
             maquina.setTipoProductoBandeja2(producto);
        }else if(bandeja==maquina.getCodigoBandeja3()){
            maquina.setTipoProductoBandeja3(producto);
        }else if(bandeja==maquina.getCodigoBandeja4()){
              maquina.setTipoProductoBandeja4(producto);
        }else if(bandeja==maquina.getCodigoBandeja5()){
             maquina.setTipoProductoBandeja5(producto);
        }else if(bandeja==maquina.getCodigoBandeja6()){
            maquina.setTipoProductoBandeja6(producto);
        }
        
    }
    
    // Metodo para cambiar el stock de cada bandeja
    public void cambiarStockBandeja(int bandeja,int stock){
        if(maquina.getCodigoBandeja1()==bandeja){
           maquina.setCantidadBandeja1(stock);
        }else if(bandeja==maquina.getCodigoBandeja2()){
             maquina.setCantidadBandeja2(stock);
        }else if(bandeja==maquina.getCodigoBandeja3()){
            maquina.setCantidadBandeja3(stock);
        }else if(bandeja==maquina.getCodigoBandeja4()){
              maquina.setCantidadBandeja4(stock);
        }else if(bandeja==maquina.getCodigoBandeja5()){
             maquina.setCodigoBandeja5(stock);
        }else if(bandeja==maquina.getCodigoBandeja6()){
            maquina.setCodigoBandeja6(stock);
        }
        
    }
    
    
}
