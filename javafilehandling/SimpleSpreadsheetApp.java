import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSpreadsheetApp extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton clearButton;
    private JButton addRowButton;
    private JButton addColumnButton;

    public SimpleSpreadsheetApp() {
        setTitle("Simple Spreadsheet Application");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tableModel = new DefaultTableModel(10, 10);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        clearButton = new JButton("Clear");
        addRowButton = new JButton("Add Row");
        addColumnButton = new JButton("Add Column");

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearCells();
            }
        });

        addRowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addRow();
            }
        });

        addColumnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addColumn();
            }
        });

        buttonPanel.add(clearButton);
        buttonPanel.add(addRowButton);
        buttonPanel.add(addColumnButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void clearCells() {
        for (int row = 0; row < tableModel.getRowCount(); row++) {
            for (int col = 0; col < tableModel.getColumnCount(); col++) {
                tableModel.setValueAt("", row, col);
            }
        }
    }

    private void addRow() {
        tableModel.addRow(new Object[tableModel.getColumnCount()]);
    }

    private void addColumn() {
        tableModel.addColumn("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SimpleSpreadsheetApp app = new SimpleSpreadsheetApp();
                app.setVisible(true);
            }
        });
    }
}
