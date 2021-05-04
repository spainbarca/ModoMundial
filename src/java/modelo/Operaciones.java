/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Noah
 */
public interface Operaciones {
    public String insertar(Object obj);
    public List<?> logear();
    public List<?> consultar();
    public String eliminar(Object obj);
  public String modificar(Object obj);
  public List<?> filtrar(String campo,String criterio);
}
