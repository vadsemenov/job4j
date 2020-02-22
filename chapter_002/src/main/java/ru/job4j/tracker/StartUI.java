package ru.job4j.tracker;


import java.util.List;
import java.util.function.Consumer;

public class StartUI {

     private Consumer<String> output;

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(new CreateAction(), new ReplaceAction(), new DeleteAction(),
                new FindByNameAction(), new FindByIdAction(), new FindAllAction(), new ExitAction());

        new StartUI().init(validate, tracker, actions, System.out::println);
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions, Consumer<String> output) {
        boolean run = true;
        this.output = output;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        output.accept("Menu:");
        for (int index = 0; index < actions.size(); index++) {
            output.accept(index + "." + actions.get(index).name());
        }
    }
}