package c.impl;

import c.inheritance.MemberDTO;

public abstract class MemberManagerAbstract {

	public abstract boolean addMember(MemberDTO member);
	public abstract boolean removeMember(String name, String phone);
	public abstract boolean updateMember(MemberDTO member);
	public boolean test(String name) {
		return false;
	}
	public void printLog(String data) {
		System.out.println("Data="+data);
	}

	/*
	public final void printLog(String data) {
		System.out.println("Data="+data);
	}
	*/
}
