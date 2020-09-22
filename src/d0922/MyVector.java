package d0922;
//2 591p

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class MyVector implements List {
    Object[] data = null; // 객체를 담기 위한 객체배열
    int capacity = 0;
    int size = 0;

    public MyVector(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("유효하지 않은 값 : " + capacity);

        this.capacity = capacity;
        data = new Object[capacity];
    }
    public MyVector() { this(10); }

    //최소한의 저장공간을 확보하는 메서드
    public void ensureCapacity(int minCapacity) {
        if (minCapacity - data.length > 0)
            setCapacity(minCapacity);
    }

    public boolean add(Object obj) {
        //새로운 객체를 저장하기 전에 저장할 공간을 확보한다.
        ensureCapacity(size + 1);
        data[size++] = obj;
        return true;
    }

    public Object get(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위 벗어남");
        return data[index];
    }

    public Object remove(int index) {
        Object oldObj = null;

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위 벗어남");
        oldObj = data[index];

        //삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열복사를 통해 빈자리 채워야 함.
        if(index != size - 1) {
            System.arraycopy
                    (data, index + 1, data, index, size - index - 1);
        }
        //마지막 데이터를 null로 한다. 배열은 0부터 시작하므로
        // 마지막 요소의 index는 size - 1이다
        data[size - 1] = null;
        size--;
        return oldObj;
    }

    public boolean remove(Object obj) {
        for(int i = 0; i < size; i++) {
            if(obj.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimToSize() {
        setCapacity(size);
    }

    private void setCapacity(int capacity) {
        if (this.capacity == capacity) return; // 크기가 같으면 변경x

        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
    }

    public void clear() {
        for(int i = 0; i < size; i++)
            data[i] = null;
        size = 0;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);

        return result;
    }
    
// 이 밑으로 직접 코딩 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    public boolean contains(Object o) {
        for(int i = 0; i < size; i++)
            if ( o.equals(data[i]))
                return true;
        return false;
    }

    public boolean equals(Object o) {
        MyVector tmp = (MyVector)o;
        if( tmp.size == this.size)
            if(tmp.data == this.data)
                return true;

        return false;
    }

    public Object set(int index, Object element) {
        if ( index >= capacity() )
            throw new IndexOutOfBoundsException("범위 벗어남");
        Object oldElement = data[index];
        data[index] = element;
        return oldElement;
    }

    public void add(int index, Object element) {
        if ( index > size )
            throw new IndexOutOfBoundsException();
        ensureCapacity(size + 1);
        if ( index == size)
            size++;
        data[index] = element;
    }

    public int indexOf(Object o) {
        for(int i = 0; i < size; i++)
            if (o.equals(data[i]))
                return i;
        return -1;
    }

    public int lastIndexOf(Object o) {
        for(int i = size; i >= 0; i--)
            if (o.equals(data[i]))
                return i;
        return -1;
    }

    public String toString() {
        String s = "[";
        for(int i = 0; i < size; i++) {
            s += data[i];
           if (i + 1 < size)
               s+= ", ";
        }
        s += "]";
        return s;
    }

    public boolean isEmpty() { return size == 0; }
    public int capacity() { return capacity; }
    public int size() { return size; }
    /*
    List interface로 부터 상속받은 Methods
     */
//  public boolean contains(Object o) {return false; }
//  public boolean equals(Object o) { return false; }
//  public Object set(int index, Object element) { return null; }
//  public void add(int index, Object element) {}
//  public int indexOf(Object o) { return -1; }
//  public int lastIndexOf(Object o) { return -1; }
//  public String toString() { return ""; }

// 이 위으로 직접 코딩 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


//  public int size();
//  public boolean isEmpty();
//  public Object[] toArray();
//  public boolean add(Object o);
//  public boolean remove(Object o);
//  public void clear();
//  public int hashCode();
//  public Object get(int index);
//  public Object remove(int indx);
    public ListIterator listIterator() { return null; }
    public boolean containsAll(Collection c) { return false; }
    public Object[] toArray(Object a[]) { return null; }
    public Iterator iterator() { return null; }
    public boolean addAll(Collection c) { return false; }
    public boolean addAll(int index, Collection c) { return false; }
    public boolean removeAll(Collection c) { return false; }
    public boolean retainAll(Collection c) { return false; }
    public ListIterator listIterator(int index) { return null; }
    public List subList(int fromIndex, int toIndex) { return null; }
}
