/**
 * Created by Administrator on 2017/8/22 0022.
 */
public class Test {

    public static void main(String[] args) {

        Son son = new Son(12);
        Person zk = new Person(36,"zk",son);

        Person wl = zk.clone();
        wl.setAge(25);
        wl.setName("wl");
        wl.getSon().setAge(18);

        System.out.println(zk.getName() + " ----"+wl.getName());
        System.out.println(son.getAge() + "------"+wl.getSon().getAge());
        System.out.println(wl.getSon() == son);
        System.out.println(wl == zk);

/* 浅克隆 */
//        zk ----wl
//        18------18
//        true
//        false
//        浅克隆模式下  得到的不是同一个对象 但是其子对象 是操作同一个对象

// 深克隆

//        zk ----wl
//        12------18
//        false   -------------------- > 区别
//        false





    }

}
