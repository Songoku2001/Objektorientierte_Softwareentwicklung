import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JPanel {
  JTextField fileName = new JTextField(25);
  JButton loadButton = new JButton("load");
  JButton saveButton = new JButton("save");
  JTextArea contentArea = new JTextArea(25,80);
  JLabel infoField = new JLabel("no info yet");
  JPanel buttonPanel = new JPanel();
  JPanel northPanel = new JPanel();
  public GUI() {
    buttonPanel.setLayout(new GridLayout());
    buttonPanel.add(loadButton);
    buttonPanel.add(saveButton);
    northPanel.setLayout(new BorderLayout());
    northPanel.add(fileName,BorderLayout.NORTH);
    northPanel.add(buttonPanel,BorderLayout.SOUTH);

    this.setLayout(new BorderLayout());
    this.add(northPanel,BorderLayout.NORTH);

    this.add(new JScrollPane(contentArea),BorderLayout.CENTER);
    this.add(infoField,BorderLayout.SOUTH);


    saveButton.addActionListener(e->{
      try {
        var out = new FileWriter(fileName.getText());
        var text = contentArea.getText();
        out.write(text);
        out.close();
      }catch (Exception ex) {
        infoField.setText(ex+"");
      }
    });
    loadButton.addActionListener(e->{
      try {
        Reader in = null;
        if (fileName.getText().startsWith("http")) {
          URLConnection connection = new URI(fileName.getText()).toURL().openConnection();
          var inputStream =connection.getInputStream();
          in = new InputStreamReader(inputStream);
        }else {
          in = new FileReader(fileName.getText());
        }
        var i=0;
        var contentResult = new StringBuffer();
        String line=null;
        var bin = new BufferedReader(in)
                ;				while ( (line=bin.readLine())!=null) {
          contentResult.append(line);
          contentResult.append("\n");

        }
				/*while ((i = in.read())>=0) {
					char c = (char)i;
					contentResult.append(c);
				}*/
        contentArea.setText(contentResult.toString());

      }catch (Exception ex) {
        infoField.setText(ex+"");
      }
    });
  }

  void showInFrame() {
    var f = new JFrame();
    f.add(this);
    f.pack();
    f.setVisible(true);
  }
  public static void main(String[] args) {
    new GUI().showInFrame();
  }
}