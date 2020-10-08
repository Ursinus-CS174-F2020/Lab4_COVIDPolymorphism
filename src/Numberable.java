/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ctralie
 */
public interface Numberable {
    public double getNum();
    
    public static Numberable getMin(Numberable[] objs) {
        Numberable minObj = null;
        if (objs.length > 0) {
            double minVal = objs[0].getNum();
            minObj = objs[0];
            for (int i = 1; i < objs.length; i++) {
                if (objs[i].getNum() < minVal) {
                    minVal = objs[i].getNum();
                    minObj = objs[i];
                }
            }        
        }
        return minObj;
    }
    
    public static Numberable getMax(Numberable[] objs) {
        Numberable maxObj = null;
        if (objs.length > 0) {
            double maxVal = objs[0].getNum();
            maxObj = objs[0];
            for (int i = 1; i < objs.length; i++) {
                if (objs[i].getNum() > maxVal) {
                    maxVal = objs[i].getNum();
                    maxObj = objs[i];
                }
            }        
        }
        return maxObj;
    }
}
