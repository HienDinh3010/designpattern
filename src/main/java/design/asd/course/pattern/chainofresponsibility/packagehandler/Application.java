package design.asd.course.pattern.chainofresponsibility.packagehandler;

public class Application {
    public static void main(String[] args) {
        PackageHandler packageHandler = new PackageHandler();
        NormalPackageHandler normalPackageHandler = new NormalPackageHandler(null);
        HeavyWeightSpecialCareHandler heavyWeightSpecialCareHandler =
                new HeavyWeightSpecialCareHandler(normalPackageHandler);
        InternaltionalNormalCareHandler internaltionalNormalCareHandler =
                new InternaltionalNormalCareHandler(heavyWeightSpecialCareHandler);
        InternationalSpecialCareHandler internationalSpecialCareHandler =
                new InternationalSpecialCareHandler(internaltionalNormalCareHandler);
        packageHandler.setChainOfHandlers(internationalSpecialCareHandler);

        packageHandler.handlePackage(
                new Package(1543, 56, false, true, true, 300.0));
        packageHandler.handlePackage(
                new Package(1223, 156, true, false, true, 154.54));
        packageHandler.handlePackage(
                new Package(545, 12, false, false, false, 30.0));

    }
}
