package springtest1;

public class HelloBean {
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
		System.out.println("hello from HelloBean");
		System.out.println(this.getTitle());
		System.out.println(this.getMessage());
	}
}
