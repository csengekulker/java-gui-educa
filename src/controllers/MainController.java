package controllers;

import models.MainModel;

import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import models.Group;
import models.Student;
import views.MainFrame;

public class MainController {
  MainFrame mainFrame;
  MainModel mainModel;

  JComboBox<String> groupComboBox;
  DefaultComboBoxModel<String> defaultGroupModel;

  Vector<Group> groupList;
  Vector<Student> studentVector;
  
  public MainController() {
    this.mainFrame = new MainFrame();
    this.mainModel = new MainModel();

    // now mainFrame and mainModel exist
    groupComboBox = this.mainFrame.groupComboBox;
    defaultGroupModel = this.mainFrame.defaultGroupModel;
  
    studentVector = this.mainModel.studentVector;
    groupList = this.mainModel.groupList;


    groupList.forEach(group -> {
      defaultGroupModel.addElement(group.name);
    });

    this.setEvents();
  }

  private void handleComboBoxAction() {

    int index = groupComboBox.getSelectedIndex();
    int groupId = index;
    this.mainFrame.defaultListModel.clear();
    studentVector.forEach(student -> {
      if (groupId == student.groupId) {
        this.mainFrame.defaultListModel.addElement(student.name);
      }
    });
  }

  private void setEvents() {
    groupComboBox.addActionListener(action -> handleComboBoxAction());
  }
}