package ra.run;

import ra.config.Config;
import ra.controller.SingerController;
import ra.controller.SongController;
import ra.model.Singer;
import ra.model.Song;
import ra.service.SingerService;
import ra.service.SongService;

import java.util.Scanner;

public class MusicManagement {
    SingerController singerController = new SingerController();
    SongController songController = new SongController();
    static SingerService singerService = new SingerService();
    static SongService songService = new SongService();

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("***********************MUSIC-MANAGEMENT*************************");
            System.out.println("1.Quản lí ca sĩ");
            System.out.println("2.Quản lí bài hát");
            System.out.println("3.Tìm kiếm bài hát");
            System.out.println("4.Thoát");
            int choice = Config.scanner().nextInt();
            switch (choice) {
                case 1:
                    singerManagement();
                    break;
                case 2:
                    songManagement();
                    break;
                case 3:
                    searchManagement();
                    break;
                case 4:
                    System.exit(0);

            }
        }
    }

    public static void singerManagement() {
        SingerController singerController = new SingerController();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("**********************SINGER-MANAGEMENT*************************");
            System.out.println("1.Nhập số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2. Hiển thị danh sách tất cả ca sĩ đã lưu trữ ");
            System.out.println("3. Chỉnh sửa danh mục");
            System.out.println("4. Xóa ca sĩ theo mã id ");
            System.out.println("5.Thoát");
            choice = Config.scanner().nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng ca sĩ cần thêm: ");
                    int numberOfSingers = Config.scanner().nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < numberOfSingers; i++) {
                        Singer singer = new Singer();
                        singer.inputData();
                        singerController.addSinger(singer);
                    }
                    break;
                case 2:

                    break;

                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }



    public static void songManagement() {
        SongController songController = new SongController();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("**********************SONG-MANAGEMENT*************************");
            System.out.println("1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2.Hiển thị danh sách tất cả bài hát đã lưu trữ");
            System.out.println("3.Thay đổi thông tin bài hát theo mã id ");
            System.out.println("4.Xóa bài hát theo mã id");
            System.out.println("5.Thoát ");
            choice = Config.scanner().nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng bài hát cần thêm: ");
                    int numberOfSongs = Config.scanner().nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < numberOfSongs; i++) {
                        Song song = new Song();
                        song.inputData();
                        songController.addSong();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }

    public static void searchManagement() {
        int choice = 0;
        while (choice != 5) {
            System.out.println("**********************SEARCH-MANAGEMENT*************************");
            System.out.println("1.Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại . ");
            System.out.println("2.Tìm kiếm ca sĩ theo tên hoặc thể loại");
            System.out.println("3.Hiển thị danh sách bài hát theo thứ tự tên tăng dần");
            System.out.println("4.Hiển thị 10 bài hát được đăng mới nhất ");
            System.out.println("5.Thoát ");
            choice = Config.scanner().nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }
}
