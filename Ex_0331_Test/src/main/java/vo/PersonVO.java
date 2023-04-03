package vo;

public class PersonVO {
	private String name;
	private int age;
	private String tel;
	
	public PersonVO() {
		System.out.println("---PersonVO의 기본 생성자---");
	} // end of constructor

	public PersonVO(String name, int age, String tel) {
		System.out.println("---PersonVO의 오버로딩 생성자---" + name);
		this.name = name;
		this.age = age;
		this.tel = tel;
	} // end of constructor

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("이름 세팅됨 : " + name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("나이 세팅됨 : " + age);
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
		System.out.println("전화번호 세팅됨 : " + tel);
	}
	
} // end of class
