import org.json.JSONObject;
import org.json.JSONArray;
import org.apache.commons.io.IOUtils;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class JsonFromUrl{  
        private static int counter;
        public static void main(String args[]){
                try{
                        final String stringUrl = "https://get-my-public-ip-address.herokuapp.com";
                        final URL url = new URL (stringUrl);
                        final Charset charset = Charset.forName("UTF-8");
                        List <Thread> threadList = Collections.synchronizedList(new ArrayList<>());
                        final JSONArray jsonArray = new JSONArray ();
                        // List list = Collections.synchronizedList(new ArrayList());
                        for (int i = 0; i < 10; ++i){
                                Thread thread = new Thread(()->{
                                        try{
                                                if (counter % 2 == 0){
                                                        // Thread.sleep(10000);
                                                        // System.out.println("counter: "+counter);
                                                }
                                                final JSONObject jsonFromUrl = new JSONObject(IOUtils.toString(url, charset));
                                                final JSONObject jsonWrap = new JSONObject();
                                                jsonWrap.put ("index", counter++);
                                                jsonWrap.put ("fromUrl", jsonFromUrl);
                                                synchronized(jsonArray){
                                                        jsonArray.put (jsonWrap);
                                                }
                                                // System.out.println("length: "+jsonArray.length () + ", counter: " + counter);
                                        }
                                        catch (Exception exception){
                                                System.out.println(exception.getMessage());
                                        }

                                });
                                threadList.add (thread);
                                thread.start ();
                        }

                        try {
                                for (Thread thread: threadList){
                                        thread.join();
                                }
                        } catch (InterruptedException ex) {
                                System.out.println("JOIN: "+ex);
                        }
                        System.out.println(jsonArray.toString ());
                }
                catch (Exception exception){
                        System.out.println(exception.getMessage());
                }
        }
}
