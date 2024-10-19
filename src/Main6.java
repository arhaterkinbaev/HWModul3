public class Main6 {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Айдар Әлібек");
        user.setEmail("aidar@example.com");
        user.setAddress("Абай көшесі, 10 үй");

        System.out.println("Имя: " + user.getName());
        System.out.println("Почта: " + user.getEmail());
        System.out.println("Адрес: " + user.getAddress());
    }
}

class User {
    private String name;
    private String email;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
