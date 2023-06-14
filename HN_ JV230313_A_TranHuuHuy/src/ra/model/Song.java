package ra.model;

import java.util.Date;
import java.util.Scanner;

public class Song {
    private String songId;
    private String songName;
    private String descriptions;
    private Singer singer;
    private String songWriter;
    private Date createdDate;
    private boolean songStatus;

    public Song() {
    }

    public Song(String songId, String songName, String descriptions, Singer singer, String songWriter, Date createdDate, boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin bài hát");
        System.out.print("Nhập mã bài hát (4 ký tự, bắt đầu bằng 'S'): ");
        String id = scanner.nextLine();
        if (id.length() != 4 || !id.startsWith("S")) {
            System.out.print("Mã bài hát không hợp lệ. Vui lòng nhập lại: ");
            id = scanner.nextLine();
        }
        songId = id;
        System.out.println("Tên bài hát");
        songName = scanner.nextLine();
        System.out.println("Mô tả bài hát ");
        descriptions = scanner.nextLine();
        System.out.println("Ca sĩ");
//        singer = scanner.nextLine();
        System.out.println("Nhập tên người sáng tác");
        songWriter = scanner.nextLine();

    }

    public void displayData() {
        System.out.println("Thông tin bài hát :");
        System.out.println("Mã bài hát: " + songId);
        System.out.println("Tên bài hát: " + songName);
        System.out.println("Mô tả bài hát: " + descriptions);
        System.out.println("Singer: " + singer.getSingerName());
        System.out.println("Người sáng tác: " + songWriter);
        System.out.println("Ngày tạo: " + createdDate);
        System.out.println("Trạng thái: " + songStatus);
    }
}
