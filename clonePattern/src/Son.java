/**
 * Created by Administrator on 2017/8/22 0022.
 */
public class Son implements Cloneable {

    private int age;

    public Son(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Son clone()   {

        Son son = null;
        try {
            son = (Son) super.clone();
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
        }

        return son;

    }
}
