package ra.controller;

import ra.model.Singer;
import ra.service.SingerService;

import java.util.List;
import java.util.Scanner;

public class SingerController {
    private SingerService singerService;

    public SingerController() {
        singerService = new SingerService();
    }

    public void addSinger(Singer singer) {
        singerService.addSinger(singer);
    }

    public void updateSinger(Singer singer) {
        singerService.updateSinger(singer);
    }

    public void deleteSinger(int singerId) {
        singerService.deleteSinger(singerId);
    }

    public void findSingerById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã ca sĩ cần tìm: ");
        int singerId = scanner.nextInt();
        scanner.nextLine();

        Singer singer = singerService.findSingerById(singerId);
        if (singer != null) {
            System.out.println("Tên ca sĩ: " + singer.getSingerName());
        } else {
            System.out.println("Không tìm thấy ca sĩ!");
        }
    }

    public void validateSingerId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã ca sĩ cần kiểm tra: ");
        int singerId = scanner.nextInt();
        scanner.nextLine();

        boolean isValid = singerService.validateSingerId(singerId);
        if (isValid) {
            System.out.println("Mã ca sĩ hợp lệ.");
        } else {
            System.out.println("Mã ca sĩ đã tồn tại!");
        }
    }

}
