package design.asd.course.pattern.state.ceilingfan.withstate;

public class CeilingFan {
    private FanState state;

    public void setState(FanState state) {
        this.state = state;
    }

    public void pullGreen() {
        state.pullGreen();
    }

    public void pullRed() {
        state.pullRed();
    }
}
