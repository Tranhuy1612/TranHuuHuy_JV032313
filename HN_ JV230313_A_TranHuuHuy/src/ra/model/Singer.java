package ra.model;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Singer {
    private int singerId;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;

    public Singer() {
    }

    public Singer(int singerId, String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin của ca sĩ:");
        System.out.print("Tên ca sĩ: ");
        singerName = scanner.nextLine();
        System.out.print("Tuổi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("Quốc tịch: ");
        nationality = scanner.nextLine();
        System.out.print("Giới tính (Nam/Nữ): ");
        String genderInput = scanner.nextLine();
        gender = genderInput.equalsIgnoreCase("Nam");
        System.out.print("Thể loại: ");
        genre = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Thông tin ca sĩ");
        System.out.println("Mã ca sĩ " + singerId);
        System.out.println("Tên ca sĩ " + singerName);
        System.out.println("Tuổi" + age);
        System.out.println("Quốc tịch" + nationality);
        System.out.println("Giới tính" + (gender ? "nam" : "nữ"));
        System.out.println("Thể loại" + genre);
    }


    public class SingerRepository {
        private List<Singer> singers;

        public SingerRepository() {
            this.singers = new ArrayList<>();
        }

        public void addSinger(Singer singer) {
            singers.add(singer);
        }

        public List<Singer> getAllSingers() {
            return singers;
        }
    }
}
