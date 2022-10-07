import java.io.*;
public class demo {

    public static void main(String[] args) throws IOException {

        InputStream stream = new ByteArrayInputStream("welcome".getBytes());
        StringBuilder sb = new StringBuilder();
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();

        System.out.println(sb);

    }
}
