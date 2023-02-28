public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        this.flying = true;
        this.altitude = 1000;
    }

    @Override
    public void land() {
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public void glide() {
        System.out.println("I am gliding");
    }

     @Override
     public void ascend(int velocity) {
        this.altitude = this.altitude * velocity * 2;
     }

     @Override
     public void descend(int velocity) {
        this.altitude = this.altitude / velocity * 2;
     }

}
