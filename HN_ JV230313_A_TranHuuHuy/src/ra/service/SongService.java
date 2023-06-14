package ra.service;

import ra.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongService {
    private List<Song> songs;
    private SingerService singerService;

    public SongService() {
        songs = new ArrayList<>();
        singerService = new SingerService();
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong() {
        Song song = new Song();
        song.inputData();

        songs.add(song);
    }

    public void updateSong(String songId) {
        // Kiểm tra xem bài hát có tồn tại trong danh sách hay không
        int index = -1;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getSongId().equals(songId)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Song song = songs.get(index);
            song.inputData();
            songs.set(index, song);
        }
    }

    public void deleteSong(String songId) {
        // Kiểm tra xem bài hát có tồn tại trong danh sách hay không
        int index = -1;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getSongId().equals(songId)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            songs.remove(index);
        }
    }

    public Song findSongById(String songId) {
        for (Song song : songs) {
            if (song.getSongId().equals(songId)) {
                return song;
            }
        }
        return null;
    }

    public void displayAllSongs() {
        for (Song song : songs) {
            song.displayData();
            System.out.println("-----------------------");
        }
    }

    public void validateData(Song song) throws Exception {
        if (!song.getSongName().isEmpty()) {
            throw new Exception("Tên bài hát không được để trống!");
        }

        if (song.getSinger() == null) {
            throw new Exception("Vui lòng thêm ca sĩ trước khi thêm bài hát!");
        }
    }
}
