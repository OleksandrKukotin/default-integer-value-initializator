package custom_annotations.annotation_processors;

import custom_annotations.ZeroIntegerFields;

import java.lang.reflect.Field;
import java.util.logging.Logger;

public class ZeroIntegerFieldsProcessor {

    private static final Logger logger = Logger.getLogger(ZeroIntegerFieldsProcessor.class.getName());

    private ZeroIntegerFieldsProcessor() {
    }

    public static void process(Object obj) {
        Class<?> target = obj.getClass();

        if (target.isAnnotationPresent(ZeroIntegerFields.class)) {
            Field[] fields = target.getDeclaredFields();

            for (Field field : fields) {
                if (field.getType() == int.class) {
                    field.setAccessible(true);
                    try {
                        field.setInt(obj, 0);
                        field.setAccessible(false);
                    } catch (IllegalAccessException e) {
                        logger.info("Illegal Access Exception threw during setting zero values");
                        break;
                    }
                }
            }
        }
    }
}
