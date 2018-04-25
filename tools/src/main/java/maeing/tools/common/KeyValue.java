package maeing.tools.common;

/**
 * <p>@Description : 键值对</p>
 * <p>@Author : maeing </p>
 * <p>@Date : 2018/3/22 16:16 </p>
 */
public class KeyValue<K, V> {

    private K key;

    private V value;

    public KeyValue() {
    }

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
