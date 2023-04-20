package com.sk;

public class StringImpl implements StringCustom {

	@Override
	public String removeFirst(String str) {
		// TODO Auto-generated method stub
		return str.substring(1,str.length());
	}

	@Override
	public String removeLast(String str) {
		// TODO Auto-generated method stub
		return str.substring(0,str.length() - 1);
	}

}
