/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.uni.sofia.fmi.mjt.dungeon.actor;

/**
 *
 * @author dobri
 */
public class Position {
    int x;
    int y;
    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void setX(int newX)
    {
        x = newX;
    }
    
    public void setY(int newY)
    {
        y = newY;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
}