package org.ssa;

public class Ambulance {
    private int zone;
    private int number;
    private long timeStart; // long if time is in milliseconds otherwise int
    private long timeEnd;
    private boolean isFree;

    public Ambulance(int zone,int number,long timeStart,long timeEnd, boolean isFree){
        this.zone = zone;
        this.number = number;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.isFree = isFree;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public long getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    public long getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(long timeEnd) {
        this.timeEnd = timeEnd;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
