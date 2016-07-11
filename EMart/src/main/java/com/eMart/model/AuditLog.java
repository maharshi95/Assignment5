package com.eMart.model;

/**
 * Created by maharshigor on 11/07/16.
 */
public class AuditLog {

	private String url;
	private String ipAddress;
	private long timestamp;
	private int responseCode;
	private String data;

	public AuditLog() {

	}

	public AuditLog(String url, String ipAddress, long timestamp, int responseCode, String data) {
		this.url = url;
		this.ipAddress = ipAddress;
		this.timestamp = timestamp;
		this.responseCode = responseCode;
		this.data = data;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}