package mehta.input;

import mehta.core.Player;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilePlayerReader implements PlayerInputReader {

    private final String path = "C:\\Users\\amehta\\IdeaProjects\\mehta\\src\\main\\resources\\PlayerList.txt";

    @Override
    public Collection<Player> getPlayers() {
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            return stream.map(Player::new).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Could not read players");
        }
    }
}
