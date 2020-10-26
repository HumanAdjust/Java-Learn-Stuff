package gsm;

public class BookDTO {
	// 1. 정보은닉
	public String title;
	public String name;
	public int price;
	public int page;
	
	// 2. 디폴트생성자메서드를 명시적으로 만들 것
	public BookDTO() {}
	
	// 생성자 overloading	
	public BookDTO(String title, String name, int price, int page) {
		this.title=title;
		this.name=name;
		this.price=price;
		this.page=page;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	// 여기에는 보이지 않지만 생략된 메서드가 있다 -> toString

	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", name=" + name + ", price=" + price + ", page=" + page + "]";
	}
	
		
}
