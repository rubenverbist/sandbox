package be.agiletwist.vconsult.infrastructure;

public interface CommandBus {
    public void execute(Command command);
}
