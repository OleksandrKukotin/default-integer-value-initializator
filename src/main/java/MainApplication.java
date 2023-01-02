import custom_annotations.annotation_processors.ZeroIntegerFieldsProcessor;

public class MainApplication {

    public static void main(String[] args) {
        OrbitalElements orbitalElements = new OrbitalElements("Planet");
        new ZeroIntegerFieldsProcessor().process(orbitalElements);
        System.out.println(orbitalElements);
    }
}
