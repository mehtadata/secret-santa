package mehta;

import com.google.inject.Guice;
import com.google.inject.Injector;
import mehta.assignment.AssignmentService;

public class App {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MainModule());
        injector.getInstance(AssignmentService.class).createAssignments()
            .forEach(System.out::println);
    }
}
