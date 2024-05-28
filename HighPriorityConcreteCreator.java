public class HighPriorityConcreteCreator extends RequestCreator {
    @Override
    public HighPriorityConcrete createRequest() {
        return new HighPriorityConcrete();
    }
}
