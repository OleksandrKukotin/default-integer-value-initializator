package custom_annotations.annotation_processors;

import custom_annotations.ZeroIntegerFields;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;

public class ZeroIntegerFieldsProcessor {

    private final org.apache.log4j.Logger LOGGER = Logger.getLogger(ZeroIntegerFieldsProcessor.class.getName());

    public void process(Object obj) {
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
                        LOGGER.error("Couldn't set zero to the following field: " + field.getName());
                    }
                }
            }
        }
    }
}
