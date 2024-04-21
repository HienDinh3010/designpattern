package design.asd.course.pattern.chainofresponsibility.labsolution.camera;

public class Application {
    public static void main(String[] args) {
        CameraRecordReceiver cameraRecordReceiver = new CameraRecordReceiver();
        Camera camera = new Camera(cameraRecordReceiver);
    }
}
