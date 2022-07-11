/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ale12.CrudTareas.Dao;

import com.ale12.CrudTareas.Model.Tarea;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author ale12
 */
public interface TareaDao extends CrudRepository <Tarea, Integer> {
        
}
