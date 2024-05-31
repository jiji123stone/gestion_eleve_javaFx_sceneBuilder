package Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Models.Eleve;
 

public class DAOEleve {
	private static Connection conn = ConxDB.getInstance();
	public static int save(Eleve e) {
		int s=0;
		try { 
		 String sql = "INSERT INTO eleve (idE,nom, prenom,date,niveau ) VALUES (?,?,?,?,?)";
		 Connection conn = ConxDB.getInstance();
		 PreparedStatement pstmt ;
		 
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, e.getId());
			pstmt.setString(2,  e.getNom());
		       
        	pstmt.setString(3,  e.getPrenom());
        	pstmt.setString(4,   e.getDate());
        	pstmt.setString(5,  e.getNiveau());
        	
        	s= pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		
		return s;
		
	}
	
	
	public static int UPDATE(Eleve e) {
		int s=0;
		try { 
		 String sql = "UPDATE   eleve SET nom=? , prenom=? , date=? , niveau=? WHERE idE=?";
		 Connection conn = ConxDB.getInstance();
		 PreparedStatement pstmt ;
		 
			pstmt=conn.prepareStatement(sql);
			//pstmt.setLong(1, e.getId());
			pstmt.setString(1,  e.getNom());
		       
        	pstmt.setString(2,  e.getPrenom());
        	pstmt.setString(3,   e.getDate());
        	pstmt.setString(4,  e.getNiveau());
        	pstmt.setInt(5, e.getId());
        	
        	s= pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return s;
		
	} 
	
	
	public static int DELETE(int e) {
		int s=0;
		try { 
		 String sql = " DELETE    FROM eleve   WHERE idE=?";
		 Connection conn = ConxDB.getInstance();
		 PreparedStatement pstmt ;
		 
			pstmt=conn.prepareStatement(sql);
			//pstmt.setLong(1, e.getId());
			 
        	pstmt.setInt(1, e);
        	
        	s= pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return s;
		
	}
	
	
	
	
	public static Eleve FIND(int id) {
		Eleve e=new Eleve();
		 try { String sql = " SELECT *  FROM eleve   WHERE idE=?";
		 Connection conn = ConxDB.getInstance();
		 PreparedStatement pstmt   ;
		 pstmt=conn.prepareStatement(sql);
		    
			pstmt.setInt(1, id); 
			ResultSet r=pstmt.executeQuery();
			if(r.next()) {
				e.setId(r.getInt(1));
				e.setNom(r.getString(2));
				e.setPrenom(r.getString(3));
				e.setDate(r.getString(4));
				e.setNiveau(r.getString(5));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 
		return e;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
    
    
/*	public static int save( Eleve  e) {
		int personneId = 0;
		PreparedStatement pstmt = null;
	    ResultSet rs = null;
        
        try {
            String sql = "INSERT INTO eleve (nom, prenom,date,niveau ) VALUES (?, ?,?,?)";
        	
        	pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        	
        	pstmt.setString(1,  e.getNom());
       
        	pstmt.setString(2,  e.getNom());
        	pstmt.setString(3,   e.getDate());
        	pstmt.setString(4,  e.getNiveau());
        	
        	pstmt.executeUpdate();
        	
            // 4- Recupérer l'Id généré par le SGBD
        	rs = pstmt.getGeneratedKeys();
            
            if(rs.next())
            	personneId = rs.getInt(1);
            
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return personneId;
	}*/
}
