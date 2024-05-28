public class Main {
    public static void main(String[] args) {
        RequestCreator lowPriorityCreator = new LowPriorityConcreteCreator();
        RequestCreator mediumPriorityCreator = new MediumPriorityConcreteCreator();
        RequestCreator highPriorityCreator = new HighPriorityConcreteCreator();

        System.out.println("Processing Low Priority Request:");
        lowPriorityCreator.processRequest();

        System.out.println("\nProcessing Medium Priority Request:");
        mediumPriorityCreator.processRequest();

        System.out.println("\nProcessing High Priority Request:");
        highPriorityCreator.processRequest();
    }
}
