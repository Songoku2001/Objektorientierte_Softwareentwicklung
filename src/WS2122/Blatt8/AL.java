import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AL<E> implements List<E> {
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
  public void addAll(List<E> cs){
    for(int i=0; i<cs.size(); i++){
      this.add(cs.get(i));
    }
  }

  @Override
  public void remove(int i){
    if(i>=size() || i<0) return;

    for (int j=i+1; j<size(); j++, i++){
      this.store[i] = this.store[j];
    }
    size--;
  }
  @Override
  public void insert(int i, E e) {
    if (i < 0) {return;}
    if (i > size() - 1) {
      add(e);
      return;
    }
    add(e);
    for (int j=size()-1; j>i; j--) {
      store[j] = store[j-1];
    }
    store[i]=e;

  }

  public static void main(String[] args) {
    AL<Integer> is = new AL<>(1,2,3,4,5);
    System.out.println(Arrays.toString(is.store));
    System.out.println("nach Insert: ");
    is.insert(3, 33);
    System.out.println(Arrays.toString(is.store));
  }
  @Override
  public boolean contains(E e){
    for (E element : this.store){
      if (e.equals(element)) {
        return true;
      }
    }
    return false;
  }
  @Override
  public boolean containsWith(Predicate<E> pred){
    for (int i=0; i<this.size(); i++){
      if (pred.test(this.get(i))){
        return true;
      }
    }
    return false;
  }
  @Override
  public void reverse(){
    for (int i=0; i<this.size()/2; i++){
      E speicher = this.get(i);
      this.store[i] = this.get(this.size()-1-i);
      this.store[this.size()-1-i] = speicher;
    }
  }
  @Override
  public void forEach(Consumer<? super E> consumer){
    for (int i=0; i<this.size(); i++){
      consumer.accept(this.get(i));
    }

  }
  @Override
  public boolean startsWith(List<E> that){
    if(that.size()>this.size()){
      return false;
    }
    for (int i=0; i< that.size(); i++){
      if (this.get(i) != that.get(i)){
        return false;
      }
    }
    return true;
  }
  @Override
  public boolean endsWith(List<E> that){
    if(that.size() > this.size()){
      return false;
    }
    this.reverse();
    that.reverse();
    return this.startsWith(that);

  }
  @Override
  public List<E> sublist(int i, int l){
    AL<E> res = new AL<>();

    if (size()<=l) {
      return this;
    }

    for (int j=i; j<i+l; j++){
      res.add(this.get(j));
    }

    return res;
  }
  @Override
  public void sortBy(Comparator<? super E> cmp){

    for (int i=0; i<this.size(); i++){

      for (int j=0; j<this.size()-1; j++){
        if (cmp.compare(this.get(j), this.get(j+1))>0){
          E speicher = this.get(j);
          this.store[j] = this.get(j+1);
          this.store[j+1] = speicher;
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