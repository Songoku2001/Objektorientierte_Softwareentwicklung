package WS2021.Arraylist;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

class AL<E> implements List<E> {
  protected E[] store = (E[]) new Object[5];
  protected int size = 0;

  public AL(E... es) {
    for (E e : es)
      add(e);
  }

  private void mkNewStore() {
    E[] newStore = (E[]) new Object[size + 5];
    for (int i = 0; i < store.length; i++)
      newStore[i] = store[i];
    store = newStore;
  }

  public void add(E e) {
    if (store.length <= size)
      mkNewStore();
    store[size++] = e;
  }

  @Override
  public void addAll(List<E> cs) {
    for(int i=0; i<cs.size(); i++){
      add(cs.get(i));
    }
  }

  @Override
  public void remove(int i) {          //man fängt nicht im negativen Bereich zu zählen und
    if (i < 0 || i >= size()) return;  //Index i kann nicht größer sein als die size
    for (; i < size()-1; i++) {
      store[i] = store[i+1];
    }
    size--;            //beim remove hat man ein platz frei
  }

  @Override
  public void insert(int i, E e) {
    if (i < 0) {
      return;
    }
    if (i >= size()) {         //am ende ein element hinzufügen
      add(e);
      return;
    }
    if (size() >= store.length) mkNewStore();  //Methode um mehr Platz zu schaffen

    for (int j = size();j > i; j--) {
      store[j] = store[j-1];
    }
    store[i]=e;
    size++;
  }
  @Override
  public boolean contains(E e) {
    for (int i = 0; i < size(); i++) {
      if (store[i].equals(e)) {
        return true;
      }
    }return false;
  }

  @Override
  public boolean containsWith(Predicate<E> pred) {
    for (int i = 0; i < size(); i++) {
      if (pred.test(get(i)))
        return true;
    }
    return false;
  }

  @Override
  public void reverse() {
    for(int i=0;i<size()/2;i++ ){
      E e = store[i];
      store[i]=store[size()-i-1];
      store[size()-i-1]= e;
    }
  }

  @Override
  public void forEach(Consumer<? super E> consumer) {
    for (int i = 0; i < size(); i++) {
      consumer.accept(get(i));
    }
  }

  @Override
  public boolean startsWith(List<E> that) {
   if(that.size()>size()) {
      return false;
    }
   if(size()==0 && that.size() ==0){
      return true;
    }
    for (int i=0;i<that.size();i++)
      if (that.get(i) != get(i)) {
        {
          return false;
        }
      }return true;
  }
   /* for(int i=0;i<that.size();i++){
      if(!store[i].equals(that.get(i))){
        return false;
      }
    }
    return true;
  */

  @Override
  public boolean endsWith(List<E> that) {
    reverse();
    that.reverse();
    return startsWith(that);
  }

  @Override
  public List<E> sublist(int i, int j) {
    var neueliste = new AL<E>();
    if(j>size()-i){          //Kürzer gemacht
      j = size()-i;
    }
    for(int a = 0;a<j;a++){
      neueliste.add(get(i));    //am Index i wird mit get i hinzugefügt
      i++;
    }
    return neueliste;
  }

  @Override
  public void sortBy(Comparator<? super E> cmp) {
   /* for(int Länge=0;Länge<size()-1;Länge++) {
      for (int erstestelle=0; erstestelle<size()-Länge-1; erstestelle++) {

        if (cmp.compare(get(erstestelle),get(erstestelle+1))>0){
          var e = store[erstestelle];
          store[erstestelle] = store[erstestelle+1];
          store[erstestelle+1] = e;
        }
      }
    }*/

    for(int i = size()-1; i > 0; i-- ){
      for(int j = 0; j < i; j++){
        if(cmp.compare(store[j], store[j+1]) > 0){ //store[j] > store[j+1]
          E Temp = store[j];
          store [j] = store[j+1];
          store[j+1] = Temp;
        }
      }
    }
  }

  public int size() {
    return size;
  }

  public E get(int i) {
    return store[i];
  }
}