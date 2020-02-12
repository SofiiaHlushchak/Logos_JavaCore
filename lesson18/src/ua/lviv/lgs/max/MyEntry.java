package ua.lviv.lgs.max;

import java.util.Objects;

public class MyEntry<K,V> {
    K obg1;
    V obg2;

    public K getObg1() {
        return obg1;
    }

    public void setObg1(K obg1) {
        this.obg1 = obg1;
    }

    public V getObg2() {
        return obg2;
    }

    public void setObg2(V obg2) {
        this.obg2 = obg2;
    }

    public MyEntry(K obg1, V obg2) {
        this.obg1 = obg1;
        this.obg2 = obg2;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "obg1=" + obg1 +
                ", obg2=" + obg2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyEntry)) return false;
        MyEntry<?, ?> myEntry = (MyEntry<?, ?>) o;
        return getObg1().equals(myEntry.getObg1()) &&
                getObg2().equals(myEntry.getObg2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getObg1(), getObg2());
    }
}
