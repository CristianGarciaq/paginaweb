/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

/**
 * @author Hector
 */
@Entity
@Data
@Table(name = "userrole")
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rcveurol;
    
    //@ManyToOne
   // @JoinColumn(name = "rcveserv",updatable = false,insertable = false)
    private String rcveserv;
    
    @ManyToOne
    @JoinColumn(name = "rcverol",updatable = false,insertable = false)
    private Srol rcverol; 
}
