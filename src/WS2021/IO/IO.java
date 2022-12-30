package WS2021.IO;

import java.io.*;

public class IO{
  public static void convert(String inFile,String inEncoding,String outFile, String outEncoding) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(inFile),inEncoding));
    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile),outEncoding));
    for (String line=null; (line=in.readLine())!=null;) {
      //out.write(line); oder
      in.transferTo(out);
    }
    in.close();
    out.close();
  }
}