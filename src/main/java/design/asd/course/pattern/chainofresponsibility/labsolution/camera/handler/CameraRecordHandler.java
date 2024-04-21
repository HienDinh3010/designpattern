package design.asd.course.pattern.chainofresponsibility.labsolution.camera.handler;

import design.asd.course.pattern.chainofresponsibility.labsolution.camera.model.CameraRecord;

public abstract class CameraRecordHandler {
    public abstract void handleCameraRecord(CameraRecord cameraRecord);
}
