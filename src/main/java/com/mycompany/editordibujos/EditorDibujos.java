
package com.mycompany.editordibujos;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class EditorDibujos {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Editor de Dibujos/ Parcial 2");
            Editor editor = new Editor();
            frame.add(editor);
            frame.pack();
            frame.setLocationRelativeTo(null); 
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            frame.setVisible(true);
        });
    }
}
