import normal.Button;
import normal.ClickListener;

/**
 * Created by Administrator on 2017/7/14 0014.
 */
public class ObserverTest {

    public static void main(String[] args) {

        new ObserverTest().normal();

    }

    /**
     *  传统模式下的观察者分发到多个
     */
    public  void normal(){

        String[] listeners = {"clickListener1","clickListener2","clickListener3"};

        Button btn = new Button();
        btn.addObserver(listeners[0],new ClickListener(listeners[0]));
        btn.addObserver(listeners[1],new ClickListener(listeners[1]));
        btn.addObserver(listeners[2],new ClickListener(listeners[2]));

        /* 按照顺序分发事件 */
        for (String s:
                listeners) {
            btn.onclick(s);
        }

        System.out.println("---------------------");

        /* 分发给所有的观察者 */
        btn.onclick();
    }

}
