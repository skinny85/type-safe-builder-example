import com.endoflineblog.type_safe_builder.submodule_03.User;
import com.endoflineblog.type_safe_builder.submodule_03.UserBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class User03BuilderUsage {
    @Test
    public void user_builder_usage() {
        User user = UserBuilder.user()
                .email("joey@example.com")  // these 3 lines are mandatory (required properties)
                .firstName("John")
                .lastName("Smith")
//                .username(null) // 'username' is optional
//                .displayName(null) // ...as is 'displayName'
                .build();

        assertEquals("joey@example.com", user.email);
        assertEquals("joey@example.com", user.username);
        assertEquals("John", user.firstName);
        assertEquals("Smith", user.lastName);
        assertEquals("John Smith", user.displayName);
    }
}
