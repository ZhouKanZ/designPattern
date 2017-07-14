package normal;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/7/14 0014.
 */
public class ClickListener implements Observer {

    private String name;

    public ClickListener(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (null != arg){
            System.out.println("name:"+name+",arg:"+arg.toString());
        }else {
            System.out.println("name:"+name+",arg:"+name);
        }


    }

}
