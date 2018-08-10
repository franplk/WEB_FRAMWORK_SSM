/**
 * 
 */
package com.web.backend.common.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Spring的HttpMessageConvertor
 * 
 * @author franp
 */
public class SpringJsonMapper extends ObjectMapper {

	private static final long serialVersionUID = 1L;

	public SpringJsonMapper() {
		super();
		// 接收的参数忽略多余的属性
		this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		// null值输出为空字符串""
		this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
			@Override
			public void serialize(Object arg0, JsonGenerator arg1, SerializerProvider arg2) throws IOException {
				arg1.writeString("");
			}
		});
	}
}
