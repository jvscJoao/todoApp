
package TodoApp.controler;

import TodoApp.model.Project;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ConnectionFactory;

public class ProjectController {
    
    public void insert(Project project) throws SQLException {
        
        String sql = "INSERT INTO projects (name, description, createdAt, updatedAT) VALUES (?, ?, ?, ?);";
        Connection cn = null;
        PreparedStatement ps = null;
        
        try {
            cn = ConnectionFactory.getConnection();
            ps = cn.prepareStatement(sql);
            ps.setString(1, project.getName());
            ps.setString(2, project.getDescription());
            ps.setDate(3, new Date(project.getCreatedAt().getTime()));
            ps.setDate(4, new Date(project.getUpdatedAt().getTime()));
        } catch (SQLException e) {
            throw new SQLException("Error ao inserir o projeto", e);
        } finally {
            ConnectionFactory.closeConnection(cn, ps);
        }
    }
    
    public void alter(Project project) throws SQLException {
        
        String sql = "UPDATE projects SET name = ?, description = ?, createdAt = ?, updatedAt = ? WHERE id = ?";
        
        Connection cn = null;
        PreparedStatement ps = null;
        
        try {
            cn = ConnectionFactory.getConnection();
            ps = cn.prepareStatement(sql);
            ps.setString(1, project.getName());
            ps.setString(2, project.getDescription());
            ps.setDate(3, new Date(project.getCreatedAt().getTime()));
            ps.setDate(4, new Date(project.getUpdatedAt().getTime()));
            ps.setInt(5, project.getId());
        } catch (SQLException e) {
            throw new SQLException("Error ao alterar o projeto!", e);
        } finally {
            ConnectionFactory.closeConnection(cn, ps);
        }
        
    }
    
    public void delete(int id) throws SQLException {
        
        String sql = "DELETE FROM projects WHERE id = ?";
        Connection cn = null;
        PreparedStatement ps = null;
        try {
            cn = ConnectionFactory.getConnection();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
        } catch (SQLException e) {
            throw new SQLException("Error ao delatar o projeto", e);
        } finally {
            ConnectionFactory.closeConnection(cn, ps);
        }
        
    }
    
    public List<Project> select() throws SQLException {
        String sql = "SELECT * FROM projects";
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Project> project = new ArrayList<>();
                
        
        try {
            cn = ConnectionFactory.getConnection();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                Project p = new Project();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setDescription(rs.getString("description"));
                p.setCreatedAt(rs.getDate("createdAt"));
                p.setUpdatedAt(rs.getDate("updatedAt"));
                project.add(p);
            }
        } catch (SQLException e) {
            throw new SQLException("Error ao listar os projetos", e);
        } finally {
            ConnectionFactory.closeConnection(cn, ps, rs);
        }
        return project;   
    }
    
    public Project selectById(int id) throws SQLException {
        String sql = "SELECT * FROM projects WHERE id = ?";
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Project p = null;
        try {
            cn = ConnectionFactory.getConnection();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                p = new Project();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setDescription(rs.getString("description"));
                p.setCreatedAt(rs.getTimestamp("createdAt"));
                p.setUpdatedAt(rs.getTimestamp("updatedAt"));
            }
        } catch (SQLException e) {
            throw new SQLException("Error ao achar projeto com id " + id, e);
        } finally {
            ConnectionFactory.closeConnection(cn, ps, rs);
        }
        return p;
    }
    
}
