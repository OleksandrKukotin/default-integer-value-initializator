import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SetIntFieldsToZero {
    public void process() {
// Get all fields of the class
        Field[] fields = this.getClass().getDeclaredFields();
        // Iterate through the fields
        for (Field field : fields) {
            // Check if the field is an integer
            if (field.getType() == int.class) {
                // Set the field value to 0
                field.setAccessible(true);
                try {
                    field.setInt(this, 0);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}