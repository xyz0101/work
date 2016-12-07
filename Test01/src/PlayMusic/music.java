package PlayMusic;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JTextField;

public class music {
    int g;
    String b;
    AudioClip aau1;
    JTextField ss;
 
    public music(){
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
           aau1.play();//循环播放  aau.loop() 单曲 aau.stop()停止播放
           g=1;
            

          } catch (MalformedURLException e) {
           e.printStackTrace();
          }

         }
    
}