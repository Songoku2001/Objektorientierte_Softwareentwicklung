package WS2021.Array_und_Vererbung;

public final class MoreSimpleArrayFuns {

  private MoreSimpleArrayFuns() {
  }

  static int firstIndex(int[] xs,int y){
    for (int z = 0; z<xs.length; z++)                    //welcher Index y hat
      if(xs[z]==y){
        return z;
      }
    return -1;
  }
  static boolean startsWith(int[] prefix, int[] xs) {

    if(xs.length==0 && prefix.length ==0){
      return true;
    }
    for (int i=0;i<xs.length;i++)
      if (prefix[i] == xs[i]) {
        {
          return true;
        }
      }return false;
  }
  static void replace(int[] xs, int oldI, int newI){
    for (int x = 0; x<xs.length;x++){
      if (xs[x]==oldI){
        xs[x] = newI;
      }
    }
  }
  static void reverse(int[] xs){
    int anzahl = xs.length;
    for(int i = 0; i<anzahl/2; i++){
      int b = xs[i];
      xs[i] = xs[anzahl -i-1];
      xs[anzahl -i-1] = b;
    }
  }
  static int[] getSubArray(int[] xs, int startIndex, int length) {
    int[] zweiterarray;
    if (length > xs.length - startIndex) {
      zweiterarray = new int[xs.length - startIndex];
    } else {
      zweiterarray = new int[length];
    }
    for(int i=0;i<zweiterarray.length;i++){
      zweiterarray[i] = xs[startIndex];
      startIndex++;
    }
    return zweiterarray;
  }
}
