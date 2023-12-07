import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JFrame;

public class LMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private LayoutManager layoutManager;
	private LMenuBar menuBar;
	private LMainPanel mainPanel;
	//private LDirectory directory;
	
	public LMainFrame() {
		//set attributes 
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocation(520,100);
		
		//component manager
		this.layoutManager = new BorderLayout();
		this.setLayout(layoutManager);
		
		//components
		this.menuBar = new LMenuBar();
		this.add(this.menuBar,BorderLayout.NORTH);
		this.mainPanel = new LMainPanel();
		this.add(this.mainPanel,BorderLayout.CENTER);
		
		//this.directory = new LDirectory(); // 자식을 만들고
		//this.add(this.directory, BorderLayout.WEST); // 자식으로 등록한다.
		//directory.setPreferredSize(new Dimension(100, 200));
	}
}
