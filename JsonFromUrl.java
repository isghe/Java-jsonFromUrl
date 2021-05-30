import org.json.JSONObject;
import org.json.JSONArray;
import org.apache.commons.io.IOUtils;
import java.net.URL;
import java.nio.charset.Charset;

class JsonFromUrl{  
        public static void main(String args[]){
                try{
                        final String stringUrl = "https://get-my-public-ip-address.herokuapp.com";
                        final URL url = new URL (stringUrl);
                        final Charset charset = Charset.forName("UTF-8");
                        final JSONArray jsonArray = new JSONArray ();
                        for (int i = 0; i < 1; ++i){
                                final JSONObject jsonFromUrl = new JSONObject(IOUtils.toString(url, charset));
                                final JSONObject jsonWrap = new JSONObject();
                                jsonWrap.put ("index", i+1);
                                jsonWrap.put ("fromUrl", jsonFromUrl);
                                jsonArray.put (jsonWrap);
                        }
                        System.out.println(jsonArray.toString ());
                }
                catch (Exception exception){
                        System.out.println(exception.getMessage());
                }
        }
}
