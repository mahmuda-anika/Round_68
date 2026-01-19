/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id1291210.service;

import id1291210.dao.TraineeDAO;
import id1291210.model.Trainee;


public class TraineeService {
    
    public Trainee save(Trainee t){
        TraineeDAO tdao = new TraineeDAO();
        
        return tdao.insert(t);
        
    }
}

//controller = create
//dao = insert