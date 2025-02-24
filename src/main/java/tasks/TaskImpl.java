public class TaskImpl implements Task_Interface {
    @Override
    public void execute() throws Task_Exception{
        System.out.println("Task executed successfully!");
    }

}
