import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class FuzzerTest {
    @FuzzTest
    public void fuzz(FuzzedDataProvider data) {
        System.out.println(data.consumeRemainingAsString());
    }
}
