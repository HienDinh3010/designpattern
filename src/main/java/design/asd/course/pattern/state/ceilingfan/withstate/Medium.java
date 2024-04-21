package design.asd.course.pattern.state.ceilingfan.withstate;

public class Medium implements FanState {

    private CeilingFan fan;

    public Medium(CeilingFan fan) {
        this.fan = fan;
        System.out.println("Medium speed");
    }

    @Override
    public void pullRed() {
        Low newState = new Low(fan);
        fan.setState(newState);
    }

    @Override
    public void pullGreen() {
        High newState = new High(fan);
        fan.setState(newState);
    }
}
