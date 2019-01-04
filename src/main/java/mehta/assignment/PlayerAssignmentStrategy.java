package mehta.assignment;

import mehta.core.Player;

import java.util.Collection;

public interface PlayerAssignmentStrategy {
    Collection<Assignment> getAssignments(Collection<Player> players);
}
