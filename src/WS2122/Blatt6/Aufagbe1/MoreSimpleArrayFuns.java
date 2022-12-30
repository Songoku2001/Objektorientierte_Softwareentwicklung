public final class MoreSimpleArrayFuns {

  private MoreSimpleArrayFuns() {
  }

  static int firstIndex(int[] xs,int y){
    for(int i=0; i<xs.length; i++){
      if (xs[i]==y){
        return i;
      }
    }
    return -1;
  }


  static boolean startsWith(int[] prefix, int[] xs){
    if (prefix.length > xs.length){
      return false;
    }

    for(int i=0; i<prefix.length; i++){
      if (xs[i] != prefix[i]){
        return false;
      }
    }

    return true;
  }


  static void replace(int[] xs, int oldI, int newI){

    for (int i=0; i<xs.length; i++){
      if (xs[i] == oldI){
        xs[i] = newI;
      }
    }
  }


  static void reverse(int[] xs){

    for (int i=0; i<xs.length/2; i++){
      int speicher = xs[xs.length-1-i];
      xs[xs.length-1-i] = xs[i];
      xs[i] = speicher;

    }
  }


  static int[] getSubArray(int[] xs, int startIndex, int length){
    int[] newxs;
    if(length>xs.length){
      newxs = new int[xs.length];
    }else {
      newxs = new int[length];
    }

    for(int i=0; i<newxs.length; i++){
      newxs[i] = xs[startIndex + i];
    }
    return newxs;
  }
}