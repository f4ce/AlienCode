/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package export.format;

import aliencode.Alien;

/**
 *
 * @author Shivansh
 */
public abstract class OutputFormat {
    
    public abstract void toExport(Alien alien)throws Exception;
}
