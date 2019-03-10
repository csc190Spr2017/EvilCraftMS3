/*
 * Copyright (C) 2019 csc190
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package EvilCraftMilestone3;

import BridgePattern.ICanvasDevice;
import BridgePattern.ISoundDevice;
import EvilCraft.EvilCraftGameEngine;
import java.util.ArrayList;

/**
 * Main class for Milestone 3.
 *
 * @author csc190
 */
public class GameEngineMS3 extends EvilCraftGameEngine {

    public GameEngineMS3(String mapPath, ICanvasDevice canvas, ISoundDevice sound, int size) {
        super(mapPath, canvas, sound, size);
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Loads map and create/layout  infantry and armored units!
     * @param mapPath 
     */
    @Override
    public void initGame(String mapPath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Make update to all game objects
     */
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Set the view port to the given coordinates. For example, (100,100) means that the view port is located at (100,100) in map.
     * @param x - the x coordinate of left-top corner of view port in map
     * @param y - the y coordinate of left-top corner of view port in map
     */
    @Override
    public void setViewPort(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
