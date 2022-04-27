package spring.mybatis;

public class MemberDTO {
	String id, pw, name, phone, email, address;
	
	//다른 생성자가 없다면 기본 생성자 자동 정의
		//MemberDTO(){super();}
		//MemberDTO(String id){this.id= id;}
		
		//MemberDTO dto = new MemberDTO();
		//<bean id="dto" class="패키지명.MemberDTO" /> //이때 불러오는 생성자는 기본생성자.
		//따라서 만약 다른 생성자를 선언했다면 꼭 기본생성자를 함께 선언해줘야 함
	
	
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
