/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id1291210.controller;

import id1291210.model.Trainee;
import id1291210.service.TraineeService;

/**
 *
 * @author USER
 */
public class TraineeController {
    public Trainee create(Trainee t){
        TraineeService s = new TraineeService();
        return s.save(t);
        
    
    
    }
}
