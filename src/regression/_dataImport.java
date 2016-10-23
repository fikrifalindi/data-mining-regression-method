/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regression;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.function.Function2D;
import org.jfree.data.function.LineFunction2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.statistics.Regression;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import static regression._cramerules4x4.evaluateDeterminate;
import static regression._cramerules4x4.getDetVar;
import static regression._cramerules4x4.getDeterminate;
import static regression._cramerules4x4.getLinearSystem;
import style.FTable;

/**
 *
 * @author Fikri-Falndi
 */
public class _dataImport extends javax.swing.JFrame {

    /**
     * Creates new form _dataImport
     */
    public _dataImport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Cell - IHSG Predictor");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jToolBar1.setBackground(new java.awt.Color(245, 246, 247));
        jToolBar1.setRollover(true);
        jToolBar1.setPreferredSize(new java.awt.Dimension(100, 40));

        jButton1.setBackground(new java.awt.Color(245, 246, 247));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/document.png"))); // NOI18N
        jButton1.setToolTipText("New Dataset");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton3.setBackground(new java.awt.Color(245, 246, 247));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder.png"))); // NOI18N
        jButton3.setToolTipText("Open Dataset");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator3);

        jButton6.setBackground(new java.awt.Color(245, 246, 247));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);
        jToolBar1.add(jSeparator4);

        jButton4.setBackground(new java.awt.Color(245, 246, 247));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calculator.png"))); // NOI18N
        jButton4.setToolTipText("Calculate Data");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator5);

        jButton2.setBackground(new java.awt.Color(245, 246, 247));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toggle-expand-alt.png"))); // NOI18N
        jButton2.setToolTipText("Add Row");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton5.setBackground(new java.awt.Color(245, 246, 247));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toggle-collapse-alt.png"))); // NOI18N
        jButton5.setToolTipText("Remove Row");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" ", " ", " ", " ", null, null},
                {" ", " ", " ", " ", null, null},
                {" ", " ", " ", " ", null, null},
                {" ", " ", " ", " ", null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(new FTable());
        jTable1.getColumnModel().getColumn(1).setCellRenderer(new FTable());
        jTable1.getColumnModel().getColumn(2).setCellRenderer(new FTable());
        jTable1.getColumnModel().getColumn(3).setCellRenderer(new FTable());
        jTable1.getColumnModel().getColumn(4).setCellRenderer(new FTable());
        jTable1.getColumnModel().getColumn(5).setCellRenderer(new FTable());
        jTable1.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/document-s.png"))); // NOI18N
        jMenuItem1.setText("New Dataset");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder-s.png"))); // NOI18N
        jMenuItem2.setText("Open Dataset");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-s.png"))); // NOI18N
        jMenuItem6.setText("Start Page");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator6);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Run");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calculator-s.png"))); // NOI18N
        jMenuItem3.setText("Calculate");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        openData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            calcData();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Null value not allowed, Please check your dataset", "Error Dataset", JOptionPane.OK_OPTION);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        openData();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try{
            calcData();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Null value not allowed, Please check your dataset", "Error Dataset", JOptionPane.OK_OPTION);
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       newData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Object ob[] = {"","","","","",""};
        DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
        tableModel.addRow(ob);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        try{
            tableModel.removeRow(jTable1.getSelectedRow());
        } catch (Exception ex) {
            int row = tableModel.getRowCount();
            tableModel.removeRow(row-1);
//            JOptionPane.showMessageDialog(rootPane, "Please Select The Row", "Error remove row", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        int Q = JOptionPane.showConfirmDialog(rootPane, "Are You Sure?", null, JOptionPane.YES_NO_OPTION);
        
        if(Q == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public void newData(){
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        for(int i=tableModel.getRowCount()-1;i>=0;i--){
            tableModel.removeRow(i);
        }
        String head[] = {"Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"};
        String dt[][] = new String[30][6];
        tableModel = new DefaultTableModel(dt, head);
        jTable1.setModel(tableModel);
        for (int c = 0; c < head.length; c++) {
            jTable1.getColumnModel().getColumn(c).setCellRenderer(new FTable());
        }
    }
    
    public void openData(){
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                FileInputStream file = new FileInputStream(selectedFile.getPath());
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);
                Iterator<Row> rowIteratorCount = sheet.iterator();
                Iterator<Row> rowIteratorValue = sheet.iterator();
                int rowCount = 0, colCount = 0, rowValue = 0, colValue = 0;

                while (rowIteratorCount.hasNext()) {
                    Row row = rowIteratorCount.next();
                    Iterator<Cell> cellIteratorCount = row.cellIterator();
                    colCount = 0;
                    while (cellIteratorCount.hasNext()) {
                        Cell cell = cellIteratorCount.next();
                        colCount++;
                    }
                    rowCount++;
                }
                header = new String[colCount];
                dataValue = new String[rowCount - 1][colCount];

                while (rowIteratorValue.hasNext()) {
                    Row row = rowIteratorValue.next();
                    Iterator<Cell> cellIteratorValue = row.cellIterator();
                    colValue = 0;
                    while (cellIteratorValue.hasNext()) {
                        Cell cell = cellIteratorValue.next();
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_BOOLEAN:
                                if (rowValue == 0) {
                                    header[colValue] = String.valueOf(cell.getBooleanCellValue());
                                } else {
                                    dataValue[rowValue - 1][colValue] = String.valueOf(cell.getBooleanCellValue());
                                }
                                break;
                            case Cell.CELL_TYPE_NUMERIC:
                                if (rowValue == 0) {
                                    header[colValue] = String.valueOf(cell.getNumericCellValue());
                                } else {
                                    double cellVal = cell.getNumericCellValue();
                                    String dt = null;
                                    if (cellVal % 1 != 0) {
                                        dt = new DecimalFormat("#0.00##").format(cell.getNumericCellValue());
                                        dataValue[rowValue - 1][colValue] = dt;
                                    } else {
                                        dt = new DecimalFormat("#0").format(cell.getNumericCellValue());
                                        dataValue[rowValue - 1][colValue] = dt;
                                    }
                                }
                                break;
                            case Cell.CELL_TYPE_STRING:
                                if (rowValue == 0) {
                                    header[colValue] = String.valueOf(cell.getStringCellValue());

                                } else {
                                    dataValue[rowValue - 1][colValue] = String.valueOf(cell.getStringCellValue());
                                }
                                break;
                        }
                        colValue++;
                    }
                    rowValue++;
                }
                DefaultTableModel model = new DefaultTableModel(dataValue, header);
                jTable1.setModel(model);
                for (int c = 0; c < header.length; c++) {
                    jTable1.getColumnModel().getColumn(c).setCellRenderer(new FTable());
                }

                file.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(fileChooser, "File Not Found");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(fileChooser, "Wrong File Type Selected");
            }
        }
    }
    
    public void setData() {
        data = new double[4][5];

        int z = 1;
        data[0][0] = jTable1.getRowCount();
        for (int xVal = 3; xVal < 6; xVal++) {
            for (int yVal = 0; yVal < jTable1.getRowCount(); yVal++) {
                data[0][z] = data[0][z] + Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(yVal, xVal)));
                data[z][0] = data[z][0] + Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(yVal, xVal)));
            }
            z++;
        }

        int i = 1;
        for (int xn = 3; xn < 6; xn++) {
            int k = 1;
            for (int yn = 3; yn < 6; yn++) {
                for (int j = 0; j < jTable1.getRowCount(); j++) {
                    double xn1 = Double.parseDouble(String.valueOf(jTable1.getValueAt(j, xn)));
                    double xn2 = Double.parseDouble(String.valueOf(jTable1.getValueAt(j, yn)));
                    data[i][k] = data[i][k] + (xn1 * xn2);
                }
                k++;
            }
            i++;
        }

        int m = 1;
        for (int yVal = 3; yVal < 6; yVal++) {
            for (int yN = 0; yN < jTable1.getRowCount(); yN++) {
                double xn1 = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(yN, 2)));
                double xn2 = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(yN, yVal)));
                data[m][4] = data[m][4] + (xn1 * xn2);
            }
            m++;
        }

        for (int yVal = 0; yVal < jTable1.getRowCount(); yVal++) {
            data[0][4] = data[0][4] + Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(yVal, 2)));
        }
    }
    
    public void calcData(){
        setData();
        getReg();
        ujiF(x1Det, x2Det, x3Det, y1Det);
        calc.setLocationRelativeTo(null);
        calc.setVisible(true);
//        this.data1 = createSampleData1();
//        calc.jTabbedPane6.add("Normal", createChartPanel1());
    }
    
    public void getReg(){
        double[][] linearSystem = getLinearSystem();
        double[][] detD = getDeterminate(linearSystem);
        double detDReal = evaluateDeterminate(detD);

        if (detDReal == 0) {
            System.out.println();
            System.out.println("System has no distinct solution.");
            return;
        }

        double[] constants = new double[4];

        for (int r = 0; r < 4; r++) {
            constants[r] = linearSystem[r][4];
        }

        double[][] detX = getDetVar(detD, constants, 1); // 1 is the first column, the X's column
        double[][] detY = getDetVar(detD, constants, 2);
        double[][] detZ = getDetVar(detD, constants, 3);
        double[][] detA = getDetVar(detD, constants, 4);
        double detXReal = evaluateDeterminate(detX);
        double detYReal = evaluateDeterminate(detY);
        double detZReal = evaluateDeterminate(detZ);
        double detAReal = evaluateDeterminate(detA);
        x1Det = detXReal / detDReal;
        x2Det = detYReal / detDReal;
        x3Det = detZReal / detDReal;
        y1Det = detAReal / detDReal;

        String[][] coef = new String[4][2];
        coef[0][0] = String.valueOf("(Constant)");
        coef[1][0] = String.valueOf(header[3]);
        coef[2][0] = String.valueOf(header[4]);
        coef[3][0] = String.valueOf(header[5]);
        coef[0][1] = String.valueOf(new DecimalFormat("#0.0##").format(x1Det));
        coef[1][1] = String.valueOf(new DecimalFormat("#0.0##").format(x2Det));
        coef[2][1] = String.valueOf(new DecimalFormat("#0.0##").format(x3Det));
        coef[3][1] = String.valueOf(new DecimalFormat("#0.0##").format(y1Det));
        
        String[] headers = {"Model", "Beta"};
        DefaultTableModel coefModel = new DefaultTableModel(coef, headers);
        
        calc.jTable1.setModel(coefModel);
        for (int c = 0; c < 2; c++) {
            calc.jTable1.getColumnModel().getColumn(c).setCellRenderer(new FTable());
        }
        
        String analisis3 = "Analisis : \n"
                + "1. Nilai konstanta sebesar " + coef[0][1] + " menyatakan bahwa jika variabel independen dianggap konstan\n"
                + "    (nilainya tetap), maka tingkat IHSG sebesar Rp " + coef[0][1] + "\n"
                + "\n"
                + "2. Nilai koefisien regresi SBI sebesar " + coef[1][1] + ". Hal tersebut menunjukan jika terjadi penurunan satu\n"
                + "    satuan pada variabel SBI maka IHSG akan mengalami kenaikan sebesar " + (Double.parseDouble(coef[1][1]) * -1) + " satuan dengan\n"
                + "    asumsi bahwa variabel yang lain bernilai tetap.\n"
                + "\n"
                + "3. Nilai koefisien regresi INFLASI sebesar " + coef[2][1] + ". Hal tersebut menunjukkan jika terjadi kenaikan\n"
                + "    satu satuan  pada variabel INFLASI maka IHSG akan mengalami kenaikan sebesar " + coef[2][1] + " satuan\n"
                + "    dengan asumsi bahwa variabel yang lain bernilai tetap.\n"
                + "\n"
                + "4. Nilai koefisien regresi KURS Dollar sebesar " + coef[3][1] + ". Hal tersebut menunjukkan jika terjadi kenaikan\n"
                + "    satu satuan  pada variabel KURS Dollar maka IHSG akan mengalami kenaikan sebesar " + coef[3][1] + " dengan\n"
                + "    asumsi bahwa variabel yang lain bernilai tetap.";
        calc.jTextArea3.setText(analisis3);
        calc.constant   = Double.parseDouble(coef[0][1]);
        calc.sbi        = Double.parseDouble(coef[1][1]);
        calc.inflasi    = Double.parseDouble(coef[2][1]);
        calc.kurs       = Double.parseDouble(coef[3][1]);
        calc.lastIHSG   = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(jTable1.getRowCount() - 1, 2)));
        calc.lastMonth  = String.valueOf(String.valueOf(jTable1.getModel().getValueAt(jTable1.getRowCount()-1, 1)));
    }
    
    public void ujiF(double xDet, double yDet, double zDet, double aDet){
        
        DecimalFormat df = new DecimalFormat("#0.00#");
        int row = jTable1.getRowCount();
        int VSSr = data.length - 1;
        int VSSe = row - data.length;
        int VSSt = VSSr + VSSe;
        double SSt = 0, SSr = 0, SSe = 0, yVar = 0, MSr, MSe, F, RSqr, RadjS, R, e = 0, stdEst, et = 0, et2 = 0;
        
        for(int i=0;i<row;i++){
            double getVarY = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(i, 2)));
            yVar += getVarY;
        }
        
        double yMean = yVar/row;
        
        int indexX[] = new int[3];
        
        for(int i = 0;i < row;i++){    
            double getVarY = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(i, 2)));
            double x1 = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(i, 3)));
            double x2 = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(i, 4)));
            double x3 = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(i, 5)));
            double getAksY = xDet + (yDet * x1) + (zDet * x2) + (aDet * x3);
            SSr += Math.pow(getAksY - yMean,2);
            SSe += Math.pow(getVarY - getAksY,2);
            SSt += Math.pow(getVarY - yMean,2);
            e += Math.pow(getAksY - getVarY, 2);
            if(i>0){
                double getVarY2 = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(i-1, 2)));
                double x12 = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(i-1, 3)));
                double x22 = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(i-1, 4)));
                double x32 = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(i-1, 5)));
                double getAksY2 = xDet + (yDet * x12) + (zDet * x22) + (aDet * x32);
                et += Math.pow((getAksY2 - getVarY2) - (getAksY - getVarY), 2);
            }
        }
                
        MSr = SSr / VSSr;
        MSe = SSe / VSSe;
        F = MSr / MSe;
        RSqr = SSr / SSt;
        R = Math.sqrt(RSqr);
        RadjS = 1.0 - ((1.0 - RSqr) * ((row - 1.0)/(row - 3.0 - 1.0)));
        stdEst = Math.sqrt(e/(row-3-1));
        et2 = et/e;
        
        _ftable f = new _ftable();
        int df2 = 0;
        if(VSSe <= 110) df2 = 100;
        else if(VSSe < 135 ) df2 = 101;
        else if(VSSe <= 150) df2 = 102;
        else df2 = VSSe;
        double ftable = f.ftable(df2, VSSr);
        
        calc.jTable2.getModel().setValueAt("Regression", 0, 0);
        calc.jTable2.getModel().setValueAt("Residual", 1, 0);
        calc.jTable2.getModel().setValueAt("Total", 2, 0);
        calc.jTable2.getModel().setValueAt(df.format(SSr), 0, 1);
        calc.jTable2.getModel().setValueAt(df.format(SSe), 1, 1);
        calc.jTable2.getModel().setValueAt(df.format(SSt), 2, 1);
        calc.jTable2.getModel().setValueAt(VSSr, 0, 2);
        calc.jTable2.getModel().setValueAt(VSSe, 1, 2);
        calc.jTable2.getModel().setValueAt(VSSt, 2, 2);
        calc.jTable2.getModel().setValueAt(df.format(MSr), 0, 3);
        calc.jTable2.getModel().setValueAt(df.format(MSe), 1, 3);
        calc.jTable2.getModel().setValueAt(df.format(F), 0, 4);
        calc.jTable2.getModel().setValueAt(df.format(ftable), 0, 5);
        calc.jTable3.getModel().setValueAt(df.format(R), 0, 0);
        calc.jTable3.getModel().setValueAt(df.format(RSqr), 0, 1);
        calc.jTable3.getModel().setValueAt(df.format(RadjS), 0, 2);
        calc.jTable3.getModel().setValueAt(df.format(stdEst), 0, 3);
