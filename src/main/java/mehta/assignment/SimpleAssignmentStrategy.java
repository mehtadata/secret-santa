package mehta.assignment;

import mehta.core.Player;

import java.util.*;

public class SimpleAssignmentStrategy implements PlayerAssignmentStrategy {

    @Override
    public Collection<Assignment> getAssignments(Collection<Player> players) {
        List<Player> playersList = new ArrayList<>(players);
        List<Assignment> assignments = new ArrayList<>();
        for (int i = 0; i < playersList.size(); i++) {
            Player recipient;
            if (i == playersList.size() - 1) {
                recipient = playersList.get(0);
            } else {
                recipient = playersList.get(i + 1);
            }
            assignments.add(new Assignment(playersList.get(i), recipient));
        }


        return assignments;
    }
}
