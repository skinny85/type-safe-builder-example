import com.endoflineblog.type_safe_builder.submodule_01.User;
import com.endoflineblog.type_safe_builder.submodule_01.UserBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class User01BuilderUsage {
    @Test
    public void user_builder_usage() {
        User user = new UserBuilder()
                .email("joey@example.com")
                .username("john_smith")
                .firstName("John")
                .lastName("Smith")
                .displayName("joey")
                .build();

        assertEquals("joey@example.com", user.email);
        assertEquals("john_smith", user.username);
        assertEquals("John", user.firstName);
        assertEquals("Smith", user.lastName);
        assertEquals("joey", user.displayName);
    }
}
