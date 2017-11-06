package retailpayment;

import com.google.gson.Gson;
import java.io.UnsupportedEncodingException;    
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Toolbox {
	
	
	
	
	
	
	
	
	
	

	
	
	public String toJason(Object obj) {
		Gson gson = new Gson();

		// convert java object to JSON format
		String json = gson.toJson(obj);
		return json;
	}

}
