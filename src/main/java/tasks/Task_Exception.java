public class Task_Exception extends Throwable {
    public static void main(String[] args){
        try {
            Task_Interface task = new TaskImpl();
            task.execute();
        } catch (Task_Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }


}
