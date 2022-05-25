package views;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MainFrame extends JFrame {
  JPanel mainPanel;

  public DefaultComboBoxModel<String> defaultGroupModel;
  public JComboBox<String> groupComboBox;

  public DefaultListModel<String> defaultListModel;
  public JList<String> studentList;

  JScrollPane scrollPane;
  public MainFrame() {

    setComponents();
    setMainPanel();
    setFrame();
  }

  private void setComponents() {
    this.defaultGroupModel = new DefaultComboBoxModel<>();
    this.groupComboBox = new JComboBox<>(defaultGroupModel);

    this.defaultListModel = new DefaultListModel<>();
    this.studentList = new JList<>(defaultListModel);
    this.scrollPane = new JScrollPane(studentList);

  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();
    this.mainPanel.setLayout(new BorderLayout());

    this.mainPanel.add(groupComboBox, BorderLayout.NORTH);
    this.mainPanel.add(scrollPane, BorderLayout.CENTER);
    this.add(this.mainPanel);
  }

  private void setFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 300);
    this.setTitle("Student groups");
    this.setVisible(true);

    // layout for window
    this.setLayout(new FlowLayout());
  }
}