import java.awt.Color;
import java.io.File;

import javax.swing.JPanel;

public class LMainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private LDirectory directory;
	
	public LMainPanel() {
		//this.setBackground(Color.GRAY);
		this.directory = new LDirectory();
		this.add(this.directory);//���丮 ��ü�� �߰�
		//��� ���丮 ����
		
		directory.generateTree(".");//directory ��ü�� generateTree �޼��带 ȣ��
		//"."�� ���� ���丮�� ��Ÿ���� ���ڿ�. ���� ���丮�� ���� Ʈ���� �����ϰų� Ž��.
		
	}
}
