public class LowPriorityConcreteCreator extends RequestCreator {
    @Override
    public LowPriorityConcrete createRequest() {
        return new LowPriorityConcrete();
    }
}
