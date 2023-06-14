package ra.service;

import ra.model.Singer;

import java.util.ArrayList;
import java.util.List;

public class SingerService {
    private List<Singer> singers;

    public SingerService() {
        singers = new ArrayList<>();
    }

    public List<Singer> getSingers() {
        return singers;
    }

    public void addSinger(Singer singer) {
        singers.add(singer);
    }

    public void updateSinger(Singer singer) {
        // Kiểm tra xem ca sĩ có tồn tại trong danh sách hay không
        int index = -1;
        for (int i = 0; i < singers.size(); i++) {
            if (singers.get(i).getSingerId() == singer.getSingerId()) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            singers.set(index, singer);
        }
    }

    public void deleteSinger(int singerId) {
        // Kiểm tra xem ca sĩ có tồn tại trong danh sách hay không
        int index = -1;
        for (int i = 0; i < singers.size(); i++) {
            if (singers.get(i).getSingerId() == singerId) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            singers.remove(index);
        }
    }

    public Singer findSingerById(int singerId) {
        for (Singer singer : singers) {
            if (singer.getSingerId() == singerId) {
                return singer;
            }
        }
        return null;
    }

    public boolean validateSingerId(int singerId) {
        for (Singer singer : singers) {
            if (singer.getSingerId() == singerId) {
                return false; // Trùng mã ca sĩ
            }
        }
        return true; // Không trùng mã ca sĩ
    }


}

