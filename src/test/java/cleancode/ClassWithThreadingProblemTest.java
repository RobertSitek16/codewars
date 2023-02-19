package cleancode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassWithThreadingProblemTest {

    @Test
    public void twoThreadsShouldFailEventually() throws Exception {
        final ClassWithThreadingProblem classWithThreadingProblem = new ClassWithThreadingProblem();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                classWithThreadingProblem.takeNextId();
            }
        };

        for (int i = 0; i < 1_000_000; i++) {
            int startingId = classWithThreadingProblem.lastId;
            int expectedResult = 2 + startingId;


            Thread t1 = new Thread(runnable);
            Thread t2 = new Thread(runnable);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

            int endingId = classWithThreadingProblem.lastId;

            System.out.println(endingId != expectedResult);
            if (endingId != expectedResult) {
                return;
            }
            System.out.println(i);
        }

        fail("Should throw error with threads, but it didn't happen.");
    }

}