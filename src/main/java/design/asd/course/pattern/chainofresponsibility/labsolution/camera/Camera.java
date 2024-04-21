package design.asd.course.pattern.chainofresponsibility.labsolution.camera;

public class Camera {

    private CameraRecordReceiver cameraRecordReceiver;

    public Camera(CameraRecordReceiver cameraRecordReceiver) {
        this.cameraRecordReceiver = cameraRecordReceiver;
    }

    public void generateCameraRecords() {

    }
}
