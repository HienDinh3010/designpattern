package design.asd.course.pattern.state.ceilingfan.withstate;

public class Off implements FanState {

    private CeilingFan fan;

    public Off(CeilingFan fan, boolean start) {
        this.fan = fan;
        if (!start) {
            System.out.println("turning off");
        }
    }

    @Override
    public void pullRed() {
        High newState = new High(fan);
        fan.setState(newState);
    }

    @Override
    public void pullGreen() {
        Low newState = new Low(fan);
        fan.setState(newState);
    }
}
