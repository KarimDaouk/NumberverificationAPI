package main.java.com.karimdaouk;
import lombok.RequiredArgsConstructor;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class numverifyservice {
    private final String NumverifyAPIURL="https://api.apilayer.com/number_verification/validate?number=number";
    private final String name="apikey";
    private final string key="1tJFKRRL7RmE9eyq1G4mhzxtrdllZbsP";



    public ResponseEntity<String> validate(String number){
        OkHttpClient client = new OkHttpClient().newBuilder()
                            .readTimeout(30, TimeUnit.SECONDS)
                            .writeTimeout(30, TimeUnit.SECONDS)
                            .build();

    Request request = new Request.Builder()
      .url(NumverifyAPIURL +number)
      .addHeader(name, key)
      .build();
    Response response = client.newCall(request).execute();
    
    return ResponseEntity.ok(response.body().string());
    }
}
