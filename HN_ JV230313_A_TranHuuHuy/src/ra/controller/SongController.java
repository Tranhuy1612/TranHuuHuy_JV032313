package ra.controller;

import ra.model.Singer;
import ra.model.Song;
import ra.service.SongService;

import java.util.Scanner;

public class SongController {
    private SongService songService;

    public SongController() {
        songService = new SongService();
    }

    public void addSong() {
        songService.addSong();
    }

    public void updateSong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã bài hát cần cập nhật: ");
        String songId = scanner.nextLine();
        songService.updateSong(songId);
    }

    public void deleteSong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã bài hát cần xóa: ");
        String songId = scanner.nextLine();
        songService.deleteSong(songId);
    }

    public void findSongById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã bài hát cần tìm: ");
        String songId = scanner.nextLine();
        Song song = songService.findSongById(songId);
        if (song != null) {
            song.displayData();
        } else {
            System.out.println("Không tìm thấy bài hát!");
        }
    }

    public void displayAllSongs() {
        songService.displayAllSongs();
    }

    public void validateSongData() {
        Scanner scanner = new Scanner(System.in);

        Song song = new Song();
        song.inputData();

        try {
            songService.validateData(song);
            System.out.println("Dữ liệu hợp lệ.");
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
