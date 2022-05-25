package controllers;

import models.MainModel;

import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import models.Group;
import models.Student;
import views.MainFrame;
import java.util.Vector;

public class MainController {
  MainFrame mainFrame;
  MainModel mainModel;
  JComboBox<String> groupComboBox;
  DefaultComboBoxModel<String> defaultGroupModel;
  
  public MainController() {
    this.mainFrame = new MainFrame();
    this.mainModel = new MainModel();
    this.defaultGroupModel = this.mainFrame.defaultGroupModel;

    Vector<Group> groupList = this.mainModel.groupList;
    groupList.forEach(group -> {
      defaultGroupModel.addElement(group.name);
    });

    this.setEvents();
  }

  private void handleComboBoxAction() {
    Vector<Student> studentList = this.mainModel.studentList;
    int index = groupComboBox.getSelectedIndex();
    int groupId = index + 1;
    studentList.forEach(student -> {
      if (groupId == student.groupId) {
        System.out.println(student.groupId);
      }
    });
  }

  private void setEvents() {

    groupComboBox = this.mainFrame.groupComboBox;

    groupComboBox.addActionListener(action -> handleComboBoxAction());
  }
}