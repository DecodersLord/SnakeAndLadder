/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakesandladders;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Priyank Sevak
 */
public interface IPower {
    Map<Integer,Integer> PowerMap = new HashMap<Integer,Integer>();
    void SetPowers(int currPos);
}
