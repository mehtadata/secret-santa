import mehta.assignment.Assignment;
import mehta.assignment.AssignmentService;
import mehta.assignment.SimpleAssignmentStrategy;
import mehta.core.Player;
import mehta.input.FilePlayerReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class AppTest {

    @Test
    public void testAssignmentService() {
        AssignmentService service = new AssignmentService(new FilePlayerReader(), new SimpleAssignmentStrategy());
        Collection<Assignment> assignments = service.createAssignments();
        Assert.assertEquals(assignments.size(), 6);
        Set<String> names = assignments.stream()
            .map(Assignment::getOwner)
            .map(Player::getName)
            .collect(Collectors.toSet());
        Assert.assertEquals(names.size(), 6);
    }


}
