/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.j20.labs.tasks.template;

/**
 *
 * @author java
 */
public class Point<T extends Number> 
{
    public final T x;
    public final T y;

    public Point(T x, T y) 
    {
        this.x = x;
        this.y = y;
    }
}