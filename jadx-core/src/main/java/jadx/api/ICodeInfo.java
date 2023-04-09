package jadx.api;

import jadx.api.impl.SimpleCodeInfo;
import jadx.api.metadata.ICodeMetadata;

import java.util.Map;

public interface ICodeInfo {

	ICodeInfo EMPTY = new SimpleCodeInfo("");

	String getCodeStr();

	Map<String, String> getMethodMap();

	ICodeMetadata getCodeMetadata();

	boolean hasMetadata();
}
