/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
@Table(name = "appuser")
public class AppUser  implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private String uacveserv;

    private String uapassword;

    private String uacorreo;
    
}