//        calc.jTable3.getModel().setValueAt(df.format(et2), 0, 4);
        
        double RadSqrt =  Double.parseDouble(df.format(RadjS));
        double Rs = Double.parseDouble(df.format(R));
        
        String analisis = null;
        if(F > ftable){
            analisis = "Analisis :\n"
                    + "Hasil perhitungan menunjukkan nilai FHitung > FTable.\n"
                    + "\nKesimpulan :\n"
                    + "Terdapat pengaruh yang signifikan antara nilai SBI, Laju Inflasi dan Kurs Dollar terhadap IHSG\nsecara simultan.";
        }else{
            analisis = "Analisis :\n"
                    + "Hasil perhitungan menunjukkan nilai FHitung < FTable.\n"
                    + "Kesimpulan :\n"
                    + "Tidak ada pengaruh yang signifikan antara nilai SBI, Laju Inflasi dan Kurs Dollar terhadap IHSG\nsecara simultan.";
        }
        String kuat = null;
        if(R > 50) kuat = "kuat";
        else if(R <= 50) kuat = "lemah";
        
        String analisis2 = "Analisis :\n"
                + "1. Hasil perhitungan menunjukkan nilai koefisien korelasi (R) sebesar " + Rs + " (" + df.format(Rs * 100) + "%). artinya nilai SBI,\n"
                + "    Inflasi dan Kurs Dollar berpengaruh " + kuat + " terhadap nilai IHSG.\n\n"
                + "2. Hasil perhitungan menunjukkan nilai koefisien determinasi (Adjusted R Square) sebesar " + RadSqrt + "..\n"
                + "    Artinya sebesar " + df.format(RadSqrt * 100) + "% nilai IHSG dipengaruhi oleh nilai SBI, Inflasi, dan Kurs Dollar. Sedangkan\n"
                + "    sisanya sebesar " + df.format(100 - (RadSqrt * 100)) + "% dipengaruhi oleh variabel/nilai lain.";
        calc.jTextArea1.setText(analisis);
        calc.jTextArea2.setText(analisis2);
        System.out.println(ftable);
    }

    private ChartPanel createChartPanel1() {

        // create plot...   
        NumberAxis xAxis = new NumberAxis("X");
        xAxis.setAutoRangeIncludesZero(false);
        NumberAxis yAxis = new NumberAxis("Y");
        yAxis.setAutoRangeIncludesZero(false);

        XYLineAndShapeRenderer renderer1 = new XYLineAndShapeRenderer(false,
                true);
        XYPlot plot = new XYPlot(this.data1, xAxis, yAxis, renderer1);

        // calculate the regression and create subplot 2...   
        double[] coefficients = Regression.getOLSRegression(this.data1, 0);
        Function2D curve = new LineFunction2D(coefficients[0], coefficients[1]);
        XYDataset regressionData = DatasetUtilities.sampleFunction2D(curve,
                0.0, jTable1.getModel().getRowCount(), 100, "Fitted Regression Line");

        plot.setDataset(1, regressionData);
        XYLineAndShapeRenderer renderer2 = new XYLineAndShapeRenderer(true,
                false);
        renderer2.setSeriesPaint(0, Color.blue);
        plot.setRenderer(1, renderer2);

        // create and return the chart panel...   
        JFreeChart chart = new JFreeChart("Linear Regression",
                JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        ChartPanel chartPanel = new ChartPanel(chart, false);
        return chartPanel;

    }
    
    public XYDataset createSampleData1() {

        double ihsg[] = new double[jTable1.getModel().getRowCount()];
        for(int i = 0; i<jTable1.getModel().getRowCount();i++){
            ihsg[i] = Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(i, 2)));
        }
        
//        double mean = 0;
//        System.out.println(ihsg.length);
//        for (int i = 0; i < ihsg.length; i++) {
//            mean = mean + ihsg[i];
//        }
//        double means = mean / ihsg.length;
        XYSeries series = new XYSeries("IHSG");

        for (int i = 0; i < ihsg.length; i++) {
//            double z = (ihsg[i] - means) / ihsg.length;
//            System.out.println(z);
            series.add(i, ihsg[i]);
        }

        XYDataset result = new XYSeriesCollection(series);
        return result;

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(_dataImport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_dataImport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_dataImport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_dataImport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _dataImport().setVisible(true);
            }
        });
    }

    private XYDataset data1; 
    double x1Det, x2Det, x3Det, y1Det;
    public static double[][] data;
    static String[] header;
    public String[][] dataValue;
    _calculation calc = new _calculation();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    public javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}