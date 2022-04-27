package edu.multi.kdigital;

public class MemberDTO {
	String id, pw, name, phone, email, address;
	
	//�ٸ� �����ڰ� ���ٸ� �⺻ ������ �ڵ� ����
	//MemberDTO(){super();}
	//MemberDTO(String id){this.id= id;}
	
	//MemberDTO dto = new MemberDTO();
	//<bean id="dto" class="��Ű����.MemberDTO" /> //�̶� �ҷ����� �����ڴ� �⺻������.
	//���� ���� �ٸ� �����ڸ� �����ߴٸ� �� �⺻�����ڸ� �Բ� ��������� ��

	
	public MemberDTO(){}
	
	public MemberDTO(String id, String password){
		this.id = id;
		this.pw = password;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String password) {
		this.pw = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", phone=" + phone + ", email="
				+ email + ", address=" + address + "]";
	}
	
	
	
}
