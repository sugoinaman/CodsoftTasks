package com.example.task3;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class WordCountGUI {
    private TextArea textArea;
    private Button countButton;
    private Label resultLabel;
    private VBox layout;

    public WordCountGUI() {
        textArea = new TextArea();
        textArea.setPromptText("Enter your text or provide a file path...");

        countButton = new Button("Count Words");
        countButton.setOnAction(e -> countWords());

        resultLabel = new Label();

        layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(textArea, countButton, resultLabel);
    }

    public VBox getMainLayout() {
        return layout;
    }

    private void countWords() {
        String inputText = textArea.getText();
        String[] words = inputText.split("[\\s.,;!?()\"']+");
        int wordCount = words.length;

        resultLabel.setText("Total word count: " + wordCount);
    }
}
