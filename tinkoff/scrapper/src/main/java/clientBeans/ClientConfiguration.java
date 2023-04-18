package clientBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
public class ClientConfiguration {

    @Bean("githubClient")
    public GitHubClient githubClient(WebClient githubWebClient) {
        return new GitHubClient();
    }

    @Bean("stackOverflowClient")
    public StackOverflowClient stackOverflowClient() {
        return new StackOverflowClient();
    }

}