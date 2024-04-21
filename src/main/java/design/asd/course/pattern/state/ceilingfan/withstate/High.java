package design.asd.course.pattern.state.ceilingfan.withstate;

public class High implements FanState {

    private CeilingFan fan;

    public High(CeilingFan fan) {
        this.fan = fan;
        System.out.println("High speed");
    }

    @Override
    public void pullRed() {
        Medium newState = new Medium(fan);
        fan.setState(newState);
    }

    @Override
    public void pullGreen() {
        Off newState = new Off(fan, false);
        fan.setState(newState);
    }
}
