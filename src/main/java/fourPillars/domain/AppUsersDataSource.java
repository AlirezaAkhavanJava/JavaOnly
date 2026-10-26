package fourPillars.domain;

import java.util.ArrayList;
import java.util.List;

public class AppUsersDataSource {

    private final List<AppUsers> users = new ArrayList<>();

    public AppUsersDataSource() {
        users.add(new AppUsers("Ali", "25"));
        users.add(new AppUsers("Shabbir", "22"));
        users.add(new AppUsers("John", "30"));
    }

    public List<AppUsers> findAll() {
        return List.copyOf(users);
    }

    public void save(AppUsers user) {
        users.add(user);
    }
}
