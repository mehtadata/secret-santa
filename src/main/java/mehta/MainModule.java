package mehta;

import com.google.inject.AbstractModule;
import mehta.assignment.PlayerAssignmentStrategy;
import mehta.assignment.SimpleAssignmentStrategy;
import mehta.input.FilePlayerReader;
import mehta.input.PlayerInputReader;

public class MainModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PlayerInputReader.class).to(FilePlayerReader.class);
        bind(PlayerAssignmentStrategy.class).to(SimpleAssignmentStrategy.class);
    }
}
