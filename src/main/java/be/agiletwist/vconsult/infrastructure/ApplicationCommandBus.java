package be.agiletwist.vconsult.infrastructure;

public class ApplicationCommandBus implements CommandBus {
    @Override
    public void execute(Command command) {
        command.execute();
    }
}
