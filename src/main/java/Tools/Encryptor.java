package Tools;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Ruizhe Ou, Jiacheng Li
 * @version 1.0
 * @since 10th May
 *
 * String Encryptor
 * */
public class Encryptor {
    public static <T> String encoder(T rawData){
        String rawStr = rawData.toString();
        final Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(rawStr.getBytes(StandardCharsets.UTF_8));
    }

    public static String decoder(String encodedData){
        final Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(encodedData), StandardCharsets.UTF_8);
    }
}
