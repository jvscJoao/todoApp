/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TodoApp.view;

import TodoApp.controler.ProjectController;
import TodoApp.controler.TaskController;
import TodoApp.model.Project;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Joao
 */

public class MainScreen extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;
    DefaultListModel projectModel;
    
    public MainScreen() {
        initComponents();
        initDataController();
        initComponentsModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmptyList = new javax.swing.JPanel();
        emptyListIcon = new javax.swing.JLabel();
        emptyListTItle = new javax.swing.JLabel();
        emptyListSubTitle = new javax.swing.JLabel();
        jPanelTooBar = new javax.swing.JPanel();
        toobarTitle = new javax.swing.JLabel();
        tooBarSubTitle = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        projectsTitle = new javax.swing.JLabel();
        projectsIcon = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        tasksTitle = new javax.swing.JLabel();
        tasksIcon = new javax.swing.JLabel();
        jPanelProjectList = new javax.swing.JPanel();
        jScrollPaneProjects = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        EmptyList.setBackground(java.awt.Color.darkGray);
        EmptyList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        emptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        emptyListTItle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emptyListTItle.setForeground(new java.awt.Color(0, 153, 102));
        emptyListTItle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emptyListTItle.setText("Nenhuma tarefa por aqui :D");

        emptyListSubTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emptyListSubTitle.setForeground(new java.awt.Color(153, 153, 153));
        emptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emptyListSubTitle.setText("Clique no botão + para adicionar uma tarefa");

        javax.swing.GroupLayout EmptyListLayout = new javax.swing.GroupLayout(EmptyList);
        EmptyList.setLayout(EmptyListLayout);
        EmptyListLayout.setHorizontalGroup(
            EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EmptyListLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(emptyListSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(emptyListTItle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        EmptyListLayout.setVerticalGroup(
            EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyListLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(emptyListIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emptyListTItle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emptyListSubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanelTooBar.setBackground(new java.awt.Color(0, 153, 102));

        toobarTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        toobarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        toobarTitle.setText(" Todo App");

        tooBarSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tooBarSubTitle.setText("Anote tudo, não esqueça de nada");

        javax.swing.GroupLayout jPanelTooBarLayout = new javax.swing.GroupLayout(jPanelTooBar);
        jPanelTooBar.setLayout(jPanelTooBarLayout);
        jPanelTooBarLayout.setHorizontalGroup(
            jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTooBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toobarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tooBarSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTooBarLayout.setVerticalGroup(
            jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTooBarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(toobarTitle)
                .addGap(18, 18, 18)
                .addComponent(tooBarSubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelProjects.setBackground(new java.awt.Color(40, 40, 40));
        jPanelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        projectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectsTitle.setForeground(new java.awt.Color(0, 153, 102));
        projectsTitle.setText("Projetos");

        projectsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        projectsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectsIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectsTitle)
                .addGap(18, 18, 18)
                .addComponent(projectsIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectsIcon)
                    .addComponent(projectsTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTasks.setBackground(new java.awt.Color(40, 40, 40));
        jPanelTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tasksTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        tasksTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasksTitleMouseClicked(evt);
            }
        });

        tasksIcon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tasksIcon.setForeground(new java.awt.Color(0, 153, 102));
        tasksIcon.setText("Tarefas");

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tasksIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tasksTitle)
                .addContainerGap())
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTasksLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tasksIcon)
                    .addComponent(tasksTitle))
                .addGap(15, 15, 15))
        );

        jPanelProjectList.setBackground(new java.awt.Color(40, 40, 40));
        jPanelProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelProjectList.setForeground(new java.awt.Color(102, 102, 102));

        jListProjects.setBorder(null);
        jListProjects.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jListProjects.setForeground(new java.awt.Color(0, 0, 0));
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setFixedCellHeight(35);
        jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jScrollPaneProjects.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanelProjectListLayout = new javax.swing.GroupLayout(jPanelProjectList);
        jPanelProjectList.setLayout(jPanelProjectListLayout);
        jPanelProjectListLayout.setHorizontalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProjectListLayout.setVerticalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(50);
        jTable1.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTable1.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTooBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTooBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projectsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsIconMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
        
        projectDialogScreen.addWindowListener(new WindowAdapter()
        {
            public void windowClosed(WindowEvent e) {
                loadProjects();
            }
        });
    }//GEN-LAST:event_projectsIconMouseClicked

    private void tasksTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksTitleMouseClicked
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
        //taskDialogScreen.setProject(null);
        taskDialogScreen.setVisible(true);
    }//GEN-LAST:event_tasksTitleMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmptyList;
    private javax.swing.JLabel emptyListIcon;
    private javax.swing.JLabel emptyListSubTitle;
    private javax.swing.JLabel emptyListTItle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanelProjectList;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JPanel jPanelTooBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneProjects;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel projectsIcon;
    private javax.swing.JLabel projectsTitle;
    private javax.swing.JLabel tasksIcon;
    private javax.swing.JLabel tasksTitle;
    private javax.swing.JLabel tooBarSubTitle;
    private javax.swing.JLabel toobarTitle;
    // End of variables declaration//GEN-END:variables
    public void initDataController() {
        projectController = new ProjectController();
        taskController = new TaskController();
    }
    
    public void initComponentsModel() {
        projectModel = new DefaultListModel();
        loadProjects();
    }
    
    public void  loadProjects() {
        List<Project> projects = projectController.select();
        
        projectModel.clear();
        
        projects.stream()
            .forEach(project -> projectModel.addElement(project));
        jListProjects.setModel(projectModel);
    }
    
}
