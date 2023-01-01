import custom_annotations.annotation_processors.ZeroIntegerFieldsProcessor;

import java.util.logging.Logger;

public class DemonstrationClass {

    private static final Logger logger = Logger.getLogger(DemonstrationClass.class.getName());

    public static void main(String[] args) {
        OrbitalElements orbitalElements = new OrbitalElements();
        ZeroIntegerFieldsProcessor.process(orbitalElements);
        logger.info(orbitalElements.toString());
    }
}
