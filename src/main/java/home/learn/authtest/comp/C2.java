package home.learn.authtest.comp;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class C2 {

    @Async
    public CompletableFuture<Integer> m2(Integer i){
        System.out.println(Thread.currentThread().getName());
        return CompletableFuture.completedFuture(i*i);
    }


}
