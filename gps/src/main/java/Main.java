import com.alibaba.fastjson.JSONObject;
import com.gps.bean.Man;
import com.gps.bean.Woman;
import com.gps.observer.GpsObserver;
import com.gps.observerable.GpsObserverable;
import io.reactivex.functions.Function;

/**
 * Created by Administrator on 2017/7/17 0017.
 */
public class Main {

    public static void main(String[] args) {

        String[] strings = {"{'name':'zhoukan','age':18}","{'height':'45','happy':'very'}"};

        final GpsObserverable observerable = new GpsObserverable();

        for (String s: strings) {
            observerable.just(s)
                    .map(new Function<String, Object>() {
                        public Object apply(String s) throws Exception {

                            System.out.println("s----:" + s);
                            int type = 0;

                            Man man = null;
                            Woman woman = null;

                            try{
                                man = JSONObject.parseObject(s, Man.class);
                            }catch (Exception e){
                            }finally {
                                if (man != null){
                                    woman = JSONObject.parseObject(s,Woman.class);
                                    type = 1;
                                }
                            }

                            if (type == 0){
                                return man;
                            }else {
                                return woman;
                            }
                        }
                    }).subscribe(new GpsObserver());
        }




    }

}
