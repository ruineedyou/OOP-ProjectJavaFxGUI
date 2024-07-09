package com.example.BroFreshAndClean;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI {
    private JFrame frame;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField streetField;
    private JTextField cityField;
    private JTextField stateField;
    private JTextField zipField;
    private JTextField phoneField;
    private JTextField carPlateField;
    private JTextField workerNameField;
    private JTextField workerIDField;
    private JCheckBox rainCoatingCheckBox;
    private JCheckBox fullWaxInteriorCheckBox;
    private JCheckBox fullWaxExteriorCheckBox;
    private JTextField startTimeField;
    private JTextField endTimeField;
    private JTextField statusField;

    public GUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bro Fresh And Clean");

        JPanel clientPanel = createClientPanel();
        JPanel workerPanel = createWorkerPanel();
        JPanel washOptionsPanel = createWashOptionsPanel();
        JPanel sessionPanel = createSessionPanel();
        JButton submitButton = createSubmitButton();

        frame.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 1));

        JPanel topCenterPanel = new JPanel();
        topCenterPanel.setLayout(new GridLayout(1, 2));
        topCenterPanel.add(workerPanel);
        topCenterPanel.add(washOptionsPanel);

        centerPanel.add(topCenterPanel);
        centerPanel.add(sessionPanel);

        frame.add(clientPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(submitButton, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    private JPanel createClientPanel() {
        JPanel clientPanel = new JPanel();
        clientPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        clientPanel.setLayout(new BorderLayout());

        JLabel clientLabel = new JLabel("Client Information");
        clientLabel.setFont(new Font("Arial", Font.BOLD, 16));
        clientPanel.add(clientLabel, BorderLayout.NORTH);

        JPanel clientInfoPanel = new JPanel();
        clientInfoPanel.setLayout(new GridLayout(0, 2));

        clientInfoPanel.add(new JLabel("Enter client first name:"));
        firstNameField = new JTextField();
        clientInfoPanel.add(firstNameField);

        clientInfoPanel.add(new JLabel("Enter client last name:"));
        lastNameField = new JTextField();
        clientInfoPanel.add(lastNameField);

        clientInfoPanel.add(new JLabel("Enter client street:"));
        streetField = new JTextField();
        clientInfoPanel.add(streetField);

        clientInfoPanel.add(new JLabel("Enter client city:"));
        cityField = new JTextField();
        clientInfoPanel.add(cityField);

        clientInfoPanel.add(new JLabel("Enter client state:"));
        stateField = new JTextField();
        clientInfoPanel.add(stateField);

        clientInfoPanel.add(new JLabel("Enter client zip:"));
        zipField = new JTextField();
        clientInfoPanel.add(zipField);

        clientInfoPanel.add(new JLabel("Enter client phone number:"));
        phoneField = new JTextField();
        clientInfoPanel.add(phoneField);

        clientInfoPanel.add(new JLabel("Enter client car plate number:"));
        carPlateField = new JTextField();
        clientInfoPanel.add(carPlateField);

        clientPanel.add(clientInfoPanel, BorderLayout.CENTER);

        return clientPanel;
    }

    private JPanel createWorkerPanel() {
        JPanel workerPanel = new JPanel();
        workerPanel.setLayout(new BorderLayout());

        JLabel workerLabel = new JLabel("Worker Information");
        workerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        workerPanel.add(workerLabel, BorderLayout.NORTH);

        JPanel workerInfoPanel = new JPanel();
        workerInfoPanel.setLayout(new GridLayout(0, 2));

        workerInfoPanel.add(new JLabel("Enter worker name for basic wash:"));
        workerNameField = new JTextField();
        workerInfoPanel.add(workerNameField);

        workerInfoPanel.add(new JLabel("Enter worker ID for basic wash:"));
        workerIDField = new JTextField();
        workerInfoPanel.add(workerIDField);

        workerPanel.add(workerInfoPanel, BorderLayout.CENTER);

        return workerPanel;
    }

    private JPanel createWashOptionsPanel() {
        JPanel washOptionsPanel = new JPanel();
        washOptionsPanel.setLayout(new GridLayout(0, 2));

        washOptionsPanel.add(new JLabel("Do you want to add rain coating? (yes/no)"));
        rainCoatingCheckBox = new JCheckBox();
        washOptionsPanel.add(rainCoatingCheckBox);

        washOptionsPanel.add(new JLabel("Do you want full wax interior? (yes/no)"));
        fullWaxInteriorCheckBox = new JCheckBox();
        washOptionsPanel.add(fullWaxInteriorCheckBox);

        washOptionsPanel.add(new JLabel("Do you want full wax exterior? (yes/no)"));
        fullWaxExteriorCheckBox = new JCheckBox();
        washOptionsPanel.add(fullWaxExteriorCheckBox);
        return washOptionsPanel;
    }

    private JPanel createSessionPanel() {
        JPanel sessionPanel = new JPanel();
        sessionPanel.setLayout(new GridLayout(0, 2));

        sessionPanel.add(new JLabel("Enter wash session start time (e.g., 10:00 AM):"));
        startTimeField = new JTextField();
        sessionPanel.add(startTimeField);

        sessionPanel.add(new JLabel("Enter wash session expected end time (e.g., 11:00 AM):"));
        endTimeField = new JTextField();
        sessionPanel.add(endTimeField);

        sessionPanel.add(new JLabel("Enter wash session status (In Progress/Completed):"));
        statusField = new JTextField();
        sessionPanel.add(statusField);

        return sessionPanel;
    }

    private JButton createSubmitButton() {
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String street = streetField.getText();
                String city = cityField.getText();
                String state = stateField.getText();
                String zip = zipField.getText();
                String phone = phoneField.getText();
                String carPlate = carPlateField.getText();
                String workerName = workerNameField.getText();
                String workerID = workerIDField.getText();
                boolean rainCoating = rainCoatingCheckBox.isSelected();
                boolean fullWaxInterior = fullWaxInteriorCheckBox.isSelected();
                boolean fullWaxExterior = fullWaxExteriorCheckBox.isSelected();
                String startTime = startTimeField.getText();
                String endTime = endTimeField.getText();
                String status = statusField.getText();

                // Create the output string
                String output = "______________________________________________________________\n";
                
                output += "-----: Worker's In Charge :-----\n";
                output += "Worker's Name: " + workerName + "\n";
                output += "Worker's ID: " + workerID + "\n";
                output += "-----: Client :-----\n";
                output += "Client's Name: " + firstName + " " + lastName + "\n";
                output += "Client's Phone Number: " + phone + "\n";
                output += "Client's Car Plate Number: " + carPlate + "\n";
                output += "Wash Type: Basic Wash\n";
                output += "Rain Coating: " + rainCoating + "\n";
                output += "Full Wax Interior: " + fullWaxInterior + "\n";
                output += "Full Wax Exterior: " + fullWaxExterior + "\n";
                output += "-----: Wash Session :-----\n";
                output += "Session Start: " + startTime + "\n";
                output += "Session End: " + endTime + "\n";
                output += "Session Status: " + status + "\n";
                output += "______________________________________________________________\n";

                // Display the output in a text area
                JTextArea outputTextArea = new JTextArea(10, 40);
                outputTextArea.setEditable(false);
                outputTextArea.setText(output);

                // Add the text area to the frame
                frame.getContentPane().add(outputTextArea, BorderLayout.EAST);
                frame.pack();
            }
        });

        return submitButton;
    }

    public static void main(String[] args) {
        new GUI();
    }
}

       