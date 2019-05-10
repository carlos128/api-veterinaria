package com.carlos.utilitis;

		public class Constans {
		// Spring Security
		public static final String LOGIN_URL = "/login";
		public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
		public static final String TOKEN_BEARER_PREFIX = "Bearer ";
		// JWT
		public static final String ISSUER_INFO = "https://www.autentia.com/";
		public static final String SUPER_SECRET_KEY = "1234";
		public static final long   TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day
		
		public static final String SECRET = "SecretKeyToGenJWTs";
		public static final long   EXPIRATION_TIME = 864_000_000; // 10 days
		public static final String TOKEN_PREFIX = "Bearer ";
		public static final String HEADER_STRING = "Authorization";
		
		
		public static final String  SIGN_UP_URL = "/v1/api/signup";
		public static final String  USUARIO_ID="/v1/api/usuario/{id}";
		
		public static final String  DOCTOR ="/v1/api/doctor" ;
		public static final String  DOCTOR_ID="/v1/api/doctor/{id}";
		
		public static final String  MASCOT="/v1/api/mascot";
		public static final String  MASCOT_ID="/v1/api/mascot/{id}";
		
		public static final String  OWNER="/v1/api/owner";
		public static final String  OWNER_ID="/v1/api/owner/{id}";
		
		public static final String  HISTORIALMEDICAL="/v1/api/history-medical";
		public static final String  HISTORIALMEDICAL_ID="v1/api/history-medical/{id}";
		 

}
