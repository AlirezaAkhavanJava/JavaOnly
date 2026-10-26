package fourPillars;

import java.util.List;

public abstract class AppUserServiceAllUsers implements AppUsersService{
    @Override
    public List<String> allUsers() {
        return List.of();
    }
}
