package home.learn.authtest.controller;

import home.learn.authtest.comp.C1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/tweet")
public class AuthController {

    @Value("${prof}")
    private String prof;

    @Autowired
    C1 c1;

    @RequestMapping("/")
    public String test(){
       return "success123";
    }

    @RequestMapping("/sum")
    public String sum() throws ExecutionException, InterruptedException {
        System.out.println(c1.m1());
        return  "done" + prof;
    }

    @RequestMapping("/{tweetId}/comments/{commentId}")
    public JSONData test(@PathVariable  Integer tweetId, @PathVariable Integer commentId,
                         @RequestParam(required = false,defaultValue = "DSC") String sorting){

        return  new JSONData(tweetId,commentId,sorting);
    }

}

class JSONData implements Serializable {
    int tweetId;
    int commentId;
    String sorted;

    public JSONData(int tweetId, int commentId, String sorted) {
        this.tweetId = tweetId;
        this.commentId = commentId;
        this.sorted = sorted;
    }

    public int getTweetId() {
        return tweetId;
    }

    public void setTweetId(int tweetId) {
        this.tweetId = tweetId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getSorted() {
        return sorted;
    }

    public void setSorted(String sorted) {
        this.sorted = sorted;
    }
}