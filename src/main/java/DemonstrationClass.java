import custom_annotations.annotation_processors.ZeroIntegerFieldsProcessor;

public class DemonstrationClass {

    public static void main(String[] args) {
        OrbitalElements orbitalElements = new OrbitalElements("Planet");
        ZeroIntegerFieldsProcessor zeroIntegerFieldsProcessor = new ZeroIntegerFieldsProcessor();
        zeroIntegerFieldsProcessor.process(orbitalElements);
        System.out.println(orbitalElements);
    }
}
