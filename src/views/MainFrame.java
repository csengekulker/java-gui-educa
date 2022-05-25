package views;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MainFrame extends JFrame {
  JPanel mainPanel;
  public DefaultComboBoxModel<String> defaultGroupModel;
  public JComboBox<String> groupComboBox;
  public MainFrame() {

    setComponents();
    setMainPanel();
    setFrame();
  }

  private void setComponents() {
    this.defaultGroupModel = new DefaultComboBoxModel<>();
    this.groupComboBox = new JComboBox<>(defaultGroupModel);

  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();

    this.mainPanel.setLayout(
      new BorderLayout()
    );

    this.mainPanel.add(groupComboBox);
    this.add(this.mainPanel);
  }

  private void setFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 300);
    this.setTitle("JAVA GUI TEMPLATE");
    this.setVisible(true);

    // layout for window
    this.setLayout(
      new FlowLayout(

      )
    );
  }
}