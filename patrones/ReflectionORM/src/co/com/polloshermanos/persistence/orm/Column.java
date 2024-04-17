/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.polloshermanos.persistence.orm;

/**
 *
 * @author Usuario
 */
public @interface Column {
    public String name() default "";
    public boolean nullable() default false;
}
