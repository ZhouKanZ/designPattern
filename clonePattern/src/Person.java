/**
 * Created by Administrator on 2017/8/22 0022.
 */
public class Person implements Cloneable {

    private int age;
    private String name;
    private Son son;

    public Person(int age, String name, Son son) {
        this.age = age;
        this.name = name;
        this.son = son;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Son getSon() {
        return son;
    }

    public void setSon(Son son) {
        this.son = son;
    }


    /* 浅克隆 *//*
    @Override
    protected Person clone() {

        Person p = null;

        try {
            p = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;

    }*/

    /* 深克隆 */
    @Override
    protected Person clone() {

        Person p = null;

        try {
            p = (Person) super.clone();
            Son s = p.getSon().clone();
            p.setSon(s);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;

    }
}
