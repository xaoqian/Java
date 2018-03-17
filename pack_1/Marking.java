import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.Collections;

public class Marking{
    public static void main(String args[]){
    }
}
class Paragraph {
    public Paragraph(){
        Paragraph paragraph = new Paragraph(Collections.singletonList(
                new Strong(Arrays.asList(
                        new Text("1"),
                        new Strikeout(Arrays.asList(
                                new Text("2"),
                                new Emphasis(Arrays.asList(
                                        new Text("3"),
                                        new Text("4")
                                )),
                                new Text("5")
                        )),
                        new Text("6")
                ))
        ));

    }

class Text {
    public Text(){
       Text text = new Text(Collections.singletonList(
               String text = "" ;
               long beginTime = System.currentTimeMillis();
               for ( int i= 0 ;i< 10000 ;i++)
                   text = text + i;
               long endTime = System.currentTimeMillis();
               System.out.println(endTime-beginTime);

               StringBuilder sb = new StringBuilder ( "" );
               beginTime = System.currentTimeMillis();
               for ( int i= 0 ;i< 10000 ;i++)
               sb.append(String.valueOf(i));
               endTime = System.currentTimeMillis();
               System.out.println(endTime-beginTime);

    }
}


class Emphasis{
    public Emphasis(){
                MouseListener clickListener = new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent me) {
                    }
                };

                Box box = Box.createVerticalBox();
                box.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                for ( int i = 0; i < 3; ++i ) {
                    JTextField tf = new JTextField(i + 1);
                    tf.addMouseListener(clickListener);
                    box.add(tf);
                }

                JFrame mainFrame = new JFrame();
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainFrame.add(box);
                mainFrame.pack();
                mainFrame.setVisible(true);
            }

            public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable(){
                    @Override
                    public void run() {
                        new Emphasis();

                    }
                });
            }
        }
class Strong{
     private String temp;{
     this.temp = temp + "_";
     Strong toUnderline = new Strong();
     System.out.println(toUnderline.temp);
     }
}


class Strikeout {
        private String temp;{
            this.temp = temp + "~";
            Strikeout toUnderline = new Strikeout();
            System.out.println(toUnderline.temp);
        }
    }

}




