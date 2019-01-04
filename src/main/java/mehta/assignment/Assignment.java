package mehta.assignment;

import mehta.core.Player;

public class Assignment {

    private final Player owner;
    private final Player recipient;

    public Assignment(Player owner, Player recipient) {
        this.owner = owner;
        this.recipient = recipient;
    }

    public Player getOwner() {
        return owner;
    }

    public Player getRecipient() {
        return recipient;
    }

    @Override
    public String toString() {
        return String.format("Player %s -> %s", owner, recipient);
    }
}
