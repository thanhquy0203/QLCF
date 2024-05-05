package app;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

public class NguyenLieu_app extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel sideMenu;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JButton btnNewButton;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NguyenLieu_app frame = new NguyenLieu_app();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NguyenLieu_app() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1435, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon imageIcon = new ImageIcon(ThanhToan.class.getResource("/image/logo1.jpg"));
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(368, 239,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 1646, 868);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		sideMenu = new JPanel();
		sideMenu.setBorder(null);
		sideMenu.setBackground(new Color(128, 128, 128));
		sideMenu.setBounds(0, 69, 388, 799);
		panel_1.add(sideMenu);
		sideMenu.setLayout(null);
		
		JPanel body = new JPanel();
		body.setBorder(null);
		body.setBackground(Color.DARK_GRAY);
		body.setBounds(0, 261, 388, 326);
		sideMenu.add(body);
		body.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("  Bán hàng");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(0, 11, 388, 52);
		body.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("  Thêm nước");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(0, 74, 388, 52);
		body.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("  Hóa đơn");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(0, 137, 388, 52);
		body.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("  Khách hàng");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(0, 200, 388, 52);
		body.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("  Nguyên liệu");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(Color.GRAY);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(0, 263, 388, 52);
		body.add(lblNewLabel_6);
		
		JPanel foot = new JPanel();
		foot.setBorder(null);
		foot.setBackground(Color.DARK_GRAY);
		foot.setBounds(0, 587, 388, 89);
		sideMenu.add(foot);
		foot.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("  Đăng xuất");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Login.main(null);
			}
		});
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBackground(Color.GRAY);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(0, 13, 388, 65);
		foot.add(lblNewLabel_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, -19, 388, 21);
		foot.add(separator);
		separator.setOpaque(true);
		separator.setBackground(Color.BLACK);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 368, 239);
		sideMenu.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(imageIcon);
		lblNewLabel.setBounds(0, 0, 368, 239);
		panel_2.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 1646, 69);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Quán cà phê abc");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setBounds(10, 11, 1626, 45);
		panel.add(lblNewLabel_8);
		
		panel_2 = new JPanel();
		panel_2.setBounds(388, 69, 298, 675);
		panel_2.setBackground(new Color(212, 212, 212));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Mã nguyên liệu :");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(10, 11, 135, 29);
		panel_2.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(10, 51, 278, 29);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Tên nguyên liệu :");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setBounds(10, 91, 135, 29);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Số lượng");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_12.setBounds(10, 171, 135, 29);
		panel_2.add(lblNewLabel_12);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(10, 131, 278, 29);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBounds(10, 211, 278, 29);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("Cập nhật");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setOpaque(true);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(10, 584, 278, 80);
		panel_2.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(696, 80, 723, 664);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
	
	//phương thức đóng menu
	protected void closeMenuBar() {
		int width = 228;
		int height = 763;
		for (Component component : panel_2.getComponents()) {
	        component.setEnabled(true);
		}
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = width;i>0;i--) {
					sideMenu.setSize(i,height);
					btnNewButton.setEnabled(true);
					try {
						Thread.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}).start();
		
	}
}