package WS2021.Java_Helpdesk.Listen;

import List;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java_Code {

    // Die Listenklasse AL implementiert das Interface List
// und damit auch alle dazugehörigen Methoden
    public class AL<E> implements List<E> {
        // Erstellung des Listenarrays vom Objekttypen "E"
        // mit dem Inhalt von 5 (noch) leeren Elementen
        protected E[] store = (E[]) new Object[5];
        protected int size = 0;

        public AL(E... es) {
            for (E e : es)
                add(e);
        }
        // Methode zum Anlegen eines neuen "store"-Arrays für den Fall,
// dass die bisherige Größe nicht mehr ausreichend ist
        private void mkNewStore() {
            // Anlegen des neuen Arrays um 5 größer als das alte Array
            E[] newStore = (E[]) new Object[size + 5];
            // "Full copy" der Werte des alten Arrays ins neue Array
            for (int i = 0; i < store.length; i++)
                // an jeder Stelle im Array wird der Wert einzeln übergeben
                newStore[i] = store[i];
            store = newStore;
        }

        public void add(E e) {
            // Prüfung, ob das Array noch lang genug ist
            // wenn nein, neues store-Array anlegen durch mkNewStore()
            if (store.length <= size)
                mkNewStore();
            // An der ersten Position hinter "size" im Array den Wert eintragen
            store[size++] = e;  //"size" ist die Arraylänge "size++" demnach size+1
        }

        // "Getter" der "size" Variable
        public int size() {
            return size;
        }

        // "Getter" des Wertes in Store an Position [i]
        public E get(int i) {
            return store[i];
        }

        @Override
        public void addAll(List<E> cs) {
            // Für jedes Element im Array cs
            for (int i = 0; i < cs.size(); i++) {
            /* cs.get[i] holt den Wert aus dem Array an der aktuellen Position
            in den Speicher. Die "add()" Methode wird aufgerufen und scrhreibt
            das jeweilige Element in unsere neue Liste */
                add(cs.get(i));
            }
        }

        @Override
        public void remove(int i) {
            // Datenürpfung auf ungültige Werte. Eine Liste kann keine negative
            // Länge haben oder Elemente außerhalb ihrer "size" schreiben.
            if (i < 0 || i >= size()) return;
            // Jedes Element wird AB der Position "i" aufwärts um einen Eintrag
            // nach vorne verschoben. Der zu entfernende Wert wird so überschrieben
            for (int j = i; j < size()-1; j++) {
                store[j] = store[j+1];
            }
            // Länge unserer Liste in der Kontrollvariable um 1 dekrementieren
            size--;
        }

        @Override
        public void insert(int i, E e) {
            // Datenprüfung: An negativen Positionen kann nichts eingefügt werden
            if (i < 0) {
                return;
            }
            // Bei legalen Einträgen wird die "add()" Methode ausgeführt
            if (i >= size()) {
                add(e);
                return;
            }
            // Wenn das Array zu kurz wäre, wird zuerst ein neues angelegt
            if (size() >= store.length) {
                mkNewStore();
            }
            // Wenn alle Eventualitäten abgeprüft wurden, wird der Wert an der
            // Stelle "i" eingefügt und alle Werte dahinter um 1 verschoben
            for (int j = size(); j > i; j--) {
                store[j] = store[j-1];
            }
            store[i] = e;
            // Da Array nun um 1 größer als vorger, Variable erhöhen
            size++;
        }

        @Override
        // Prüft, ob ein Wert im Array vorhanden ist
        public boolean contains(E e) {
            for (int i = 0 ; i < size; i++) {
                // Für jeden Wert wird die Überprüfung ausgeführt
                // Wenn WERTEGLEICHHEIT!!! vorliegt, wird true zurückgegeben
                if (store[i].equals(e)) return true;
            }
            // Wenn Bedingung nicht erfüllt wird, dann wird false zurückgegeben
            return false;
        }

        @Override
        public boolean containsWith(Predicate<E> pred) {
            // Für jeden Wert wird die Überprüfung ausgeführt
            for (int i = 0; i < size(); i++) {
                // wenn das übergebene "predicate" durch die Test-Methode gefunden
                // wurde, wird true zurückgegeben
                if (pred.test(get(i))) return true; // ähnlich wie Z. 106
            }
            // Wenn Bedingung nicht erfüllt wird, dann wird false zurückgegeben
            return false;
        }

        @Override
        public void reverse() {
            // Die erste HÄLFTE des Arrays wird durchlaufen
            for(int i = 0; i < size()/2; i++){
                // Der aktuelle Wert wird in "e" geschrieben
                E e = store[i];
                // an der gegenüberliegenden Stelle im Array wird der Wert eingefügt
                store[i] = store[size() -i -1];
                // Der zuvor gespeicehrte Wert wird aus "e" wird an der
                // bereits getauschten Stelle wieder eingefügt
                store[size() -i -1] = e;
            }
        }

        @Override
        public void forEach(Consumer<? super E> consumer) {
            for (int i = 0; i < size(); i++) {
                // Für jedes Element im Array wird mit dem übergebenen "cunsumer"
                // Element die "accept()" Methode mit Wert an der Pos "i" durchlaufen
                consumer.accept(get(i));
            }
        }

        @Override
        public boolean startsWith(List<E> that) {
            // Datenprüfung: sofern Wertebereich nicht eingehalten wird -> false
            if (that.size() > size()) return false;
            for (int i = 0; i < that.size(); i++) {
                // wenn Elemente ungleich -> false, wenn gleich -> true
                if (that.get(i) != get(i)) return false;
            }
            return true;
        }

        @Override
        // Überprüft, ob das übergebene Element das letzte im Array ist
        public boolean endsWith(List<E> that) {
            return false;
        }

        @Override
        public List<E> sublist(int i, int l) {
            // Anlegen einer neuen Liste
            AL<E> result = new AL<E>();
            // Für jede Position der Subliste wird der Wert aus der
            // ursprünglichen Liste übergeben
            for(int j = 0; j < l; j++, i++) {
                result.add(store[i]);
            }
            // Returnstatement wird durch das Zurückgeben der Liste erfüllt
            return result;
        }

    /*
    Methodenblock für einen richtigen Methodenkopf!:
    E[] result = (E[]) new Object[l];
        if(l > store.length-i) {
        result = (E[]) new Object[store.length-1];
    }
        for(int j = 0; j < l; j++, i++) {
        result[j] = store[i];
    }
        return result;
     */

        @Override
        public void sortBy(Comparator<? super E> cmp) {

            //lambda funktion zum testen (nicht bauen), funktion compare wird hier benötigt,
        }
    }

}
