package com.google.gson.jehyeok;

import com.google.gson.deserializer.JsonDeserializationContext;
import com.google.gson.reflect.TypeToken;
import com.google.gson.serializer.JsonSerializationContext;
import com.google.gson.type.TypeAdapter;
import com.google.gson.type.TypeAdapterFactory;

public interface AdapterCreator {
	JsonDeserializationContext deserializationContext = null;
	JsonSerializationContext serializationContext = null;

	public TypeAdapter<?> getAdapter(TypeToken<?> typeToken);

	public TypeAdapter<Object> getAdapter(Class<? extends Object> class1);
	
	public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory skipPast, TypeToken<T> type);
}
