
package TodoApp.controler;

import TodoApp.model.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import util.ConnectionFactory;


public class TaskController {
    
    public void insert(Task task) {
        
    }
    
    public void alter(Task task) {
        
    }
    
    public void deleteById(int id) throws SQLException {
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException e) {
            throw new SQLException("Error ao deletar a task do ID " + id);
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
    } 
    
    public List<Task> select(int id) {
        
        return null;
        
    }
    
}
