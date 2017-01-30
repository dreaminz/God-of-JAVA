package c.impl;

import c.inheritance.MemberDTO;

public interface MemberManagerInterface {
	public static int a=5;
	public boolean addMember(MemberDTO member);
	public boolean removeMember(String name, String phone);
	public boolean updateMember(MemberDTO member);
	
	
	
	
}
