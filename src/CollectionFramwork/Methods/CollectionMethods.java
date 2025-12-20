package CollectionFramwork.Methods;

import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods implements Collection {
    @Override
    public int size() { //number of object are present in collection;
        return 0;
    }

    @Override
    public boolean isEmpty() { //collection are is empty or not;
        return false;
    }

    @Override
    public boolean contains(Object o) { //check particular obj are present or not;
        return false;
    }

    @Override
    public Iterator iterator() { //to get Iterator object ;
        return null;
    }

    @Override
    public Object[] toArray() { //convert Collection to Array;
        return new Object[0];
    }

    @Override
    public boolean add(Object o) { //add a single object
        return false;
    }

    @Override
    public boolean remove(Object o) { //remove a particular object of collection
        return false;
    }

    @Override
    public boolean addAll(Collection c) { //add group of object
        return false;
    }

    @Override
    public void clear() {  //all object are clear

    }

    @Override
    public boolean retainAll(Collection c) { // (objects) only remain and other all are remove;
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {  // remove group of object
        return false;
    }

    @Override
    public boolean containsAll(Collection c) { //check group of obj are present or not;
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
