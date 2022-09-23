/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.persistencia;
import com.locagyn.modelos.Marca;
import java.util.ArrayList;
/**
 *
 * @author ejmcc
 */
public interface IMarcaDao {
    void incluir(Marca objeto)throws Exception;
    void alterar(Marca objeto)throws Exception;
    ArrayList<Marca> listagem()throws Exception;
}
