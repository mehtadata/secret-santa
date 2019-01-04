package mehta.assignment;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import mehta.core.Player;
import mehta.input.PlayerInputReader;

import java.util.Collection;

@Singleton
public class AssignmentService {

    private final PlayerInputReader reader;
    private final PlayerAssignmentStrategy assignmentStrategy;

    @Inject
    public AssignmentService(PlayerInputReader reader, PlayerAssignmentStrategy assignmentStrategy) {
        this.reader = reader;
        this.assignmentStrategy = assignmentStrategy;
    }

    public Collection<Assignment> createAssignments() {
        Collection<Player> players = reader.getPlayers();
        return assignmentStrategy.getAssignments(players);
    }


}
