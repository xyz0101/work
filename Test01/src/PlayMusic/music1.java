package PlayMusic;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JTextField;

public class music1 {
   public int g;
    String b;
    int i=0;
    public AudioClip aau1;
    JTextField ss;
 
    public music1(){
         //b=ss.getText().trim();System.out.println(b);
    }
    public void a(String u){
          try {
           //   b=ss.getText().trim();System.out.println(b);
            URL cb1;
           File f1 = new File(u);
         //  System.out.println("zhun"+b+"");
           cb1 = f1.toURL();
           
           aau1 = Applet.newAudioClip(cb1);
           aau1.play();//ѭ������  aau.loop() ���� aau.stop()ֹͣ����
          } catch (MalformedURLException e) {
           e.printStackTrace();
          }

         }
    
}