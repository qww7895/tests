public class User {
	public String name;
	public String ID;
	public String PW;
	public boolean isManager;
	public int age;
	public int level;
	public static int index;//사원 번호
	User(){}
	User(String name,String ID,String PW,boolean isManager,int age,int level,int index){
		//name ID PW isManager age level index
		setName(name);
		setID(ID);
		setPW(PW);
		setIsManager(isManager);
		setAge(age);
		setLevel(level);
		setIndex(index);
	}
	public static int getIndex() {
		return index;
	}
	public static void setIndex(int index) {
		User.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public boolean isManager() {
		return isManager;
	}
	public void setIsManager(boolean isManager) {
		this.isManager=isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
