/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.control.marca;

import com.LocaZilla.DAO.marca.IMarcaDAO;
import com.LocaZilla.DAO.marca.MarcaDAO;
import com.LocaZilla.model.marca.Marca;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pedro
 */
public class MarcaControle implements IMarcaControle {
     IMarcaDAO marcaPersistencia = null;
    public MarcaControle(){
        this.marcaPersistencia = new MarcaDAO();
    }
    
    private boolean buscarMarca(String descricao)throws Exception{
        try {
            ArrayList<Marca> listagem = marcaPersistencia.listagem();
            Iterator<Marca> lista = listagem.iterator();
            while(lista.hasNext()){
                 Marca aux = lista.next();
                if(aux.getDescricao().equalsIgnoreCase(descricao)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    private boolean buscarLogo(String url) throws Exception{
        try{
            ArrayList<Marca> listagem = marcaPersistencia.listagem();
            Iterator<Marca> lista = listagem.iterator();
            while (lista.hasNext()) {
                  Marca aux = lista.next();
                if(aux.getUrl().equalsIgnoreCase(url)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro){
            throw erro;
        }
    }
        
        private boolean verificarVazio(Marca objeto){
            Integer aux = null;
            
        if(objeto.getDescricao().equals("") || objeto.getUrl().equals("")|| (aux.equals(objeto.getId()))) {
            return true;  
        } 
        else{
            return false;
        }
    }
    
        
    @Override
    public void incluir(Marca objeto) throws Exception {
        if(verificarVazio(objeto)) {
            throw new Exception("Preencha os campos corretamente");
        }
            
        if(buscarMarca(objeto.getDescricao())){
            throw new Exception("Marca já foi cadastrada");
        }
        marcaPersistencia.incluir(objeto);
    }
    
    
    @Override
    public void alterar(Marca objeto) throws Exception {
        if(verificarVazio(objeto)) {
            throw new Exception("Preencha os campos corretamente");
        }
       
        marcaPersistencia.alterar(objeto);    
    }
    
    
    @Override
    public ArrayList<Marca> listagem() throws Exception {
         return marcaPersistencia.listagem();
        }
    
      
   public Marca buscar (int id) throws Exception{
       
       return marcaPersistencia.buscar(id);
    }
   
   public Marca buscar (String descricao) throws Exception{
       
       return marcaPersistencia.buscar(descricao);
    }
   
   
   public void conferirBancoDeIDMarca(){
        
        try {
            File bancodedadosID = new File("./src/LocaZilla/Dados/marca/idGerado.txt");
            
            if (!bancodedadosID.exists()) {
                try (FileWriter escritorBanco = new FileWriter(bancodedadosID)) {
                    bancodedadosID.createNewFile();
                    escritorBanco.write("100000");
                    escritorBanco.close();
                }
            }
            
        } catch (IOException e) {
        }
        
    }
   
       public void conferirBancoDeDados(){
        
        try {
            File bancodedados = new File("./src/com/LocaZilla/Dados/marca/Marca.txt");
            if(!bancodedados.exists()){
               
                bancodedados.createNewFile();
                
            }
        } catch (Exception e) {
        }
        
        
    }
   
   
}

        
        


