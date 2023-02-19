package cleancode;

public class ClassWithThreadingProblem {

    int lastId = 0;

    public int takeNextId() {
        return lastId++;
    }

}
