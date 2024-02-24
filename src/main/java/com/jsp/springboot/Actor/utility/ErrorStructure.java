package com.jsp.springboot.Actor.utility;

public class ErrorStructure<T> {
        private int stetusCode;
        private String errormessage;
        private T errorData;
        
		public int getStetusCode() {
			return stetusCode;
		}
		public void setStetusCode(int stetusCode) {
			this.stetusCode = stetusCode;
		}
		public String getErrormessage() {
			return errormessage;
		}
		public void setErrormessage(String errormessage) {
			this.errormessage = errormessage;
		}
		public T getErrorData() {
			return errorData;
		}
		public void setErrorData(T errorData) {
			this.errorData = errorData;
		}
        
        
        
}
