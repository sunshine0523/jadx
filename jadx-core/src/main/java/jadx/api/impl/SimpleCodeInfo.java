package jadx.api.impl;

import jadx.api.ICodeInfo;
import jadx.api.metadata.ICodeMetadata;

import java.util.Map;

public class SimpleCodeInfo implements ICodeInfo {

	private final String code;
	private Map<String, String> methodMap = null;

	public SimpleCodeInfo(String code) {
		this.code = code;
	}

	public SimpleCodeInfo(String code, Map<String, String> methodMap) {
		this.code = code;
		this.methodMap = methodMap;
	}

	@Override
	public String getCodeStr() {
		return code;
	}

	@Override
	public ICodeMetadata getCodeMetadata() {
		return ICodeMetadata.EMPTY;
	}

	@Override
	public Map<String, String> getMethodMap() {
		return methodMap;
	}

	@Override
	public boolean hasMetadata() {
		return false;
	}

	@Override
	public String toString() {
		return code;
	}
}
