import java.awt.Color;
import java.io.File;

import javax.swing.JPanel;

public class LMainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private LDirectory directory;
	
	public LMainPanel() {
		//this.setBackground(Color.GRAY);
		this.directory = new LDirectory();
		this.add(this.directory);//디렉토리 객체를 추가
		//대상 디렉토리 설정
		
		directory.generateTree(".");//directory 객체의 generateTree 메서드를 호출
		//"."는 현재 디렉토리를 나타내는 문자열. 현재 디렉토리의 파일 트리를 생성하거나 탐색.
		
	}
}
