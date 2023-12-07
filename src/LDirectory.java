import java.io.File;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class LDirectory extends JPanel {//LDirectory는 원래 패널임
	private static final long serialVersionUID = 1L;
	private JTree tree;

	public LDirectory() {
		tree = new JTree();// 생성자에서 JTree 초기화
		this.add(tree); // JTree를 패널에 추가
	}

	public void generateTree(String directoryName) {// generateTree라는 메서드를 정의
		File rootDirectory = new File(directoryName);
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("명지대학교");
		createNodes(rootNode, rootDirectory);
		tree.setModel(new javax.swing.tree.DefaultTreeModel(rootNode));
	}
	

	private void createNodes(DefaultMutableTreeNode node, File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files != null) {
				for (File subFile : files) {
					DefaultMutableTreeNode subNode = new DefaultMutableTreeNode(subFile.getName());
					node.add(subNode);
					createNodes(subNode, subFile); // 재귀적 호출
				}
			}
			
		}
	}
}