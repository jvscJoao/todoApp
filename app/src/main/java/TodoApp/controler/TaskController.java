
package TodoApp.controler;

import TodoApp.model.Task;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            pt.setInt(1, task.getIdProject());
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
    
    public void alter(Task task) throws SQLException {
        String sql = "UPDATE tasks SET idProject = ?, name = ?, description = ?, notes = ?, completed = ?, deadline = ?, createdAt = ?, updatedAt = ? WHERE id = ?";
        
        Connection cn = null;
        PreparedStatement pt = null;
        
        try {
            cn = ConnectionFactory.getConnection();
            pt = cn.prepareStatement(sql);
            pt.setInt(1, task.getIdProject());
            pt.setString(2, task.getName());
            pt.setString(3, task.getDescription());
            pt.setString(4, task.getNotes());
            pt.setBoolean(5, task.isIsCompleted());
            pt.setDate(6, new Date(task.getDeadline().getTime()));
            pt.setDate(7, new Date(task.getCreatedAt().getTime()));
            pt.setDate(7, new Date(task.getUpdatedAt().getTime()));
            pt.setInt(9, task.getId());
            pt.execute();
        } catch (SQLException e) {
            throw new SQLException("Aconteceu um error ao atualizar os dados da tarefa", e);
        } finally {
            
        }
    }
    
    public void delete(int id) throws SQLException {
        
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
    
    public List<Task> select(int id) throws SQLException{
        
        String sql = "SELECT * FROM tasks where idProject = ?";
        
        Connection cn = null;
        PreparedStatement pt = null;
        ResultSet rs = null;
        List<Task> tasks = new ArrayList<Task>();
        
        try {
            cn = ConnectionFactory.getConnection();
            pt = cn.prepareStatement(sql);
            pt.setInt(1, id);
            //Retorna uma tabela vinda do DB.
            rs = pt.executeQuery();
            
            while(rs.next()) {
                Task task = new Task();
                task.setId(rs.getInt("id"));
                task.setIdProject(rs.getInt("idProject"));
                task.setName(rs.getString("name"));
                task.setDescription(rs.getString("description"));
                task.setNotes(rs.getString("notes"));
                task.setIsCompleted(rs.getBoolean("completed"));
                task.setDeadline(rs.getDate("deadline"));
                task.setCreatedAt(rs.getDate("createdAt"));
                task.setUpdatedAt(rs.getDate("updatedAt"));
                tasks.add(task);
            }
        } catch (SQLException e) {
            throw new SQLException("Error ao lista as tarefas", e);
        } finally {
            ConnectionFactory.closeConnection(cn, pt, rs);
        }
        return tasks;
    }
    
}
