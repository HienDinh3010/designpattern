package design.asd.course.pattern.state.ceilingfan.withstate;

public class Low implements FanState {

    private CeilingFan fan;

    public Low(CeilingFan fan) {
        this.fan = fan;
        System.out.println("low speed");
    }

    @Override
    public void pullRed() {
        Off newState = new Off(fan, false);
        fan.setState(newState);
    }

    @Override
    public void pullGreen() {
        Medium newState = new Medium(fan);
        fan.setState(newState);
    }
}
