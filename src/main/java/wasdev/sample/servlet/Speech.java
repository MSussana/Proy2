package wasdev.sample.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.TargetDataLine;

//import org.apache.commons.io.FileUtils;

import com.ibm.watson.developer_cloud.http.HttpMediaType;
//import com.ibm.watson.developer_cloud.speech_to_text.v1.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechResults;
//import com.ibm.watson.developer_cloud.speech_to_text.v1.websocket.BaseRecognizeDelegate;
import com.ibm.watson.developer_cloud.util.CredentialUtils;

@WebServlet("/SimpleServlet")
public class Speech extends HttpServlet {
   
	 
	 
	 public String voz_a_texto(String pAudio) throws ServletException, IOException{
		SpeechToText s2t = new SpeechToText();
	   s2t.setUsernameAndPassword("fe0c1e3d-4bce-4310-b6e0-4c256e1b6f25", "LOrTEqJhjYSc");
	   File audio = new File("C:/Users/Sussana/Downloads/audio-file.wav");

	   SpeechResults transcript = s2t.recognize(audio).execute();
	   System.out.println(transcript);
	   //ystem.out.println(results.getResults().get(0).getAlternatives().get(0).getTranscript());
	   //return results.getResults().get(0).getAlternatives().get(0).getTranscript();
	return pAudio;
	   
	 }
 
	 public static void main(String[] args) throws ServletException, IOException {
		 Speech ss = new Speech();
		 ss.voz_a_texto("C:/Users/Sussana/Downloads/audio-file.wav");
	}
	 
 private static final long serialVersionUID = 1L;

}

