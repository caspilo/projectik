package dto_classes;
import java.time.OffsetDateTime;
public record StackOverflowResponse(String title, OffsetDateTime updatedAt) {
}
