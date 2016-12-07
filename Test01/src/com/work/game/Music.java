package com.work.game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Music {	
		public AudioClip getAudio(String path){
			AudioClip audio =null;
			File file = new File(path);
			URI uri;
			URL url;
			uri=file.toURI();
			try {
				url=uri.toURL();
				audio = Applet.newAudioClip(url);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			return audio;	
		}
}
