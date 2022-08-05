package com.shivam.RestfulUsingPost.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;


public class ResponsePojo {

	private int status;
	    private String statusMessage;
	    private List<Integer> result;
		
//	    public ResponsePojo() {
//			super();
//			// TODO Auto-generated constructor stub
//		}

		public ResponsePojo(int status, String statusMessage, List<Integer> result) {
			super();
			this.status = status;
			this.statusMessage = statusMessage;
			this.result = result;
		}

		public ResponsePojo(HttpStatus valueOf, String statusMessage2, Object result2) {
			// TODO Auto-generated constructor stub
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public String getStatusMessage() {
			return statusMessage;
		}

		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}

		public List<Integer> getResult() {
			return result;
		}

		public void setResult(List<Integer> result) {
			this.result = result;
		}

		@Override
		public String toString() {
			return "ResponsePojo [status=" + status + ", statusMessage=" + statusMessage + ", result=" + result + "]";
		}

	

		

		
	    

	 
	    
	    
}
