import java.io.IOException;
import java.net.HttpURLConnection;

public class FullResponseBuilder {
    public static String getFullResponse(HttpURLConnection connection) throws IOException {
        StringBuilder fullResponseBuilder = new StringBuilder();
        fullResponseBuilder.append(connection.getResponseCode())
        .append("")
        .append(connection.getResponseMessage())
        .append("\n");

        System.out.println("Full Response Builder " + fullResponseBuilder.toString());
        return fullResponseBuilder.toString();
    }
}
