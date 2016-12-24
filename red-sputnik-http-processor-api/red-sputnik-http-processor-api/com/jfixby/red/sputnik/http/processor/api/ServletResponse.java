package com.jfixby.red.sputnik.http.processor.api;

import com.jfixby.scarabei.api.collections.Map;
import com.jfixby.scarabei.api.io.OutputStream;

public interface ServletResponse {

	OutputStream getServerToClientStream();

	Map<String, String> getResponseHeaders();

}
