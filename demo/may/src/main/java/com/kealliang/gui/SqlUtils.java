package com.kealliang.gui;

import com.alibaba.druid.sql.SQLUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author lsr
 * @ClassName SqlUtils
 * @Date 2019-05-03
 * @Desc
 * @Vertion 1.0
 */
public class SqlUtils {
    private JPanel rootPanel;
    private JTextArea sql;
    private JButton convert;
    private JTextArea result;
    private JTextArea param;
    private JButton format;

    public SqlUtils() {
        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = sql.getText();
                    String p = param.getText();
                    String r = sqlOut(s, p);
                    result.setText(r);
                } catch (Exception ex) {
                    // ignore
                }
            }
        });
        format.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s = sql.getText();
                    String r = result.getText();
                    sql.setText(SQLUtils.formatMySql(s));
                    result.setText(SQLUtils.formatMySql(r));
                } catch (Exception ex) {
                    // ignore
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sql参数工具");
        frame.setContentPane(new SqlUtils().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


    public String sqlOut (String inputSql, String parameterStr) {
        String exportSql = null; //导出sql
        try {
            exportSql = inputSql.trim();
            String [] parameters = parameterStr.split(",");
            for (String parameter : parameters) {
                if (parameter.contains("String")) {
                    exportSql = exportSql.replaceFirst("\\?", "'"+parameter.replace("(String)", "").trim()+"'");
                } else if (parameter.contains("Date")) {
                    exportSql = exportSql.replaceFirst("\\?", parameter.replace("(Date)", "").trim());
                } else if (parameter.contains("Long")) {
                    exportSql = exportSql.replaceFirst("\\?", parameter.replace("(Long)", "").trim());
                } else if (parameter.contains("Integer")) {
                    exportSql = exportSql.replaceFirst("\\?", parameter.replace("(Integer)", "").trim());
                } else if (parameter.contains("Timestamp")) {
                    exportSql = exportSql.replaceFirst("\\?", "to_date('"+parameter.replace("(Timestamp)", "").substring(0, 11).trim()+"','yyyy-MM-dd')");
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("输入的参数有误！");
        }
        return exportSql;
    }
}
