package clientBeans;


import dto_classes.StackOverflowResponse;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;


public class StackOverflowClient {
    private static final String STACK_OVERFLOW_BASE_URL = "https://api.stackexchange.com";
    private WebClient webClient;
    private String URL;

    public StackOverflowClient(String customURL){
        URL = customURL;
        webClient = WebClient.builder()
                .baseUrl(URL)
                .defaultHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public StackOverflowClient(){
        URL = STACK_OVERFLOW_BASE_URL;
        webClient = WebClient.builder()
                .baseUrl(URL)
                .defaultHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public StackOverflowResponse fetchQuestion(long id){
        return webClient
                .get()
                .uri("/questions/{id}", id)
                .retrieve()
                .bodyToMono(StackOverflowResponse.class)
                .block();
    }
}