import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TodoListGUI extends Application {
    private ListView<String> todoListView;
    private TextField taskInput;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("To-Do List");

        todoListView = new ListView<>();
        taskInput = new TextField();
        Button addButton = new Button("Add Task");
        Button removeButton = new Button("Remove Task");

        addButton.setOnAction(event -> addTask());
        removeButton.setOnAction(event -> removeTask());

        VBox inputBox = new VBox(taskInput, addButton, removeButton);
        inputBox.setSpacing(10);

        BorderPane root = new BorderPane();
        root.setCenter(todoListView);
        root.setRight(inputBox);
        BorderPane.setMargin(inputBox, new Insets(10));

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void addTask() {
        String task = taskInput.getText();
        if (!task.isEmpty()) {
            todoListView.getItems().add(task);
            taskInput.clear();
        }
    }

    private void removeTask() {
        int selectedIndex = todoListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            todoListView.getItems().remove(selectedIndex);
        }
    }

    public void stop() {
        // You can save the to-do list items to a file or database here if needed.
    }
}
