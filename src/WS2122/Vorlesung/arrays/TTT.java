class TTT{
  int[][] spielfeld = new int[3][3];
  boolean spielerEinsIstDran;

  public String toString(){
    var result = "\n";
    for (int[] row :spielfeld){
      for (int c:row){
        result = result + "|" + c;
      }
      result = result +"|\n";
      for (int c:row){
        result = result + "â€“â€“" ;
      }
      result = result +"\n";
    }
    return result;
  }

  void doMove(int r, int c){
    assert r>=0 && r<3 :"falsche Zeile";
    assert c>=0 && c<3 :"falsche Spalte";

    if (spielfeld[r][c] != 0) return;
    spielfeld[r][c] = spielerEinsIstDran?1:2;
    spielerEinsIstDran = !spielerEinsIstDran;
  }
}
