package logicaDeNegocios;

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




import com.ibm.watson.developer_cloud.language_translation.v2.*;
import com.ibm.watson.developer_cloud.language_translation.v2.model.*;




public class Translator {
			
	
	
	 public String traducir(String pTraducir) throws ServletException, IOException{
		 LanguageTranslation s2t = new LanguageTranslation();
		 s2t.setUsernameAndPassword("530d13fa-6704-4726-9746-1ecf04378ee0",  "86pyvyALNnQI");
	   TranslationResult result = s2t.translate(pTraducir,Language.SPANISH, Language.ENGLISH)
			   .execute();
			   String lineaTraducida=result.getTranslations().get(0).getTranslation().toString();
	   System.out.println(lineaTraducida);
	   return lineaTraducida;
	   
	 }

	/* public static void main(String[] args) throws ServletException, IOException {
		 Translator s2t=new Translator();
		 s2t.traducir("obligaciones del personal del laboratorio");
	}
	 */


}

