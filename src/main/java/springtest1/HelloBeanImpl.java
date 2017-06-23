package springtest1;

public class HelloBeanImpl implements HelloBean{
	private String title;
	private String message;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void hello(){
		System.out.println("hello from HelloBeanImpl");
		System.out.println(this.getTitle());
		System.out.println(this.getMessage());
	}
}
