package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		for (int i = 0; i < 3; i++) {
			list.add(new Board());
			list.get(i).setTitle("제목" + (i + 1));
			list.get(i).setContent("내용" + (i + 1));
		}
		return list;
	}
}
