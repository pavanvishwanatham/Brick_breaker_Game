import javax.swing.JFrame; 
public class Main_class {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		Gameplay game = new Gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("BRICK BREAKER");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(game);
		
		
	}

}
