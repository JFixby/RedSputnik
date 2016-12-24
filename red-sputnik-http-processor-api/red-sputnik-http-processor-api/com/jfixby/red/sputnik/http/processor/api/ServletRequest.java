package com.jfixby.red.sputnik.http.processor.api;

import com.jfixby.scarabei.api.collections.Map;
import com.jfixby.scarabei.api.io.InputStream;

public interface ServletRequest {

	String getSessionID();

	Map<String, String> getRequestHeaders();

	InputStream getClientToServerStream();



}
