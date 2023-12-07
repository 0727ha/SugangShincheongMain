import java.io.File;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class LDirectory extends JPanel {//LDirectory�� ���� �г���
	private static final long serialVersionUID = 1L;
	private JTree tree;

	public LDirectory() {
		tree = new JTree();// �����ڿ��� JTree �ʱ�ȭ
		this.add(tree); // JTree�� �гο� �߰�
	}

	public void generateTree(String directoryName) {// generateTree��� �޼��带 ����
		File rootDirectory = new File(directoryName);
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("�������б�");
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
					createNodes(subNode, subFile); // ����� ȣ��
				}
			}
			
		}
	}
}