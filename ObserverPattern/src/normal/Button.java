package normal;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/7/14 0014.
 *
 *  被观察者
 *
 */
public class Button extends Observable {

    private HashMap<String,Observer> observers;

    public Button() {
        observers = new HashMap<>();
    }

    /**
     *  将事件分发给指定的观察者
     * @param name
     */
    public void onclick(String name){
        observers.get(name).update(this,name);
    }

    /**
     *  将事件分发给所有的观察者
     */
    public void onclick(){
        super.setChanged();
        super.notifyObservers();
    }

    public void addObserver(String observerName,Observer ob){
        if (!observers.containsKey(observerName)){
            super.addObserver(ob);
            observers.put(observerName,ob);
        }else {
            super.deleteObserver(ob);
            super.addObserver(ob);
            observers.put(observerName,ob);
        }

    }

    public void deleteObserver(String observerName){
        if (observers.containsKey(observerName)){
            observers.remove(observerName);
            super.deleteObserver(observers.get(observerName));
        }
    }

}
