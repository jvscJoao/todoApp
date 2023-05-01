
package TodoApp.controler;

import TodoApp.model.Task;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import util.ConnectionFactory;


public class TaskController {
    
    public void insert(Task task) throws SQLException {
        
        String sql = "INSERT INTO tasks (idProject, name, description, completed, notes, deadline, createdAt, updateAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection cn = null;
        PreparedStatement pt = null;
        
        try {
            cn = ConnectionFactory.getConnection();
            pt = cn.prepareStatement(sql);
            pt.setInt(1, task.getId());
            pt.setString(2, task.getName());
            pt.setString(3, task.getDescription());
            pt.setBoolean(4, task.isIsCompleted());
            pt.setString(5, task.getNotes());
            pt.setDate(6, new Date(task.getDeadline().getTime()));
            pt.setDate(7, new Date(task.getCreatedAt().getTime()));
            pt.setDate(8, new Date(task.getUpdatedAt().getTime()));
            pt.execute();
        } catch (Exception e) {
            throw new RuntimeException("Error ao salvar a tarefa " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(cn, pt);
        }
        
    }
    
    public void alter(Task task) {
        
    }
    
    public void deleteById(int id) throws SQLException {
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection cn = null;
        PreparedStatement pt = null;
        
        try {
            cn = ConnectionFactory.getConnection();
            pt = cn.prepareStatement(sql);
            pt.setInt(1, id);
            pt.execute();
        } catch (SQLException e) {
            throw new SQLException("Error ao deletar a task do ID " + id);
        } finally {
            ConnectionFactory.closeConnection(cn, pt);
        }
    } 
    
    public List<Task> select(int id) {
        
        return null;
        
    }
    
}
