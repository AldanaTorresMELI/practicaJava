package PrincipiosJava.Clase3.TT;

public class Time {

    public long timestamp;
    public long elapse;

    public Time(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getElapse() {
        return elapse;
    }

    public void setElapse(long elapse) {
        this.elapse = elapse;
    }

    public void start(){
        this.timestamp = System.currentTimeMillis();
    }

    public void stop(){
        elapse = System.currentTimeMillis()-timestamp;
        int seconds = (int) elapse/1000;
        System.out.println("The time between start and stop functions equals: "+elapse+"ms");
        this.timestamp = System.currentTimeMillis();
    }
}
