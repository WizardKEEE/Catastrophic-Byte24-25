package org.firstinspires.ftc.teamcode.drive;

public class UtilMeth {

    private UtilMeth(){}

    public static int clamp(int t,int min,int max) {
        if(min>t) {
            return min;
        } else {
            return Math.min(t, max);
        }
    }

    public static float clamp(float t,float min,float max) {
        if(min>t) {
            return min;
        } else {
            return Math.min(t, max);
        }
    }

    public static int fromBool(boolean a) {
        return a?1:-1;
    }
}
