package TaskManagementSystem;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        taskList.addTask(new Task("T001", "Task 1", "Pending"));
        taskList.addTask(new Task("T002", "Task 2", "Completed"));
        taskList.addTask(new Task("T003", "Task 3", "In Progress"));

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        Task searchResult = taskList.searchTask("T002");
        System.out.println("\nSearch Result:");
        System.out.println(searchResult != null ? searchResult : "Task not found");

        taskList.deleteTask("T002");
        System.out.println("\nTasks after deletion:");
        taskList.traverseTasks();
    }
}
