package home.learn.authtest.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
@Profile("prod")
public class C1 {

    @Autowired
    C2 c2;

    public Integer m1() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> result1= c2.m2(1);
        CompletableFuture<Integer> result2= c2.m2(2);
        CompletableFuture<Integer> result3= c2.m2(3);
        CompletableFuture<Integer> result4= c2.m2(4);

        return result1.get()+ result2.get() + result3.get() +result4.get();
    }
}
